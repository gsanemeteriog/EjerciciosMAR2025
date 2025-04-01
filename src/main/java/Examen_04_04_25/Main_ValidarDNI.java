/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Examen_04_04_25;

/**
 *
 * @author DAW104
 */
public class Main_ValidarDNI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
           String dni = "123 45678 Z";
        if (validarDNI(dni)) {
            System.out.println("El DNI es valido.");
        } else {
            System.out.println("El DNI no es valido.");
        }
    }
    
    public static boolean validarDNI(String dni) {
        // Verificar longitud y formato
        
        dni=dni.toUpperCase();
        dni=dni.replaceAll("\\s+", ""); //El "\\s+" es para indicar que tanto espacios, como tambulaciones o saltos de limina deben ser sustituidos por nada: 
        if (dni == null || !dni.matches("^\\d{8}[A-Z]$")) {
            return false;
        }
        // Separar el número y la letra
        String numeroDni = dni.substring(0, 8);
        char letraDada = dni.charAt(8);
        // Calcular la letra correcta
        String secuenciaLetras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int numero = Integer.parseInt(numeroDni);
        char letraCorrecta = secuenciaLetras.charAt(numero % 23);
        // Comparar la letra
        return letraDada == letraCorrecta;
    
    

    }
    
}
