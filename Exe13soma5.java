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
public class Exe13soma5 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        float soma = 0, denominador = 1, numerador = 1;
        int n;

        System.out.println("**SOMA FRACIONÁRIA**");
        System.out.print("Digite um número natural: ");
        n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {

            numerador = numerador * i;
            denominador = denominador * ((i * 2) - 1);
            soma = soma + (numerador) / (denominador);

            System.out.printf("Soma Parcial %.2f \n", soma);

        }
        System.out.printf("Soma total é igual a: %.2f \n", soma);
    }
}
