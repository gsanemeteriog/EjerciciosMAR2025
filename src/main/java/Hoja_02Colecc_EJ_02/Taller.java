/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja_02Colecc_EJ_02;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author DAW104
 */
public class Taller {
    
    private LinkedList<FichaVehiculo> enEspera, reparados, finalizados;
       
    //Métodos
    //Constructor o constructores necesarios para crear un objeto de tipo Taller    
    public Taller(){
        this.enEspera = new LinkedList<>();
        this.reparados = new LinkedList<>();
        this.finalizados = new LinkedList<>();
    }

    //Método insertarVehiculo, que recibe la ficha de un vehículo, establece la hora de entrada 
    //y lo añade a la lista correspondiente (EnEspera). 
    
    public void insertarVehiculo(FichaVehiculo ficha){
        
        //La hora se pone automáticamente porque está en el constructor
        //Pedro hace sin más enEspera.add(ficha); yo copio lo del EJ 04 de la Hoja02 el anterior
        
        if (enEspera.add(ficha)) {
            System.out.println("Vehiculo agregado a la lista de espera.");
            
        }else{
            System.out.println("Error al introducir el vehiculo en la lista cola de espera.");
        } 
    }

    //Método repararVehiculo, que recibe la matrícula, establece la hora de reparación 
    //y lo mueve de la lista EnEspera a la lista Reparados 
    //Empezamos a hacerlo con for each, así:
    //      for (FichaVehiculo vehiculo : enEspera) {
    //            if (vehiculo.getMatricula().equalsIgnoreCase(matricula)) {
    //                
    //            }
    //        }

    //Pero Pedro lo hace con Iterator porque nos va a hacer falta
    //Iterator recorre todos los vehículos en la lista
    
    public void repararVehiculo(String matricula){
        LocalDateTime fechaHoy = LocalDateTime.now();
        
        Iterator <FichaVehiculo> it = enEspera.iterator();
        while(it.hasNext()){ //mientras tenga siguiente
            FichaVehiculo v = it.next();
            if (v.getMatricula().equals(matricula)) { //Para cada fichaVehiculo en la lista, compara matrícula
                v.setFechaReparacion(fechaHoy);
                this.reparados.add(v);
                it.remove(); //elimina el vehículo que estaba en el iterador               
            }
        }
    }
    
    //Método darSalidaVehiculo, que recibe la matrícula del vehículo, 
    //establece la hora de salida y lo añade a la lista de Finalizados 
    
    public void darSalidaVehiculo(String matricula){
        //LocalDateTime fechaHoy = LocalDateTime.now();
        //Omito esto para ponerlo directamente abajo
        
        Iterator <FichaVehiculo> it = reparados.iterator();
        while(it.hasNext()){
            FichaVehiculo v = it.next();
            if (v.getMatricula().equals(matricula)) { 
                v.setFechaSalida(LocalDateTime.now()); //Aquí lo pongo directamente en lugar de crear 'fechaHoy'
                //para ver que sería lo mismo
                this.finalizados.add(v);
                it.remove();                
            }
        }
        
    }   

    //Método mostrarEstado que devuelve una cadena con información de cada una de las listas. 
    public String mostrarEstado() {
        String cadena = "--- Informacion de vehiculos en el taller ---\n";

        if (!enEspera.isEmpty()) {
            for (FichaVehiculo f : enEspera) {
                cadena += f.toString() + "\n";
            }
        } else {
            cadena += "\nLa lista de espera esta vacia.\n";
        }

        if (!reparados.isEmpty()) {
            for (FichaVehiculo f : reparados) {
                cadena += f.toString() + "\n";
            }
        } else {
            cadena += "\nLa lista de vehiculos reparados esta vacia.\n";
        }

        if (!finalizados.isEmpty()) {
            for (FichaVehiculo f : finalizados) {
                cadena += f.toString() + "\n";
            }
        } else {
            cadena += "\nLa lista de vehiculos finalizados esta vacia.\n";
        }

        return cadena;

    }

}
