/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alplista2;

import java.util.Scanner;

public class Exe14soma4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float soma = 1, denominador, numerador;
        int a;

        System.out.println("**SOMA FRACIONÁRIA**");
        System.out.print("Digite um número natural: ");
        a = sc.nextInt();

        for (int i = 1; i <= a; i++) {

            numerador = i * 2;
            denominador = (i * 2) + 1;
            soma = soma + ((numerador) / (denominador));

            System.out.printf("Soma Parcial %.2f \n", soma);

        }
        System.out.printf("Soma total é igual a: %.2f \n", soma);
    }
}
