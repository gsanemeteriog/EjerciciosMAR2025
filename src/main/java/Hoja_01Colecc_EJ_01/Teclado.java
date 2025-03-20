/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja_01Colecc_EJ_01;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Teclado {
    
    public static int obtenerEntero(Scanner teclado) throws MisExcepciones{// es el que lanza las excepciones
        //Scanner t = new Scanner(System.in);
        int entero = 0;
        boolean salir = false;
        
        while(!salir){
            
            System.out.println("Introduce un número entero");
            try{
                entero = Integer.parseInt(teclado.nextLine());
                
                salir = true;
            }catch(NumberFormatException e){
                throw new MisExcepciones("Introduce un número entero");
                //tengo que valorar pasar el Scanner desde el main para limpiar el buffer aqui con teclado.nextLine()
            }
            
        }
        
        return entero;
    }
    
    
}
