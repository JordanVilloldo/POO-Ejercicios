/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_10;

import java.util.Arrays;

/**
 *
 * @author Jordan
 */
public class Main_Ej_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        
        //inicializamos arregloA con numeros aleatorios
        for (int i = 0; i < 50; i++) {
            arregloA[i]=Math.random()*10;
        }
        //mostramos arregloA
        System.out.println( Arrays.toString(arregloA));
        
        //ordenamos de menor a mayor el arregloA
        Arrays.sort(arregloA);
        System.out.println( Arrays.toString(arregloA));
        
        /*
        //llenamos los 10 primeros numeros de arregloB con los 10 primeros de arregloA
        for (int i = 0; i < 10; i++) {
            arregloB[i]=arregloA[i];
        }*/
        
        arregloB = Arrays.copyOf(arregloA, 20);// en el 20 seria el nuevo tamaño del arreglo, pero luego reemplazamos
        
        
        //llenamos los ultimos 10 del arregloB con 0.5
        Arrays.fill(arregloB, 10,20, 0.5);
        
        //mostramos arregloA y arregloB
        
        System.out.println("Arreglo A");
        System.out.println( Arrays.toString(arregloA));
        
        System.out.println("Arreglo B");
        System.out.println( Arrays.toString(arregloB));
    }   
    
}
