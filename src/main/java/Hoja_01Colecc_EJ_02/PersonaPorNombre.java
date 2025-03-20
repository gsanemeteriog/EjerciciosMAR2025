/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja_01Colecc_EJ_02;

import java.util.Comparator;

/**
 *
 * @author DAW104
 */
public class PersonaPorNombre implements Comparator<Persona>{
    
    @Override
    public int compare(Persona p1, Persona p2){
        return p1.getNombre().compareTo(p2.getNombre());
        
        
    }
    
    
    
    
    
}
