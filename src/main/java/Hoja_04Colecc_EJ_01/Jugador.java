/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja_04Colecc_EJ_01;

import java.util.Objects;

/**
 *
 * @author DAW104
 */
public class Jugador implements Comparable<Jugador> {
    
    private String nombre;
    private double estatura;
    
    //Habría que validar que no pudiera haber altura negativa
    //Pero por agilidad no lo hacemos

    public Jugador(String nombre, double estatura) {
        this.nombre = nombre;
        this.estatura = estatura;
    }
    
    //Como va a ordenar por altura, necesitamos el compareTo    
    @Override
    public int compareTo(Jugador j) {
       return Double.compare(estatura, j.estatura);
    }
    
    //No permite duplicados, lo hacemos por nombre

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

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
        final Jugador other = (Jugador) obj;
        return Objects.equals(this.nombre, other.nombre);
    }
    
    
    
    //Get y set. Pedro sólo pone get porque entiende que no hace falta actualizar
    //altura o nombre con set; si interpretamos que hace falta por si nos hemos
    //equivocado en la altura, por ejemplo, indicárselo

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    
    //toString

    @Override
    public String toString() {        
        return String.format("Jugador: \nNombre: %s \nEstatura: %.2f",
                nombre, estatura);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
