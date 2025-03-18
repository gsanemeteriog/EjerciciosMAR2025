/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja_01_EJ_01;

import java.util.Arrays;

/**
 *
 * @author DAW104
 */
public class Contenedor <T extends Comparable<T>> {
    
    //Implementar, con tipos genéricos, la clase Contenedor, donde podremos guardar tantos objetos como deseemos. 
    //Para ello utilizaremos un array, que inicialmente tendrá tamaño cero y se irá redimensionando 
    //según añadamos o eliminemos elementos. La clase, además del constructor y toString(), 
    
    //Array de objetos genérico, puede ir cualquier objeto
    private T[] objetos;
    
    //Constructor
    public Contenedor(T[] objetos){
        this.objetos = objetos;
    } 
    
    
    //Tendrá los siguientes métodos: 
    //void insertarAlPrincipio(T nuevo) 
    
    public void insertarAlPrincipio(T nuevo){
        //Necesitamos un array con una posición más. Ya que tenemos que mover a la derecha lo que haya dentro
        //Y crear un nuevo hueco en la que será la primera posición, para poder
        //insertar al principio algo
        
        //Hacemos una copia del array objetos en uno nuevo con una posición más
        
        objetos = Arrays.copyOf(objetos, objetos.length +1);
        
        //Nos desplazamos con:
        //System.arraycopy(Object tablaOrigen, int posOrigen, Object tablaDestino, int posDestino, int longitud)
        //Lo pasamos de objetos a otro nuevo que llamamos objetos también
        System.arraycopy(objetos, 0, objetos, 1, objetos.length - 1);
        
        //Insertamos en la primera posición
        objetos[0] = nuevo;
        
        
    }  
    
    //void insertarAlFinal(T nuevo) 
    
    public void insertarAlFinal(T nuevo){
        //Hacemos una copia del array objetos en uno nuevo con una posición más
        objetos = Arrays.copyOf(objetos, objetos.length +1);
        
        //Aquí no hay que desplazar nada ya que añadimos al final
        
        //Insertamos por el final. La posición última será igual al nuevo
        objetos[objetos.length - 1] = nuevo;
        
        
        
        
    }

    //T extraerDelPrincipio()
    //Extraer en sentido de sacarlo, se puede mostrar, y en el array lo borra
    
    public T extraerDelPrincipio(){
        T res = null; //res de resultado
        if (objetos.length > 0) {
            //Buscamos en la posición 0, ya que extraemos del principio
            //Copiamos desde el 1 hasta el final y así extraemos la 0
            res = objetos[0];
            objetos = Arrays.copyOfRange(objetos, 1, objetos.length);
            
        }
        return res;
        
    }

    //void ordenar() 
    
    public void ordenar(){
        Arrays.sort(objetos);
        
    }
    
    //Para el toString nos va a sugerir el deepToString, y es el que usamos
    
    @Override
    public String toString(){
        return Arrays.deepToString(objetos);
    }

    //PD. Utilizar los métodos de la clase Arrays y 

    //System.arraycopy(Object tablaOrigen, int posOrigen,Object tablaDestino, int posDestino, int longitud) 

    //Copia en la tablaDestino, a partir del índice posDestino, los datos de la tablaOrigen, 
    //comenzando en el índice posOrigen. El parámetro longitud especifica el número de elementos 
    //que se copiarán entre ambos arrays. Hay que tener precaución, ya que los valores de los 
    //elementos afectados por la copia del array destino se perderán. 
    
}
