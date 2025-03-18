/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Hoja_01_EJ_01;

/**
 *
 * @author DAW104
 */
public class Main {

    public static void main(String[] args) {
    
        //Creamos contenedor de enteros
        
        Contenedor<Integer> contenedor = new Contenedor<>(new Integer[0]);
        
        //Rellenamos el contenedor con un for
        //Lo vamos a insertar al final con números random       
        
        for (int i = 0; i < 5; i++) {            
            contenedor.insertarAlFinal((int)(Math.random()*100));
        }
        
        System.out.println("Sin ordenar: " + contenedor.toString());
        
        contenedor.ordenar();
        
        System.out.println("Ordenado: " + contenedor.toString());
        
        //Extraemos por el principio
        Integer n = contenedor.extraerDelPrincipio();
        System.out.println("El elemento extraido es: " + n);
        System.out.println("Ahora el array es: " + contenedor.toString());
        
        //Introducimos al principio
        
        System.out.println("Vamos a introducir un 1 al principio.");
        contenedor.insertarAlPrincipio(1);
        
        System.out.println("Finalmente, el array vale: " + contenedor.toString());
        
        
        
    }
}
