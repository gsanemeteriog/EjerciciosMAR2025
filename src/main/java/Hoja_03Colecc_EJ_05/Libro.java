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
public class Libro extends Publicacion {
    //De esta clase no se puede heredar  pero Pedro no hace caso a esto, buscando parece que podría ser public final class
    private int numPaginas;

    public Libro(String titulo, String autor, int dia, int mes, int year, int numPaginas) throws DateTimeException, Exception {
        super(titulo, autor, dia, mes, year);
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    @Override
    public String toString(){
                
        return String.format("Datos del libro: \n %s \nNumero de paginas: %d",
                super.toString(), numPaginas);
        
    }
    
    
}
