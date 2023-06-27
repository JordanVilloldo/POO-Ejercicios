/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_12;

import java.util.Date;

/**
 *
 * @author Jordan
 */
public class Persona {

    java.util.Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");

    private String nombre;
    private Date fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    //crear persona
    public void crearPersona() {
        System.out.println("Introduce tu nombre");
        this.nombre = leer.next();

        System.out.println("Introduce el dia de tu nacimiento");
        int dia = leer.nextInt();
        System.out.println("Introduce el mes de tu nacimiento");
        int mes = leer.nextInt();
        System.out.println("Introduce el año de tu nacimiento");
        int anio = leer.nextInt();
        this.fechaNacimiento = new Date(anio - 1900, mes - 1, dia);

    }
    
    //calcular edad
    public int calcularEdad() {
        Date hoy = new Date();
        return hoy.getYear() - this.fechaNacimiento.getYear();

    }
    
    //metodo menorQue
    public boolean menorQue(int edad){
        return calcularEdad()<edad;
    }
    
    //metodo mostrarPersona
        public void mostrarPersona(){
        System.out.println("Nombre: " + nombre
                + "\nFecha de nacimiento: " + fechaNacimiento);
    }

}

