/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja_03Colecc_EJ_04;

import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 *
 * @author DAW104
 */
public class Carrera {
    
    //Atributos: una colección que no permita duplicados según dorsal del atleta 
    //y mantenga el orden de inserción 
    
    private LinkedHashSet<Atleta> atletas;
    
    //Métodos: 
    
    //Un constructor que crea la colección
    public Carrera(){
        this.atletas = new LinkedHashSet();
        
    }    
        
    //Métodos para menú repetitivo (en main)
    
    //Añadir un atleta
    
    public void insertarAtleta(Atleta atleta){
        if (atletas.add(atleta)) {
            System.out.println("Atleta agregado correctamente a la lista.");
        }else{
            System.out.println("Error al introducir al atleta en la lista.");
        }
                
    }

    //Tiempo medio por todos los 
    public double tiempoMedio() {
        double aux = 0;

        if (atletas.isEmpty()) {
            System.out.println("La lista de atletas esta vacía.");
            return 0; 
        } else {
            for (Atleta atleta : atletas) {
                aux += atleta.getTiempo();
            }
            return aux / atletas.size(); // Solo se ejecuta si atletas no está vacío
        }
    }


    //Dar la vuelta a los atletas de la coleccion metiéndolso en una pila
    //se les saca de la colección y vamos sacando uno a uno de la pila
    //y metiéndolos en nuestra colección
    public void darLaVuelta() {
        LinkedList<Atleta> pila = new LinkedList<>();

        if (atletas.isEmpty()) {
            System.out.println("La lista de atleta esta vacia.");
        } else {
            pila.addAll(atletas); //Tengo una copia exacta
            atletas.clear(); //Vaciamos la lista

            //Ahora les irá metiendo al revés en la lista
            //Porque vaciamos la pila en su orden natural, que es el inverso al de la lista
            //Y según se vacía la pila se va agregando a la lista en el orden inverso
            //Que es el que queremos
            while (!pila.isEmpty()) {
                atletas.add(pila.pollLast()); //Coge el último de la cola y lo elimina
                //Así se eliminan los elementos en orden inverso al que fueron agregados

            }

        }


        
    }
    
    
    //Mostrar la info
    
    public String mostrar(){
        String cadena = "";
        
        for (Atleta atleta : atletas) {
            cadena += atleta.toString() + "\n";
        }
        return cadena;       
        
        
    }
    
    
    
}
