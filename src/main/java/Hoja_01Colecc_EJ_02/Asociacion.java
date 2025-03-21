/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja_01Colecc_EJ_02;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DAW104
 */
public class Asociacion {
    
    //Tenemos otra clase Asociación, que tiene como atributo una lista de Personas 
    //que forman parte de la asociación. Tendrá un constructor por defecto, 
    //un método insertar, un método buscar, que busca una persona por su DNI 
    //y devuelve los datos de esa persona y la cuota que debe pagar, 
    //y un método donde recorre toda la lista y devuelve la recaudación total de la asociación en función de estos datos. 
    
    //Atributos
    List<Persona> listaAsoc;
    
    //Constructor
    public Asociacion(){
        listaAsoc = new ArrayList<>();        
    }
    
    //Get y set
    public List<Persona> getListaAsoc() {
        return listaAsoc;
    }
    
    //Método insertar    
    public void insertar(Persona persona){
        if (listaAsoc.add(persona)) {
            System.out.println("Persona agregada a la lista.");
        }else{
            System.out.println("No fue posible la insercion.");
        }
    }
    
    //Método buscar
    public String buscar(String dni) {
        String datosCuota = "No existe la persona con dni: " + dni;
        double cuotaPagar;
        Persona personaBuscar = new Persona(dni);
        //En esta persona guardará la persona que encuentre con ese dni

        if (listaAsoc.contains(personaBuscar)) {//contains hay que redefinirlo
            int posicion = listaAsoc.indexOf(personaBuscar);
            Persona persona = listaAsoc.get(posicion);
            cuotaPagar = cuota(persona.edadPersona()); //método cuota que calcule la cuota, más abajo
            datosCuota = String.format(persona.toString() + " cuota %.2f", cuotaPagar);

        }

        return datosCuota;
    }
    
    //Método cuota que calcula la cuota de un socio según la edad    
    private double cuota(int edad){
        double precio = 0;
        if (edad>=5 && edad<=10) {
            precio = 1;
        }else if(edad>=11 && edad<=17){
            precio = 2.5;
        }else{
            precio = 3.5;
        }
        return precio;
    }
    
    //Método que calcula la recaudación (lo que importan todos los socios)
    public double recaudacionTotal(){
        double recaudacion = 0;
        for (Persona aux : listaAsoc) {
            recaudacion += cuota(aux.edadPersona());
            
        }
        
        return recaudacion;
    }
    
    

}
