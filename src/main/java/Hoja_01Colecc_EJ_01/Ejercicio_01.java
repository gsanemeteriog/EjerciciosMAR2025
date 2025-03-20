/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hoja_01Colecc_EJ_01;

import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        //PRIMERA VERSIÓN DE PEDRO SIMILAR A MI MAIN.
        //ES MEJOR LA VERSIÓN B
       ArrayList<Integer> numeros = new ArrayList<>();//creo el array list. ahora mismo está vacío
        
       boolean salir = false;
       int sumaArray = 0;
       int x = 0;
       //introducimos números enteros hasta que salga el -99
       Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce números enteros. Para salir, ingresa -99.");

        // Pedir números hasta que se ingrese -99
        while (!salir) {
          
            boolean valido = false;

            while (!valido) {
                try {
                    x = leerValor(teclado);  // Pedir un número
                    valido = true;  // Si no hay error, el valor es válido
                } catch (MisExcepciones e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

            if (x != -99) {
                numeros.add(x);
            } else {
                salir = true;
            }
        }
      
       
       
       
       
       //suma del array
       sumaArray = sumarArray(numeros);
       
       //media del array
       double media = 0;
        if (numeros.size() != 0){
            media = (double) sumaArray / numeros.size();
        }
       //mostramos todo con el método estático
       
       
       
       Ejercicio_01.mostrarResultados(numeros, sumaArray, media);
        
    }
    
    
    //metodo para leer los valores
    
    public static int leerValor(Scanner teclado) throws MisExcepciones {
        System.out.println("Introduce un número entero:");
        String entrada = teclado.nextLine();

        try {
            return Integer.parseInt(entrada);
        } catch (NumberFormatException e) {
            throw new MisExcepciones("Debes introducir un número entero.");
        }
    }
    
    
    
    //método para calcular la suma
    
    public static int sumarArray(ArrayList<Integer> n){
         int suma = 0;
        for (int num : n) {
            suma += num;
        }
        return suma;
        
    
    }
    
    
    
    //método para mostrar los resultados
    
    public static void mostrarResultados(ArrayList<Integer> n, int suma, double media){
        int cuantos = 0;
        
         if (n.isEmpty()) {
        System.out.println("El ArrayList está vacío.");
        return;
    }
         
        for(int x : n){
        System.out.printf("%d\t", x);
        }
        
        System.out.println("");  
        System.out.println("La suma de los valores del Array es " + suma);
        System.out.printf("La media de los valores del Array es %.2f", media );
        System.out.println("\n----------------------------");
        
        for(int x : n){
            if(x > media){
                cuantos++;
            }
        }
        
        System.out.println("Hay " + cuantos + " valores superiores a la media en el ArrayList");
        
    }
    
    
    
}
