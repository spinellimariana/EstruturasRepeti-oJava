/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADOs;

/**
 *
 * @author Lenovo
 */
import java.util.Random;

public class ado8dados {

    public static void main(String[] args) {
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, valor;
        double a, b, c, d, e, f;
        Random dado = new Random();

        System.out.println("**LANÇAMENTO DE DADOS**");

        for (int i = 1; i < 1000000; i++) {
            valor = (dado.nextInt(6) + 1); //laço para randomizar os números
            //System.out.println("Face do dado: " + valor);

            if (valor == 1) {
                c1 = c1 + 1;
            } else if (valor == 2) {
                c2 = c2 + 1;
            } else if (valor == 3) {
                c3 = c3 + 1;         //if-else para identificar quantidade de vezes que cada número foi sorteado
            } else if (valor == 4) {
                c4 = c4 + 1;
            } else if (valor == 5) {
                c5 = c5 + 1;
            } else {
                c6 = c6 + 1;
            }
        }

        // porcentagem da face 1;
        System.out.println();
        System.out.println("O número 1 foi sorteado " + c1 + " vezes.");
        a = ((double) c1 * 100) / 1000000;  // CAST NA VARI�?VEL PARA APARECER EM N�?MERO QUEBRADO
        System.out.println("Percentual total de " + a + "%");
        System.out.println();

        //pocentagem da face 2
        System.out.println("O número 2 foi sorteado " + c2 + " vezes.");
        b = ((double) c2 * 100) / 1000000;  // CAST NA VARI�?VEL PARA APARECER EM N�?MERO QUEBRADO
        System.out.println("Percentual total de " + b + "%.");
        System.out.println();

        //porcentagem da face 3
        System.out.println("O número 3 foi sorteado " + c3 + " vezes.");
        c = ((double) c3 * 100) / 1000000;   // CAST NA VARI�?VEL PARA APARECER EM N�?MERO QUEBRADO
        System.out.println("Percentual total de " + c + "%.");
        System.out.println();

        //porcentagem da face 4
        System.out.println("O número 4 foi sorteado " + c4 + " vezes.");
        d = ((double) c4 * 100) / 1000000;  // CAST NA VARI�?VEL PARA APARECER EM N�?MERO QUEBRADO
        System.out.println("Percentual total de " + d + "%.");
        System.out.println();

        //porcentagem da face 5
        System.out.println("O número 5 foi sorteado " + c5 + " vezes.");
        e = ((double) c5 * 100) / 1000000; // CAST NA VARI�?VEL PARA APARECER EM N�?MERO QUEBRADO
        System.out.println("Percentual total de " + e + "%.");
        System.out.println();

        //porcentagem da face 6
        System.out.println("O número 6 foi sorteado " + c6 + " vezes.");
        f = ((double) c6 * 100) / 1000000;// CAST NA VARI�?VEL PARA APARECER EM N�?MERO QUEBRADO
        System.out.println("Percentual total de " + f + "%.");
        System.out.println();
    }
}
