/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hoja_01Colecc_EJ_02;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

/**
 *
 * @author DAW104
 */
public class Persona implements Comparable<Persona> {
    //Aquí hay que implementar comparable para poder ordenar por DNI
    //Y después hay que ordenar por nombre y lo haremos con comparator
    //En la clase PersonaPorNombre
    //Ya que necesitamos hacer dos comparaciones diferentes
    //Como por el dni nos piden orden natural, usamos compareTo
    //y comparator para el otro orden de comparación
    
    private String nombre;
    private LocalDate fechaNacimiento;
    private String dni;
   
    //Constructor - Por defecto, datos por teclado
    //Desde la clase ValidaDatos
    public Persona(){
        nombre = ValidaDatos.validarNombre();
        fechaNacimiento = ValidaDatos.validarFecha(); 
        dni = ValidaDatos.validarDni();        
    }
    
    //Constructor sólo con dni para la búsqueda por dni en clase Asociacion

    public Persona(String dni) {
        this.dni = dni;
    }
    
    
    
    //get & set: a medida que los necesite
    //Pedro pregunta si serán siempre necesarios
    //En este caso necesitamos el de nombre para el comparar por nombre
    public String getNombre() {
        return nombre;
    }
    

    @Override
    public int compareTo(Persona persona) {
        return dni.compareTo(persona.dni);
        //se podría poner return this.dni.compareTo(persona.dni); pero no hace falta
    }
    
    @Override
    public boolean equals(Object o){
        return dni.equals(((Persona)o).dni);
    }
    
    //El hash se hace automático con insertcode una vez hecho el equals

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.dni);
        return hash;
    }
    
    
    
    //Calcular la edad de una persona
    //Esta es la más legible
    public int edadPersona(){
      return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);       
        
    }
    
    //Otro método para calcular la edad
    //Pedro lo hace así para que lo veamos detallado
    //Pero podría ir en una línea
    //Pedro indica que la primera es más legible, y esta segunda lo sería
    //en la forma simplificada que comento de ir en una línea
    public int edadPersona2(){
        int edad;
        LocalDate hoy = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, hoy);
        return edad = periodo.getYears();
    }

    @Override
    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");        
        return "Persona{" + "nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento.format(formato) + ", dni=" + dni + '}';
    }    
    
    
    
}
