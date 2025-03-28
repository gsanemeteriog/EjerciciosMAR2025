/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja_03Colecc_EJ_05;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author DAW104
 */
public class Tienda {
    //una colección de publicaciones que no permita duplicados según título y autor de la publicación y mantenga el orden.
    //Lo vamos a hacer con Set - > LinkedHashSet
    private Set<Publicacion> publicaciones;
    
    //Métodos:
    
    //Constructor 
    
    public Tienda(){
        this.publicaciones = new LinkedHashSet();
                
    }

    //Insertar publicación 
    public void insertarAtleta(Publicacion publicacion){
        if (publicaciones.add(publicacion)) {
            System.out.println("Publicacion agregada correctamente a la lista.");
        }else{
            System.out.println("Error al introducir la publicacion en la lista.");
        }
                
    }

    //Borrar publicación
    public void borrarPublicacion(String titulo, String autor) {
        Iterator<Publicacion> it = publicaciones.iterator();
        while (it.hasNext()) {
            Publicacion publicacion = it.next();
            if (publicacion.titulo.equalsIgnoreCase(titulo) && publicacion.autor.equalsIgnoreCase(autor)) {
                it.remove(); // Usa el método del Iterator para eliminar de forma segura
            }
        }
    }


    //Método mostrar que devuelva una cadena con todos los datos de libros y discos de la tienda 
    
    public String mostrar(){
     String cadena = "--- Informacion de libros y discos en la tienda ---\n";   
        
        if (!publicaciones.isEmpty()) {
            for (Publicacion p : publicaciones) {
                cadena += p.toString() + "\n";
                
            }
        }else{
            cadena += "\nLa lista de libros y discos esta vacia.";
        }
        
        
        
        return cadena;
     
    }

    //Método mayor que devuelva el disco de más larga duración 

    //Método novedades que devuelva una colección List de libros que hayan sido editados en el mes en curso y que tenga más de 400 páginas 
    //Por ejemplo ArrayList
    
    public void colecciones(){
        
        
        
        
    }
    
    
}
