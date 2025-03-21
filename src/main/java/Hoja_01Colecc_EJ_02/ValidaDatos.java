/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja_01Colecc_EJ_02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 *
 * @author DAW104
 */
public class ValidaDatos {
    
    //PEDRO LO HACE SIN EXPRESIONES REGULARES 
    //PORQUE TÉCNICAMENTE EL EJERCICIO ESTÁ EN LA TEORÍA
    //ANTES DE VER EXPRESIONES REGULARES
    //PERO LO IDEAL SERÍA HACERLO CON ELLAS
    //Validar nombre con al menos 3 caracteres alfanuméricos
    //Tampoco va a hacer try and catch para centrarnos en ArrayList
    public static String validarNombre(){
       String nombre = "";
       Scanner teclado = new Scanner(System.in);
       boolean seguir = true;
       
       do{
           System.out.println("Introduce el nombre del socio:");
           nombre = teclado.nextLine();
           if (nombre.length() < 3) {
               System.out.println("El nombre no es valido. Minimo 3 caracteres.");
           }else{
               if (soloLetras(nombre)) {
                   seguir = false;
               }else{
                   System.out.println("El nombre no es válido.");
               }
           }
           
       }while(seguir);
       
       return nombre;               
    }
    
    //Un método que verifique que solo contenga letras
    //porque aunque el enunciado pide que sea alfanumérico
    //es un nombre y deberían ser letras
    //Lo hace en un método aparte para mantener la regla
    //de que un método sólo hace una cosa
    
    private static boolean soloLetras(String cadena){
        boolean soloLetras = false;
        int cuentaLetras = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if(Character.isLetter(cadena.charAt(i))){
                cuentaLetras++;
            }
        }
        
        if(cuentaLetras == cadena.length()){
            soloLetras = true;
        }
        return soloLetras;
    }
    
    //Validar fecha que sea válida
    
    public static LocalDate validarFecha(){
        Scanner teclado = new Scanner(System.in);
        LocalDate fecha = LocalDate.now();
        //Se podría hacer los cálculos sin la fecha de hoy,pero lo añade por usarlo de manera didáctica
        boolean seguir = true;
        
        while(seguir){
            try{
                System.out.println("Introduce la fecha de nacimiento del socio en formato dd-MM-yyyy");
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                fecha = LocalDate.parse(teclado.next(), formato);
                seguir = false;
            }catch(DateTimeParseException e1){
                System.out.println("Fecha no valida.");
            }catch(Exception e2){
                System.out.println("Error: " + e2.toString());                
            }
            
        }
        return fecha;        
    }
    
    //Validar que la letra del DNI sea válida
    //letraDni = dni % 23;
    //la posición en la cadena TRWAGMYFPDXBNJZSQVHLCKE
    //será la letra
    
    public static String validarDni() {
        Scanner teclado;
        //Esto lo hace así para variar y que veamos otra opción
        //en este claso lo inicializa en el do
        String dni = "";

        do {
            teclado = new Scanner(System.in);
            System.out.println("Introduce el DNI del socio:");
            dni = teclado.nextLine();
        }while(!dniValido(dni));

        return dni;

    }
    
    //Método para comprobar si es válido
    
    private static boolean dniValido(String dni){
        boolean valido = true; //normalmente inicializa a false, ahora por variar
        
        try{
            if (dni.length() != 9 || !(Character.isLetter(dni.charAt(8))) || !soloNumeros(dni.substring(0,8))){
                System.out.println("El DNI debe ser 8 numeros y una letra.");
                valido = false;
            }else{
                char letra = letraDni(dni);
                if (letra != dni.toUpperCase().charAt(8)) {
                    System.out.println("La letra no coincide.");
                    valido = false;
                }
            }
        }catch(NumberFormatException e){
            System.out.println("Los ocho primeros caracteres del DNI deben ser numeros.");
            valido = false;
        }
        
        
        return valido;
    }
    
    //Método para comprobar que sean números
    
    private static boolean soloNumeros(String cadena) throws NumberFormatException{
        boolean soloNumeros = false;
        int numeros = Integer.parseInt(cadena);
        soloNumeros = true;
        return soloNumeros;        
        
    }
    
    //Método para sacar la letra del dni
    private static char letraDni(String dni){
        int numDni = Integer.parseInt(dni.substring(0, 8));
        int resto;
        
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        resto = numDni % 23;
        return letras[resto];
        
    }
    
    
    

    
}
