/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja_05Colecc_EJ_01;

/**
 *
 * @author DAW104
 */
public class Capitulo {
    
    private int numTemporada;
    private int numCapitulo;
    private String descripcion;

    public Capitulo(int numTemporada, int numCapitulo, String descripcion) {
        this.numTemporada = numTemporada;
        this.numCapitulo = numCapitulo;
        this.descripcion = descripcion;
    }
    
    //Get y set que consideremos

    public int getNumTemporada() {
        return numTemporada;
    }

    public void setNumTemporada(int numTemporada) {
        this.numTemporada = numTemporada;
    }

    public int getNumCapitulo() {
        return numCapitulo;
    }

    public void setNumCapitulo(int numCapitulo) {
        this.numCapitulo = numCapitulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    //No pide toString pero lo añado:
    
    @Override
    public String toString() {        
        return String.format("Jugador: \nTemporada: %d \nCapitulo: %d \nDescripcion: %s",
                numTemporada, numCapitulo, descripcion);
    }
    
    
    
    
    
    
}
