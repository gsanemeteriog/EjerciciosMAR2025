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
public class OtroEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto = "Código123\nTexto con espacios\tOtroTexto!\nNada de lo anterior";
        // Diferentes metacaracteres
        String regex1 = "\\d+"; // Encuentra números
        String regex2 = "\\s+"; // Encuentra espacios, tabulaciones o saltos de línea 
        String regex3 = "\\bTexto\\b"; // Encuentra "Texto" como palabra independiente 
        buscarCoincidencias(texto, regex1,
                 "Números encontrados:");
        buscarCoincidencias(texto, regex2, "Espacios encontrados:");
        buscarCoincidencias(texto, regex3, "Palabra 'Texto' encontrada:");
    }

    public static void buscarCoincidencias(String texto, String regex, String mensaje) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println(mensaje);
        while (matcher.find()) {
            System.out.println("Encontrado: '" + matcher.group() + "' en posición" + matcher.start());
        }
    }
}
