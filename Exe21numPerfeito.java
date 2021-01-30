/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alplista2;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Exe21numPerfeito {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, d, soma = 0, divisores;

        System.out.println("**VERIFICADOR DE NÚMERO PERFEITO**");
        System.out.println();
        System.out.print("Digite um número: ");
        n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            d = n % i;
            if (d == 0) {
                soma = soma + i;

            }
        }
        if (soma == n) {
            System.out.println();
            System.out.println("O número que você digitou é perfeito, a soma dos seus dividosores é igual a ele mesmo.");
            System.out.println("Soma dos divisores é igual a: " + soma + ".");

        } else {
            System.out.println();
            System.out.println("Número imperfeito");
        }
    }
}
