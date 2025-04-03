/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja_05Colecc_EJ_01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author DAW104
 */
public class Entrada {
    
    //Clase Entrada sin atributo y los métodos estáticos para la petición y validación de todos los datos 
    //de entrada (petición de nombre, petición de nacionalidad, validación de temporadas, …) 
    
    public static int introducirOpcion(){
        int opcion = 0;
        
        return opcion;
    }
    
    public static String pedirNombre(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("");
        String nombre = "";
        do{
            System.out.println("Introduce el nombre de la serie.");
            nombre = teclado.nextLine();
            
        }while(nombre.length() <4 || nombre.length()>25);
        return nombre;
    }
    
    public static String pedirNacionalidad(){
        String nacionalidad = "";
        //VALIDAR NACIONALIDAD
        return nacionalidad;
    }

    public static Tematica pedirTematica(){
        Scanner teclado = new Scanner(System.in);
        boolean seguir = true;
        Tematica tematica = Tematica.AVENTURA; //Por inicializarlo en algún valor
        
        do{
            System.out.println("Las opciones de serie son:\n"
                    + "\t1 - Policial \n"
                    + "\t2 - Comedia \n"
                    + "\t3 - Infantil \n"
                    + "\t4 - Aventura \n");
                    
            System.out.println("Elige una tematica:"); 
            try{
                int opcion = Integer.parseInt(teclado.nextLine());
                seguir = false;
                switch(opcion){
                    case 1 -> tematica = Tematica.POLICIAL;
                    case 2 -> tematica = Tematica.COMEDIA;
                    case 3 -> tematica = Tematica.INFANTIL;
                    case 4 -> tematica = Tematica.AVENTURA;
                    default -> {System.out.println("Elige una opcion entre 1 y 4.");
                                seguir = true;}
                }
                
            }catch(NumberFormatException e){
                System.out.println("Debes introducir un numero.");                
            }
            
        }while(seguir);
        return tematica;        
        
        
    }
    
     //VALIDAR NÚMERO DE TEMPORADA que sea entre 1 y 15
     //Con un if, no complicarse con regex    
    public static int pedirTemporada(){
        Scanner teclado = new Scanner(System.in);
        int temporada = 0;
        boolean valido = false;
        do{
            try{
                System.out.println("Introduce la temporada.");
                temporada = teclado.nextInt();
                if (temporada <1 || temporada >15) {
                    throw new Exception("Introduce un numero entre 1 y 15.");
                }
                valido = true;
            }catch(InputMismatchException e){
                System.out.println("Error.");
            }catch(Exception e2){
                System.out.println("Otro error.");
            }
            
        }while(!valido);
        
       
        
        return temporada;        
        
    }
    
    public static boolean pedirFinalizada(){
        boolean finalizada = false;
        //VALIDAR .. ¿que sea boolean?
        return finalizada;
    }
    
    public static int pedirNumeroCapitulo(){
        int numeroCapitulo = 0;
        
        
        return numeroCapitulo;
        
        
    }
    
    public static String pedirDescripcion(){
        String descripcion = "";
        
        return descripcion;
    }
    
    
    
}
