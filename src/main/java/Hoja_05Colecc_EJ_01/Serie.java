/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja_05Colecc_EJ_01;

import java.util.HashMap;
import java.util.Objects;

/**
 *
 * @author DAW104
 */
public class Serie {
    //Capítulos: hashmap que contiene una descripción de capítulos, 
    
    private String nombre; //Entre 4 y 25 caracteres
    private Tematica tematica;
    private String nacionalidad;
    private boolean finalizada; //Si está finalizada o no
    private int temporada; //
    private HashMap<String, Capitulo> capitulos;
    
    //Creamos constructor. capitulos es un HashMap y no irá como parámetro
    
    public Serie(String nombre, Tematica tematica, String nacionalidad, boolean finalizada, int temporada){
        this.nombre = nombre;
        this.tematica = tematica;
        this.nacionalidad = nacionalidad;
        this.finalizada = finalizada;
        this.temporada = temporada;
        capitulos = new HashMap<>();
    }    
        
    //Al ser pares clave/valor descripción/Capítulo no puede haber repetidos en el HashMap
    //El caso más genérico suele ser String o número y un objeto, por ejemplo:
    //Número identificador y un objeto Alumno
    
    
    

    //Get de nacionalidad y temática que es lo que nos piden. Añadimos nombre que hace falta
    public Tematica getTematica() {
        return tematica;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    //Método para generar una clave
    //la clave de cada capítulo será “los cuatro primeros caracteres del 
    //nombre en mayúsculas + número de temporada + “X” + número de capítulo”.
    //Por ejemplo, si el nombre de la serie es Sopranos, el séptimo capítulo 
    //de la primera temporada, su clave será “Sopr01X07” 
    //(delante de los números del 1 al 7 tiene que tener un 0). 
    //El número válido de capítulos es entre 1 y 30.
    public static String generarClaveCapitulo(String nombre, int temporada, int capitulo){
        String clave = "";
        clave += nombre.substring(0, 4).toUpperCase() 
                + String.format("%02d", temporada) + "X" + String.format("%02d", capitulo);
        
        
        return clave;
    }
    
    //Método para añadir un capítulo al HashMap
    public void insertarCapitulo(String clave, Capitulo capitulo){
        if (capitulos.containsKey(clave)) { //Para ver si ya está
            System.out.println("El capitulo ya existe.");
        }else{
            capitulos.put(clave, capitulo);
        }
        
    }
    
    //Método para eliminar un capítulo
    public void eliminaCapitulo(String clave){
        if (capitulos.containsKey(clave)) {
            capitulos.remove(clave);
            System.out.println("Capitulo eliminado.");
        }else{
            System.out.println("El capitulo no existe.");
        }
       
    }
    
    //Método para visualizar los capítulos
    public void visualizaCapitulos(){
        System.out.println(capitulos.entrySet().toString());
        //entrySet() devuelve los pares clave/valor de un HashMap
        //Nota de Pedro: comprobar si está vacía y un for es una apuesta segura
        
        
            
        }
    
    public void visualizaConForEach(){
        if (capitulos.isEmpty()) {
            System.out.println("Está vacía");
        }else{
            for (String clave: capitulos.keySet()) {
                System.out.println("Clave: " + clave + ", Valor: " + capitulos.get(clave));
            }
        }
    }
    
    
  //toString básico por ir rápido

    @Override
    public String toString() {
        return String.format("Serie: \nNombre: %s \nTematica: %s \nNacionalidad: %s \nFinalizada: %b \nTemporada: %d", 
                nombre, tematica, nacionalidad, finalizada, temporada);
                
    
    
    }
    

    
    
    

    
   
    

    
    
    
}
