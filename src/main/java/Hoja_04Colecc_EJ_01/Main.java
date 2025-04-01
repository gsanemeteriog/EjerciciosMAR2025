/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hoja_04Colecc_EJ_01;

/**
 *
 * @author DAW104
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Equipo miEquipo = new Equipo();
        
        Jugador j1 = new Jugador("Jugador1", 1.82);
        Jugador j2 = new Jugador("Jugador1", 1.82); 
        //Los dos primeros los hacemos iguales para ver que el segundo no lo inserta porque ya existe
        //Y no puede haber duplicados
        Jugador j3 = new Jugador("Jugador2", 1.92);
        Jugador j4 = new Jugador("Jugador3", 1.70);
        Jugador j5 = new Jugador("Jugador4", 2.03);
        Jugador j6 = new Jugador("Jugador5", 2.01);
        
        //Insertar
        
        miEquipo.insertar(j1);
        miEquipo.insertar(j2);
        miEquipo.insertar(j3);
        miEquipo.insertar(j4);
        miEquipo.insertar(j5);
        miEquipo.insertar(j6);
        
        //Mostrar. Ya saldrán ordenados por altura por el comparable
        
        System.out.println("--- Plantilla completada ---");
        System.out.println(miEquipo.mostrar());
        
        
        
    }
    
}
