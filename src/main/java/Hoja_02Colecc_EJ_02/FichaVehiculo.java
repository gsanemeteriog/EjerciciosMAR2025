/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja_02Colecc_EJ_02;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author DAW104
 */
public class FichaVehiculo {
    
    private LocalDateTime fechaEntrada;
    private LocalDateTime fechaReparacion;
    private LocalDateTime fechaSalida;
    private String modelo;
    private String matricula;
    
    //Constructor, ponemos sólo modelo y matrícula porque las fechas serán según van sucediendo.

    public FichaVehiculo(String modelo, String matricula) {               
        this.modelo = modelo;
        this.matricula = matricula;
        this.fechaEntrada = LocalDateTime.now();  //La fecha de entrada es en cuanto se crea la ficha
    }
    
    //Gets y sets, los que creemos que nos pueden hacer falta

    public String getMatricula() {
        return matricula;
    }

    public void setFechaReparacion(LocalDateTime fechaReparacion) {
        this.fechaReparacion = fechaReparacion;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    
    //toString
    //Ya que vamos a tener coches en distintas situaciones (que aún no estén reparados, o que no hayan salido, etc)
    //Es decir, la fechaEntrada siempre va a existir, pero reparacion y salida pueden estar a null
    @Override
    public String toString() {
        String fechaReparacionCadena="", fechaSalidaCadena="";
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
        
        if (fechaReparacion != null) {
            fechaReparacionCadena = "\nFecha de reparacion: " + fechaReparacion.format(formato);
        }
        
        if (fechaSalida != null) {
            fechaSalidaCadena = "\nFecha de salida: " + fechaSalida.format(formato);
            
        }
        
        return "FichaVehiculo: " + "\nFecha de entrada: " + fechaEntrada.format(formato) 
                + fechaReparacionCadena + fechaSalidaCadena + "\nModelo: " + modelo + "\nMatricula: " + matricula + '.';
    }
    
    
}
