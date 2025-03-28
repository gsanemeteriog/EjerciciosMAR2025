/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja_03Colecc_EJ_05;

import java.time.DateTimeException;

/**
 *
 * @author DAW104
 */
public class Disco extends Publicacion {
    
    private int duracionMinutos;

    public Disco(String titulo, String autor, int dia, int mes, int year, int duracionMinutos) throws DateTimeException, Exception {
        super(titulo, autor, dia, mes, year);
        this.duracionMinutos = duracionMinutos;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }
    
     @Override
    public String toString(){
                
        return String.format("Datos del disco: \n %s \nDuracion en minutos: %d",
                super.toString(), duracionMinutos);
        
    }
    
}
