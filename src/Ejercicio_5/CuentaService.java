/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_5;

/**
 *
 * @author Jordan
 */
public class CuentaService {
    
    java.util.Scanner leer = new java.util.Scanner(System.in).useDelimiter("\n");
    
    public Cuenta crearCuenta(){
        
        System.out.println("Ingrese numero de cuenta");
        int numeroCuenta = leer.nextInt();
        
        System.out.println("Ingrese el DNI");
        long dni = leer.nextLong();
        
        System.out.println("Ingrese su saldo acutal");
        int saldoActual = leer.nextInt();
        
        return new Cuenta(numeroCuenta,dni,saldoActual);
    }
    
    public void ingresar(double ingreso, Cuenta c1){
        
        c1.setSaldoActual((int) (c1.getSaldoActual()+ingreso));
        
    }
    
   // public void 
}
