/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja_03Colecc_EJ_05;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 *
 * @author DAW104
 */
public abstract class Publicacion {
    //Clase no instanciable: abstracta
    
    protected String titulo;
    protected String autor;
    protected LocalDate fecha;
    
    //Pedro va a validar fecha en el propio constructor
    //Lo idea es hacerlo en clase validaciones
    
    public Publicacion(String titulo, String autor, int dia, int mes, int year) throws DateTimeException, Exception{
        
        if (dia <0 || dia > 31) 
            throw new Exception("Fecha incorrecta. Revisa el dia.");
        if (mes<0 || mes>12) 
            throw new Exception("Fecha incorrecta. Revisa el mes.");
        if (year > LocalDate.now().getYear())
            throw new Exception("Fecha incorrecta. Revisa el anyo.");              
        
        this.titulo = titulo;
        this.autor = autor;
        fecha = LocalDate.of(year, mes, dia); 
    }   
    
    //Gets y sets

    //No los pone porque al estar protected se pueden alcanzar desde las clases que heredan
    
    //Hashcode e equals

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.titulo);
        hash = 47 * hash + Objects.hashCode(this.autor);
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
        final Publicacion other = (Publicacion) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return Objects.equals(this.autor, other.autor);
    }
    
    //toString

    @Override
    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return String.format("Publicacion: \nTitulo: %s \nAutor: %s \nFecha: %s",
                titulo, autor, fecha.format(formato));
    }
    
    
    
    
}
