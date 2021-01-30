/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADOs;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ado9equacao1grau {

    public static void main(String[] args) {
        int min, max;
        double a, b, x;
        Random equacao = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("**EQUAÇÃO DE 1º GRAU**");
        System.out.println();

        System.out.print("Digite um valor máximo: ");
        max = sc.nextInt();

        System.out.print("Digite um valor mínimo: ");
        min = sc.nextInt();
        System.out.println();

        b = equacao.nextInt((max - min) + 1) + min;

        do {
            a = equacao.nextInt((max - min) + 1) + min;
        } while (a == 0);

        System.out.println("O valor de a é: " + a + ".");
        System.out.println("O valor de b é: " + b + ".");
        System.out.println("Sua equação de 1º grau gerada aleatoriamente é: " + a + "x + (" + b + ") = 0");
        System.out.println();

        x = -b / a;
        System.out.printf("O valor de X é igual a: %.2f \n", x);

    }

}
