/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hoja_01Colecc_EJ_02;

import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author DAW104
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numPersonas = 2;
        
        Asociacion asociacion = new Asociacion();
        
        //Añadir socios (en este caso 2) a la asociación recién creada
        
        for (int i = 0; i < numPersonas; i++) {
            asociacion.insertar(new Persona());
            
        }
        
        System.out.println("");
        System.out.println("--- Vamos a buscar a DNI ---"); 
        System.out.println("Necesitamos un DNI:");
        String dni = ValidaDatos.validarDni();
        
        //REVISAR MÉTODO DE BÚSQUEDA PORQUE NO ENCUENTRA AUNQUE ESTË BIEN METIDO        
        System.out.println(asociacion.buscar(dni));
        System.out.println("");
        
        System.out.println("--- Mostramos la recaudacion por socio ---");
        System.out.printf("La recaudacion por socios es %.2f euros ", asociacion.recaudacionTotal()); //printf
        System.out.println("");
        
        System.out.println("--- Listado de la asociacion ---");
        //ESTO NO MUESTRA NADA, TENGO SOUT VACÍO
        for (Persona aux : asociacion.getListaAsoc()) {
            System.out.println(aux.toString());            
        }
        
        //Criterio de ordenación        
        Comparator <Persona> compNombre = new PersonaPorNombre();
                
        Collections.sort(asociacion.getListaAsoc(), compNombre);
        
        System.out.println("--- Listado ordenado ---");
        for (Persona aux : asociacion.getListaAsoc()) {
            System.out.println(aux.toString());
        }
        
        
        
        
        
        
        
    }
    
}
