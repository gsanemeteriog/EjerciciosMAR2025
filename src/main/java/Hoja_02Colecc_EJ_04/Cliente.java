/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja_02Colecc_EJ_04;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author DAW104
 */
public class Cliente {
    private String nombre;
    private String movil;
    private LocalDateTime fechaEntrada;
    private LocalDateTime fechaAtencion;

    public Cliente(String nombre, String movil) {
        this.nombre = nombre; //VALIDAR
        this.movil = movil;
        this.fechaEntrada = fechaEntrada; //VALIDAR
        //NO PONE FECHA ATENCIÓN PORQUE NO PODEMOS SABER A QUÉ HORA VA A SER ATENDIDO
        //YA QUE VAMOS A HACER UNA COLA
    }
    
    //Getter y setter, Pedro elige sólo de las fechas

    public LocalDateTime getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDateTime fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDateTime getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(LocalDateTime fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }
        
    @Override
    public String toString(){
        String fechaAtencionCadena = "";
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
        if (fechaAtencion != null) { //Porque puede que aún no le hayan atendido
            fechaAtencionCadena = " , Fecha de atencion: " + fechaAtencion.format(formato);
        }
        
        
        return "{" + " Nombre: " + nombre + ", Movil: " + movil + ", Fecha de Entrada: " 
                + fechaEntrada.format(formato) + fechaAtencionCadena + "}";
    }
        
}
