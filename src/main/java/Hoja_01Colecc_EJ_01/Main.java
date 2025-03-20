/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hoja_01Colecc_EJ_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author DAW104
 */
public class Main {

    //NOS DA PEDRO OTRA SOLUCIÓN EN TEAMS
    //LO PONDRÉ QUIZÁ EN OTRO MAIN EN ESTE PAQUETE
    //EN ESE MAIN UTILIZARÁ UNA CLASE VALIDACIONES (LLAMADA TECLADO)
    //Es una mejor resolución porque la de aquí no cumple todo lo que se nos pide
    
    public static void main(String[] args) {
        //1.- Calcular la suma y la media aritmética de los valores contenidos 
        //en un ArrayList. Programa que lea una serie de valores numéricos enteros 
        //desde el teclado (las entradas de datos se realizan utilizando una clase Teclado 
        //con métodos estático para validar dichas entradas), 
        //y los guarde en un ArrayList de tipo Integer. 
        //La lectura de números termina cuando se introduzca el valor -99. 
        //Este valor no se guarda en el ArrayList. 
        
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int sumaArray = 0;
        int x = 0;
                
        System.out.println("Introduce numeros en el ArrayList (escribe -99 para terminar).");
                
        while(!salir){
            boolean valido = false;
            while(!valido){
                try{
                    x = leerValor(teclado);
                    valido = true;
                }catch(MisExcepciones e){
                    System.out.println("Error: " + e.getMessage());
                }
                
                if(x != -99){
                    numeros.add(x);
                }else{
                    salir = true;
                }
                
            }
            
            
        }
        
        System.out.println("--- Sumamos el arrayList ---");
        sumaArray = sumarArray(numeros);
        
        System.out.println("La suma de los numeros es: " + sumaArray);
        System.out.println("");
        
        System.out.println("--- Promedio de los elementos en el arrayList ---");
        double media = 0;
        
        if (numeros.size() != 0) { //también se puede hacer con numeros.isEmpty
            media = (double) sumaArray / numeros.size();
            
        }
        
        System.out.println("La media de los numeros es: " + media);
        System.out.println("");
        
        //A continuación, el programa mostrará por pantalla el número de valores 
        //que se han leído, su suma y su media. 
        
        //Por último, se mostrarán todos los valores leídos, indicando cuántos 
        //de ellos son mayores que la media. 
        
        System.out.println("--- Mostramos los resultados ---");
        
        
    }
    
    //MÉTODOS ESTÁTICOS
        
        //Método leeValores: pide por teclado los números y los almacena en el ArrayList. 
        //La lectura acaba cuando se introduce el valor -99. 
        //El método devuelve mediante return el ArrayList con los valores introducidos.
    
    public static int leerValor(Scanner teclado) throws MisExcepciones{
        System.out.println("Introduce un numero entero.");
        String entrada = teclado.nextLine(); 
        //Lo hace con String en lugar de con int porque quiere que si alguien mete una letra
        //se pueda gestionar su error
        
        try{
            return Integer.parseInt(entrada);
            //Aquí parsea el String a int
            //Pone el return en el try porque como estamos con Integer.parse 
            //directamente sabemos que va a ser un numero entero, entonces
            //eso sabemos que está bien y no hace falta el catch
            //Sin embargo, si detecta que no es un entero, SÍ va a saltar
            //al catch
            
        }catch(NumberFormatException e){
            throw new MisExcepciones("Debes introducir un numero entero.");
        }
        
        
    }
        
        //Método calcularSuma: Recibe como parámetro el ArrayList con los valores numéricos 
        //y calcula y devuelve su suma. En este método se utiliza un Iterator para recorrer el ArrayList.
        //Pedro lo hace con for-each en lugar de Iterator
    
    public static int sumarArray(ArrayList<Integer> n) {
        int suma = 0;
        for (int num : n) {
            suma += num;
        }
        return suma;

    }
    
        //Ejemplo de versión con Iterator hecha con CP
    
    public static int sumarArrayConIterator(ArrayList<Integer> n) {
        int suma = 0;
        Iterator<Integer> iterator = n.iterator();
        while (iterator.hasNext()) {
            suma += iterator.next();
        }
        return suma;
    }
        
        //Método mostrarResultados: Recibe como parámetro el ArrayList, la suma y la media aritmética. 
        //Muestra por pantalla todos los valores, su suma y su media 
        //y calcula y muestra cuentos números son superiores a la media. 
        //En este método se utiliza un for each para recorrer el ArrayList. 
    
    public static void mostrarResultados(ArrayList<Integer> n, int suma, double media){
        
        
        
    }
        
    
    
}
