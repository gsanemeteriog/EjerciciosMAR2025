/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja_02Colecc_EJ_04;

import java.time.LocalDateTime;

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
    
    //MÉTODOS
    
    //añadir un cliente 

    //atender a un cliente 

    //obtener el tiempo medio de espera de los clientes que aún no han sido atendidos 

    //obtener el tiempo medio de espera de los clientes ya atendidos 

    //mostrar los clientes indicando los que hay en la cola de espera y los que están atendidos 



    
}
