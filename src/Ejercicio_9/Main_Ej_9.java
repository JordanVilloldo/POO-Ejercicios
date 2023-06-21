/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_9;

/**
 *
 * @author Jordan
 */
public class Main_Ej_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        MatematicaService ms = new MatematicaService();

          double num1 = Math.random()*10;
          double num2 = Math.random()*10;
          
          Matematica m2 = new Matematica();
          
          m2.setNum1(num1);
          m2.setNum2(num2);
          
        Matematica m1 = new Matematica(0, 3);//Para testear manual

        System.out.println(ms.devolverMayor(m1));
        ms.calcularPotencia(m1);

        System.out.println(ms.calculaRaiz(m1));
    }

}
