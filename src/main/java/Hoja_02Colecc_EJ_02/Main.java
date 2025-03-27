/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hoja_02Colecc_EJ_02;

/**
 *
 * @author DAW104
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Taller taller = new Taller();
        FichaVehiculo f1 = new FichaVehiculo("Panda", "3223BDC");
        
        System.out.println("--- T A L L E R ---");
        System.out.println("");
        
        System.out.println("Procedemos a insertar un vehiculo:");
        taller.insertarVehiculo(f1);
        System.out.println("");
        
        System.out.println("Mostramos el estado del taller:");
        taller.mostrarEstado(); 
        System.out.println("");
        
        System.out.println("Vamos a reparar el vehiculo:");        
        taller.repararVehiculo("3223BDC");
        
        System.out.println("Mostramos el estado del taller:");        
        System.out.println(taller.mostrarEstado());
        System.out.println("");
        
        System.out.println("Damos salida al vehiculo:");
        
        taller.darSalidaVehiculo("3223BDC");
        System.out.println(taller.mostrarEstado());
        
        
    }
    
}
