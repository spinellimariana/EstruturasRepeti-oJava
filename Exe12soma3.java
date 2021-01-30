/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alplista2;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;


public class Exe12soma3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float soma = 0, denominador, numerador = 1;
        int n;

        System.out.println("**SOMA FRACIONÁRIA**");
        System.out.print("Digite um número natural: ");
        n = sc.nextInt();
        denominador = n;

        while (numerador <= n) {
            soma = soma + (numerador / denominador);
            numerador = numerador + 1;
            denominador = denominador - 1;

            System.out.printf("Soma Parcial: %.2f \n", soma);

        }
        System.out.printf("Soma total é igual a: %.2f \n", soma);
    }
}
