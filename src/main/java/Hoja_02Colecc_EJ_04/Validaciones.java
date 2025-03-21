/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja_02Colecc_EJ_04;

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
    public static void validarNombreReg() {
        
       //Para patrón de nombre, necesitamos ^ para que verifique al principio
       //y $ para el final
         
       Pattern patron = Pattern.compile("^[a-zA-Z]{3,}$");
       Matcher coincidencia = patron.matcher("Pedro");
       
        if (coincidencia.find()) {
            System.out.println("Nombre valido.");
            
        }else{
            System.out.println("Nombre no valido.");
        }
        
        
    }

    //Validar fecha y hora ¿que sea inferior a la actual?
}
