/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hoja_01Colecc_EJ_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Ejercicio_01b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        //VERSIÓN MEJORADA DE PEDRO. 
        //ESTA ES LA BUENA.
        //AQUÍ USA LA CLASE VALIDACIONES (TECLADO)
        ArrayList<Integer> numeros = new ArrayList<>();
        boolean salir = false;
        int x = 0;
        int sumaArray = 0;
        Scanner teclado = new Scanner(System.in);
        
        //mientras no se introdizca -99 hay que seguir añadiendo números enteros
        System.out.println("Introduce un número entero. -99 para teminar");
        //main es el que captura y maneja las excepciones -> es una pila
        while (!salir) {
            try {
                x = leerEntrada(teclado);
                if (x != -99) {
                    numeros.add(x);
                } else {
                    salir = true;
                }
            } catch (MisExcepciones e) {
                System.out.println(e.getMessage());
                teclado.nextLine();
                
            }

        }
        
        //sumar el valor del array
        
        sumaArray = sumarArray(numeros);
        
        //calcular la media
        double media = 0;
        if(numeros.size() >0){
            media = (double) sumaArray / numeros.size();
        }
        
       //mostrar todo: ArrayList, suma y media
       
       mostrarResultados(numeros, sumaArray, media);
    
       
        
        
    }//fin del main
    
    
    //leer la entrada
    
    public static int leerEntrada(Scanner teclado) throws MisExcepciones{//es el que propaga las excepciones
        
        return Teclado.obtenerEntero(teclado);
    }
    
    
    
    //sumar los valores
    public static int sumarArray(ArrayList<Integer> n){
        int suma = 0;
        for(int x : n){
            suma += x;
        }
        
        return suma;
    }
    
    
    //sumar el array con un iterador
    public static int sumarArrayIt(ArrayList<Integer> n){
        int suma = 0;
        if(n == null){
            suma = 0;
        }
        
        Iterator<Integer> it = n.iterator();
        
        while(it.hasNext()){
            suma += it.next();
        }
        
        
        return suma;
    }
    
    
    
    //mostrar todo
    public static void mostrarResultados(ArrayList<Integer> n, int sumaArray, double media){
        int cuantos = 0;
        
        if(n.isEmpty()){
            System.out.println("El ArrayList está vacío");
            return;
        }
        
        for(int x : n){
            if(x > media){
                cuantos++;
            }
        }
        
        System.out.println("Resultados del ejercicio");
        System.out.println("Contenido el Array");
        
        for(int x : n){
            System.out.print(x + ", ");
        }
        System.out.println("");
        System.out.println("la suma de los valores del array es " + sumaArray);
        System.out.printf("La media de los valores del array es %.2f \n" , media);
        System.out.println("Hay " + cuantos + " valores superiores a la media en el ArrayList");
        
        
    }
    
    
    
}
