/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_1;

/**
 *
 * @author fojomars
 */
public class Libro {
    // Declaración de variables
    private String titulo;
    private String autor;
    private int numExemplares;
    private int numExemplaresPrestados;
    
    // Constructor por defecto
    public Libro(){
    }
    
    // Constructor con parámetros
    public Libro(String titulo, String autor, int numExemplares, int numExemplaresPrestados){
        this.titulo = titulo;
        this.autor = autor;
        this.numExemplares = numExemplares;
        this.numExemplaresPrestados = numExemplaresPrestados;
    }
    
    // Métodos Set y Get de título
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    // Métodos Set y Get de autor
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public String getAutor(){
        return autor;
    }
    
    // Métodos Set y Get de numExemplares
    public void setNumExemplares(int numExemplares){
        this.numExemplares = numExemplares;
    }
    
    public int getNumExemplares(){
        return numExemplares; 
    }
    
    // Métodos Set y Get de numExemplaresPrestados
    public void setNumExemPretados(int numExemPrestados){
        numExemplaresPrestados = numExemPrestados;
    }
    
    public int getNumExemPrestados(){
        return numExemplaresPrestados;
    }
    
    // Método préstamo
    public boolean prestamo(){
        if(this.numExemplaresPrestados>0){
            numExemplares += 1;
            numExemplaresPrestados -= 1;
            return true;
        }
        else{
            return false;
        }
    }
    
    // Método devolución
    
    
    // Método toString
    public boolean devolucion(){
        if(this.numExemplaresPrestados>0){
            numExemplaresPrestados += 1;
            numExemplaresPrestados -= 1;
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public String toString(){
        return "Título: " + titulo + "\nAutor del libro: " + autor + "\nNúmero de exemplares: " + numExemplares + "\nNúmero de exemplares prestados: " + numExemplaresPrestados;
    }
    
    
    
}
