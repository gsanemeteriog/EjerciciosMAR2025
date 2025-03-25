/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja_02Colecc_EJ_04;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author DAW104
 */
public class Servicio {
    private Queue<Cliente> enEspera;
    //Necesitamos una lista a la que pasan los que salen de la cola
    private List<Cliente> atendidos;
    
    //Creamos las colecciones
   
    public Servicio() {
        this.enEspera = new LinkedList<>();
        this.atendidos = new ArrayList();
    }
    
    //MÉTODOS
    
    //Añadir un cliente a la cola de espera    
    public void insertar(Cliente cliente){
        if (enEspera.add(cliente)) {
            System.out.println("Cliente en espera correctamente.");
        }else{
            System.out.println("Error al introducir el cliente en la cola de espera.");
        }        
    }

    //Atender a un cliente. Pasa de la cola de espera a la lista de atendidos
    public void atender(){
        Cliente cliente = enEspera.poll();
        cliente.setFechaAtencion(LocalDateTime.now());
        if (atendidos.add(cliente)) {
            System.out.println("Cliente atendido: " + cliente.toString());            
        }else{
            System.out.println("Error. Cliente no registrado como atendido.");
        }
        
    }

    //obtener el tiempo medio de espera de los clientes que aún no han sido atendidos
    
    public double tiempoEsperaNoAtendidos(){
        double tiempo = 0;
        LocalDateTime fechaHoy = LocalDateTime.now();
        
        //Verificamos que enEspera.size() sea mayor que cero, que si no da NaN
        if (!enEspera.isEmpty()) { //o si enEspera.size() es cero
            for (Cliente c : enEspera) {
            tiempo += ChronoUnit.SECONDS.between(c.getFechaEntrada(), fechaHoy);
        }
            return tiempo / enEspera.size();
        }else{
            System.out.println("No hay datos para mostrar.");
            return 0;
        }
                
        
    }

    //obtener el tiempo medio de espera de los clientes ya atendidos 
    
    public double tiempoEsperaAtendidos(){
        double tiempo = 0;
        
        if (!atendidos.isEmpty()) {
            for (Cliente c : atendidos) {
            tiempo += ChronoUnit.SECONDS.between(c.getFechaEntrada(), c.getFechaAtencion());
        }
            return tiempo / atendidos.size();
        }else{
            System.out.println("No hay datos para mostrar.");
            return 0;
        }
        
    }

    //mostrar los clientes indicando los que hay en la cola de espera y los que están atendidos
    
    public String mostrar(){
        String cadena = "Clientes en Espera: ";
        
        for (Cliente c : enEspera) {
            cadena += c.toString() + "\n";                       
        }
        cadena+= "Clientes Atendidos: \n";
        for (Cliente c : atendidos) {
                cadena += c.toString() + "\n";
            }        
        return cadena;
    }

    
    
    
}
