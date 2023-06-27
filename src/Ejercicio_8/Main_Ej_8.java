/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_8;

import java.util.Scanner;

/**
 *
 * @author Jordan
 */
public class Main_Ej_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cadena c1 = new Cadena();
        CadenaService cs = new CadenaService();

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese una frase");
        c1.setFrase(scanner.next());
        c1.setLongitud(c1.getFrase().length());
        System.out.println(c1.getLongitud());

        System.out.println("");

        //cs.reemplazar("$", c1);

        cs.mostrarVocales(c1);
        cs.invertirFrase(c1);
        cs.vecesRepetido(c1, 'c');
        cs.compararLongitud(c1, "como estas");
        cs.unirFrases(c1);
        cs.reemplazar("%", c1);
        System.out.println("");
        System.out.println(cs.contiene(c1, 'u'));

    }

}
