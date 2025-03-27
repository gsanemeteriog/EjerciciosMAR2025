/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja_03Colecc_EJ_04;

import java.util.Scanner;

/**
 *
 * @author DAW104
 */
public class Atleta {

    private int dorsal;
    private String nombre;
    private double tiempo; //Practicar validar que el double va entre .00 y .59
    
    //Como no puede haber duplicados (por dorsal) necesitaremos equals y hascode

    //Constructor pidiendo los datos por teclado (en el main)
    public Atleta(int dorsal, String nombre, double tiempo) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    //Métodos get y set necesarios

    public double getTiempo() {
        return tiempo;
    }
    
    //equals y hashcode por dorsal

    @Override
    public int hashCode() {
//        int hash = 7;
//        hash = 37 * hash + this.dorsal;
//        return hash;
        //Ya que sólo vamos a diferencar por dorsal, no necesitamos nada más, sólo el dorsal
        return dorsal;
    }
    
    //Pedro pide mejorar el equals; un in instanceOf atleta y return this.dorsal = other.dorsal

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Atleta other = (Atleta) obj;
        return this.dorsal == other.dorsal;
    }
    
    //toString

    @Override
    public String toString() {
        return "Atleta:\n" + "Dorsal: " + dorsal + "\nNombre: " + nombre + "\nTiempo: " + tiempo + '}';
    }
    
    

    
}
