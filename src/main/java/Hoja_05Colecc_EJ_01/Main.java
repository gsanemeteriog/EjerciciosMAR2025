/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hoja_05Colecc_EJ_01;

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
        GestorSeries misSeries = new GestorSeries();
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        
        while(opcion != 7){
            System.out.println("--- Menu de opciones ---");
            System.out.println("1 - Insertar serie.");
            System.out.println("2 - Eliminar serie.");
            System.out.println("3 - Mostrar las series.");
            System.out.println("4 - Insertar capitulo a una serie.");
            System.out.println("5 - Eliminar capitulo de una serie.");
            System.out.println("6 - Mostrar los capitulos de una serie.");
            System.out.println("7 - Salir.");
            
            opcion = Entrada.introducirOpcion(); //Pendiente
            
            switch(opcion){
                case 1-> misSeries.crearSerie();
                case 2-> misSeries.eliminarSerie();
                case 3-> misSeries.eliminarSerie();//misSeries.verSeries();
                case 4-> misSeries.crearCapitulo();
                case 5-> misSeries.borrarCapitulo();
                case 6-> misSeries.verCapitulos();
                case 7-> System.out.println("Saliendo.");
                default -> System.out.println("Introduce un numero del 1 al 7.");
                
                
            }
        }
        
        
        
    }
    
}
