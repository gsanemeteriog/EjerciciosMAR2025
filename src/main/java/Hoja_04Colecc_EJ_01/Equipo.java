/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja_04Colecc_EJ_01;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author DAW104
 */
public class Equipo {

    private SortedSet<Jugador> miEquipo;

    //Métodos:
    //Constructor 
    public Equipo() {
       miEquipo = new TreeSet();
    }
    
    //Insertar un jugador en el equipo
    
    public void insertar(Jugador jugador){
        
        if (miEquipo.add(jugador)) {
            System.out.println("Jugador insertado correctamente.");
        }else{
            System.out.println("No se ha podido insertar al jugador.");
        }        
        
    }
    
    //Dar de baja un jugador por nombre con Iterator   
    
    public void borrar(String nombre){
        Iterator<Jugador> it = miEquipo.iterator();
        while(it.hasNext()){
            Jugador jugador = it.next();
            if (jugador.getNombre() != null && jugador.getNombre().equalsIgnoreCase(nombre)) {
                it.remove();
            }
                
    }
    
}
    //Otro método para borrar un jugador, con For-Each
    //El for-each si falla al borrar podría dar una excepción
    public void borrar2(String nombre){
        Jugador jugadorAEliminar = null;
        
        for (Jugador jugador : miEquipo) {
            if (jugador.getNombre() != null && jugador.getNombre().equalsIgnoreCase(nombre)) {
                jugadorAEliminar = jugador;
                break;                
            }
        }
        
        if (jugadorAEliminar != null) {
            miEquipo.remove(jugadorAEliminar);
        }
        
    }
    
    //Otro método borrar, con funciones lambda: Stream
    public void borrarStream(String nombre){
        miEquipo.removeIf(jugador -> jugador.getNombre() != null && jugador.getNombre().equals(nombre));
       
    }
    
    //Mostrar
    public String mostrar(){
        String cadena = "";
        
        for (Jugador jugador : miEquipo) {
            cadena += jugador.toString();
        }
        
        return cadena;
    }
    
    //Método que devuelve el jugador más alto
    //Están ordeandos por altura, con lo que podríamos coger el último y ya
    //Pero Pedro quiere hacer varias comprobaciones:
    //Por ejemplo comprobar si está vacía la colección, algo que mirará siempre
    //Aquí con iterator
    public Jugador jugadorMasAlto() {
        Iterator<Jugador> it = miEquipo.iterator();
        Jugador jugadorM = null;

        if (it.hasNext()) {
            jugadorM = it.next();
        }

        while (it.hasNext()) {
            Jugador aux = it.next();
            if (jugadorM.getEstatura() < aux.getEstatura()) {
                jugadorM = aux;
            }
        }

        return jugadorM;

    }

    //Aquí sin más mirando si es empty y después devolviendo miEquipo.last()
    //Que será el más alto porque está ordenado por altura de la manera natural
    //Que es ascendente
    public Jugador jugadorMasAltoSencillo() {
        if (miEquipo.isEmpty()) {
            return null;
        }

        return miEquipo.last();

    }
    
    //Lo hacemos directamente como el sencillo
    public Jugador jugadorMasBajo(){
        if (miEquipo.isEmpty()) {
            return null;
        }
        
        return miEquipo.first();
        
    }
    
    //Método que devuelva una SortedSet con los jugadores de más de 2 metros
    public SortedSet<Jugador> jugadores2metros(){
        
        if (miEquipo.isEmpty()) {
            return new TreeSet<>(); //Un conjunto vacío
        }
        
        return miEquipo.tailSet(new Jugador("jugador_alto", 2.00));
        
    }

    
    
}
