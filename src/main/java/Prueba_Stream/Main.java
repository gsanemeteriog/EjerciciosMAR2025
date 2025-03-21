/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Prueba_Stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author DAW104
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<String> nombres = List.of("Ana", "Pedro", "María", "Luis", "José");
        List<String> nombresFiltrados = nombres.stream()
                .filter(n -> n.length() > 3) // Filtra nombres con más de 3 letras
                .sorted() // Los ordena alfabéticamente
                .collect(Collectors.toList()); // Convierte el resultado en una lista
        System.out.println(nombresFiltrados); // Salida: [José, Luis, María,Pedro]
        
 }
    
    
}
