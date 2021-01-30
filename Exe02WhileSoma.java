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

public class Exe02WhileSoma {

    public static void main(String[] args) {
        int soma = 0, n, numero = 1;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("**SOMANDO NÚMEROS INTEIROS COM LAÇO DE REPETIÇÃO**");
        System.out.println();
        System.out.print("Digite um número inteiro qualquer: ");
        n = sc.nextInt();

        while (numero <= n) {
            soma = soma + numero;
            numero = numero + 1;

        }
        System.out.println();
        System.out.println("A soma de todos os inteiros de 1 até " + n + " é igual a: " + soma + ".");
    }
}
