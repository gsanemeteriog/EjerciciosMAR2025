/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hoja_03Colecc_EJ_04;

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
        
        Carrera carrera1 = new Carrera();
        Scanner teclado = new Scanner(System.in);
        
        //Menú
        int opcion = 0;
        boolean salir = false;
        
        System.out.println("--- Menu de opciones ---");
        
        while(!salir){
            mostrarMenu();
            opcion = Validaciones.validarOpciones(teclado); 
            
            switch(opcion){
                case 1->{                    
                    Atleta atleta = crearAtleta();                    
                    carrera1.insertarAtleta(atleta);
                }
                case 2->{
                    System.out.println("El tiempo medio de los atletas es: " + carrera1.tiempoMedio());
                }
                case 3->{
                    carrera1.darLaVuelta();
                    System.out.println("Colección dada la vuelta:");                    
                }
                case 4->{
                    System.out.println("Datos de los atletas registrados: " + carrera1.mostrar());
                    
                }
                case 5->{
                    System.out.println("Saliendo del programa.");
                    salir = true;
                }
                default-> System.out.println("Opcion no valida. Elige entre 1 y 6.");
                
                 
                
            }
           
        }
        
    }
    
    public static void mostrarMenu(){
        System.out.println("1 - Agregar atleta.");
        System.out.println("2 - Tiempo medio.");
        System.out.println("3 - Dar la vuelta.");
        System.out.println("4 - Mostrar.");
        System.out.println("5 - Salir.");        
    }
    
    public static Atleta crearAtleta(){        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el dorsal del atleta: ");
        int dorsal = Integer.parseInt(teclado.nextLine());
        
        System.out.println("Introduce el nombre del atleta: ");
        String nombre = teclado.nextLine();
        
        System.out.println("Introduce el tiempo del atleta: ");
        double tiempo = Double.parseDouble(teclado.nextLine());
        Atleta atleta = new Atleta(dorsal, nombre, tiempo);
                
        return atleta;
        
        
    }
    
    
}
