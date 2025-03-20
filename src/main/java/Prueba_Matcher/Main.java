/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Prueba_Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author DAW104
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String texto = "aaa a aa aaa oo";
        // Cuantificadores
        String regex1 = "a+"; // Al menos una 'a'
        String regex2 = "a*"; // Cero o más 'a'
        String regex3 = "a?"; // Cero o una 'a'
        String regex4 = "a{2}"; // Exactamente dos 'a'

        Pattern pattern = Pattern.compile(regex1);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Coincidencias para 'a+':");
        while (matcher.find()) {
            System.out.println("Encontrado: " + matcher.group() + " en posición "
                    + matcher.start());
        }

    }

}
