/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_11;

import java.util.Date;

/**
 *
 * @author Jordan
 */
public class Main_Ej_11 {

    /**
     * @param args the command line arguments
     */
    /*
    Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        java.util.Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingresa dia");
        int dia = leer.nextInt();
        System.out.println("Ingresa mes");
        int mes = leer.nextInt();
        System.out.println("Ingresa año");
        int anio = leer.nextInt();
        
        Date fecha = new Date(anio-1900,mes-1,dia);
        
        System.out.println(fecha);
        
        Date fechaActual = new Date();
        
        System.out.println("Entre la fecha ingresada y la actual hay " + Math.abs(fecha.getYear()-fechaActual.getYear()) + " años.");

    }
    /*
    Usando LocalDate
            LocalDate fechaAct =  LocalDate.now();
        int dia, mes, anio, aniodif;
        System.out.println("Ingrese el día, mes y año");
        dia = leer.nextInt();
        mes = leer.nextInt();
        anio = leer.nextInt();
        LocalDate fecha= LocalDate.of(anio, mes, dia);

        aniodif=fechaAct.getYear() - fecha.getYear();
        System.out.println(aniodif);


    }
    */

}
