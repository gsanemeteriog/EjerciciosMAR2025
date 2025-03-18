/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hoja_01_EJ_02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW104
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Comprobar el funcionamiento
        //Pila de enteros que es un contenedor
        
        Pila<Integer> pila = new Contenedor<>(new Integer[0]);
        
        //Vamos a pedir los datos por teclado
        Scanner teclado = new Scanner(System.in);
        
        //Vamos a introducir números hasta que se introduzca un -1
        System.out.println("--- Vamos a apilar la pila ---");
        System.out.println("");
        
        boolean seguir = true;
        Integer n = 0;
        
        while(seguir){
            try{
                System.out.println("Introducir un numero entero positivo (escribe -1 para terminar)");
                n = Integer.parseInt(teclado.nextLine());
                if(n == -1){
                    seguir = false;
                }else if (n<0){
                    throw new IllegalArgumentException("Los numeros deben ser positivos (excepto -1 para salir).");
                }else{
                    pila.apilar(n);
                }
//               
            }catch(InputMismatchException e){
                System.out.println("Valor no valido. Son enteros positivos.");
            }catch(IllegalArgumentException e){
                System.out.println("Error: " + e.getMessage());
            }          
            
            
        }
        
        System.out.println("--- Pasamos a desapilar la pila ---");
        System.out.println("");
        
        //PENDIENTE
        
//       try{
//           while ((n = pila.desapilar()) != null){
//               System.out.println(n);
//           }
//       }catch{
//           
//       }
       
        
    }
    
}
