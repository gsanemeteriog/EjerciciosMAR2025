/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja_05Colecc_EJ_01;

import java.util.HashMap;
import java.util.Objects;

/**
 *
 * @author DAW104
 */
public class Serie {
    private String nombre; //Entre 4 y 25 caracteres
    private Tematica tematica;
    private String nacionalidad;
    private boolean finalizada; //Si está finalizada o no
    private int temporada; //
    private HashMap<String, Capitulo> capitulos;
    
    
    
    //Al ser pares clave/valor descripción/Capítulo no puede haber repetidos
    //El caso más genérico suele ser String o número y un objeto, por ejemplo:
    //Número identificador y un objeto Alumno
    
    //Capítulos: hashmap que contiene una descripción de capítulos, 
    //la clave de cada capítulo será “los cuatro primeros caracteres del 
    //nombre en mayúsculas + número de temporada + “X” + número de capítulo”.
    //Por ejemplo, si el nombre de la serie es Sopranos, el séptimo capítulo 
    //de la primera temporada, su clave será “Sopr01X07” 
    //(delante de los números del 1 al 7 tiene que tener un 0). 
    //El número válido de capítulos es entre 1 y 30.

    
    
    
}
