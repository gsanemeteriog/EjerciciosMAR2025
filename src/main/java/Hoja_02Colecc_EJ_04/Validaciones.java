/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja_02Colecc_EJ_04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author DAW104
 */
public class Validaciones {

    //Validar nombre: 3 letras
    //En lugar de usar el método del Hoja_01Colecc_EJ_02
    //Usamos expresión regular
    public static String validarNombreReg(Scanner teclado) {

        //Para patrón de nombre, necesitamos ^ para que verifique al principio
        //y $ para el final
        String nombre = "";
        boolean seguir = false;

        do {
            System.out.println("Introduce el nombre de la persona (al menos 3 letras.");
            nombre = teclado.nextLine();

            //Si queremos quitar los espacios en blanco:
            //nombre = nombre.replaceAll("\\s+", "");
            Pattern patron = Pattern.compile("^[a-zA-Z]{3,}$");
            Matcher coincidencia = patron.matcher(nombre);
            seguir = !coincidencia.matches();

            if (seguir) {
                System.out.println("Error: el nombre debe tener al menos 3 caracteres.");
            }

        } while (seguir);

        return nombre;

    }

    //Validar fecha y hora ¿que sea inferior a la actual?
    
    //Validar móvil, que tenga 9 dígitos    
    public static String validarMovil(Scanner teclado){
        String movil = "";
        boolean valido = false;
        
        do{
            try{
                System.out.println("Introduce el numero de telefono (9 digitos):"); 
                movil = teclado.nextLine();
                movil = movil.trim(); //Aquí si viene bien quitar los espacios, Pedro usa trim
                
                Pattern patron = Pattern.compile("^[0-9]{9}$");
                Matcher coincidencia = patron.matcher(movil);
                valido = !coincidencia.matches();
                
            }catch(Exception e){
                System.out.println("Error: el numero de telefono no es valido.");
            }
            
        }while(!valido);
        
        return movil;
    }
    
    
}
