/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja_03Colecc_EJ_04;

import java.util.Scanner;

/**
 *
 * @author DAW104
 */
public class Validaciones {
    
    public static int validarOpciones(Scanner teclado){
        int opcion=0;
        boolean valido=false;
        try{
            System.out.println("Introduce la opcion elegida:");
            opcion=Integer.parseInt(teclado.nextLine());
            valido =true;
        }catch(NumberFormatException e1){
            System.out.println("No valido.");
        }catch(Exception e1){
            System.out.println("Error.");
        }
        return opcion;
    }
    
    
}
