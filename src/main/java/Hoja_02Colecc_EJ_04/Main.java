/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hoja_02Colecc_EJ_04;

import java.util.Scanner;

/**
 *
 * @author DAW104
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Escribir una clase para controlar el acceso de clientes a un servicio de salud. 
        // Se guardará una cola de espera de clientes. 
        // NECESITAMOS UNA COLA y DESPUÉS UNA LISTA
        // Escribir una clase para controlar el acceso de clientes 
        // a un servicio de salud. Se guardará una cola de espera de clientes.
        
        Servicio servicio = new Servicio();
        
        //MENÚ
        //Operaciones del menú serán: 
        //Añadir un cliente 
        //Atender a un cliente 
        //Obtener el tiempo medio de espera de los clientes que aún no han sido atendidos
        //Obtener el tiempo medio de espera de los clientes ya atendidos 
        //Mostrar los clientes indicando los que hay en la cola de espera y los que están atendidos 
        
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        
        //MENÚ HECHO CON UN DO-WHILE, PEDRO INDICA QUE SI NO LO HACEMOS ASÍ NI LO COPIEMOS
        //Y QUE USEMOS EL QUE USAMOS SIEMPRE
        //ASÍ TODO LO COPIO POR TENERLO
        
        do{
            try{
                System.out.println("--- Menu de opciones ---");
                System.out.println("1 - Agregar un cliente.");
                System.out.println("2 - Atender a un cliente.");
                System.out.println("6 - Salir del programa.");                
                
                System.out.println("Selecciona la opcion deseada:");
                opcion = Integer.parseInt(teclado.nextLine());
                
                switch(opcion){
                    case 1-> {
                        String nombre = Validaciones.validarNombreReg(teclado);
                        String movil = Validaciones.validarMovil(teclado);
                        Cliente c1 = new Cliente(nombre,movil);
                        servicio.insertar(c1);
                    }
                    
                    case 2->{
                        servicio.atender();
                    }
                    
                    // case 5-> System.out.println(servicio.mostrar());
                    //}
                }
                
                
            }catch(Exception e){
                System.out.println("Error.");
            }
            
        }while(opcion != 6);
        
        
        
        
        
    }
    
}
