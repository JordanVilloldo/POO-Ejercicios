/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_12;

/**
 *
 * @author Jordan
 */
public class Main_Ej_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona();
        
        p1.crearPersona();
        
        System.out.println("La edad es: " + p1.calcularEdad());
        
        System.out.println("La edad de " + p1.getNombre() + " es menor que 35?" );
        System.out.println(p1.menorQue(35));
        
        p1.mostrarPersona();
      
    }
    
}
