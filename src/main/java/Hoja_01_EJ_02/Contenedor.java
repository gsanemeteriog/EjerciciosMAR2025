/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja_01_EJ_02;

import java.util.Arrays;

/**
 *
 * @author DAW104
 */
public class Contenedor<T> implements Pila<T> {

    private T[] objetos;
    
    public Contenedor(T[] objetos){
        this.objetos = objetos;
    }
    
    //Como es una pila, para insertar insertamos al principio
    
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
    
    //Como es una pila, para extraer extraemos del principio
    
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
    
    //Implementamos los métodos del interfaz, y lo hacemos a través de los que hemos creado aquí arriba
    
    @Override
    public void apilar(T nuevo) {
        this.insertarAlPrincipio(nuevo);
    }

    @Override
    public void desapilar() {
        this.extraerDelPrincipio();
    }
    
    
    
    
    
    
    
    
}
