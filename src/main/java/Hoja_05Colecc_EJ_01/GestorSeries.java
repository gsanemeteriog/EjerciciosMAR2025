/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja_05Colecc_EJ_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author DAW104
 */
public class GestorSeries {
    //Clase GestorSeries que está formada por un atributo 
    //que es una colección de objetos de serie y los métodos siguientes: 
    private List<Serie> series;
    
    public GestorSeries(){
        series = new ArrayList<>();
        
    }
    
    //Comprobamos si la serie existe
    
    public Serie existeSerie(String nombre){
        for (Serie serie : series) {
            if (serie.getNombre().equalsIgnoreCase(nombre)) {
                return serie;
            }
        }
        
        return null;       
        
    }
    
    //
    public void crearSerie(){
        String nombre = Entrada.pedirNombre();
        if (existeSerie(nombre)== null) {
            String nacionalidad = Entrada.pedirNacionalidad();
            Tematica tematica = Entrada.pedirTematica();
            int temporadas = Entrada.pedirTemporada();
            boolean finalizada = Entrada.pedirFinalizada();
            Serie serie = new Serie(nombre, tematica, nacionalidad, finalizada, temporadas);
            series.add(serie);
            System.out.println("Serie agregada.");
        }else{
            System.out.println("La serie ya existe.");
        }
        
        
    }
    
    public void eliminarSerie(){
        boolean borrada = false;
        
        String nombre = Entrada.pedirNombre();
        Iterator<Serie> it = series.iterator();
        while(it.hasNext()){
            if (it.next().getNombre().equalsIgnoreCase(nombre)) {
                it.remove();
                borrada = true;
                break;
            }
        }
        
        if (borrada) {
            System.out.println("Serie borrada correctamente.");
        }else{
            System.out.println("La serie " + nombre + " no existe.");
        }
    }
    
    public void crearCapitulo(){
        
        //Creo un objeto serie porque tengo que ver si la serie a la que
        //quiero meter el capítulo existe
        Serie serie;
        String nombre = Entrada.pedirNombre();
        //Vemos si existe
        serie = existeSerie(nombre);
        if (serie != null) {
            int numCap = Entrada.pedirNumeroCapitulo();
            int numTem = Entrada.pedirTemporada();
            String descripcion = Entrada.pedirDescripcion();
            
            Capitulo capitulo = new Capitulo(numTem, numCap, descripcion);
            serie.insertarCapitulo(Serie.generarClaveCapitulo(nombre, numCap, numTem), capitulo);
        }else{
            System.out.println("La serie " + nombre + " no existe.");
        }
        
    }
    
    public void borrarCapitulo(){
        Serie serie;
        String nombre = Entrada.pedirNombre();
        serie = existeSerie(nombre);
        
        if (serie != null) {
            int numCap = Entrada.pedirNumeroCapitulo();
            int numTem = Entrada.pedirTemporada();
            serie.eliminaCapitulo(Serie.generarClaveCapitulo(nombre, numCap, numTem));
        }else{
           System.out.println("La serie " + nombre + " no existe."); 
        }
        
        
    }
    
    public void verCapitulos(){
        Serie serie;
        
        String nombre = Entrada.pedirNombre();
        serie = existeSerie(nombre);
        if (serie != null) {
            serie.visualizaCapitulos();
        }else{
            System.out.println("La serie " + nombre + " no existe.");
        }
        
        
        
    }
    
    
}
