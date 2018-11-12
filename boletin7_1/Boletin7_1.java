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
public class Boletin7_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro obxLibro = new Libro("El Camino", "Miguel Delibes",1000,100);
        System.out.println(obxLibro.toString());
        obxLibro.prestamo();
        System.out.println(obxLibro.toString());
        obxLibro.devolucion();
        System.out.println(obxLibro.toString());
        
    }
    
}
