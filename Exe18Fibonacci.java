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

public class Exe18Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, fibA = 0, fibP = 1, aux, i = 1;

        System.out.println("**SÉRIE DE FIBONACCI**");
        System.out.println();
        System.out.print("Digite um número menor que 46: ");
        n = sc.nextInt();

        if (n > 46) {
            System.out.println("Opção inválida!");
            while (n > 46) {
                System.out.println();
                System.out.print("Digite um número menor que 46: ");
                n = sc.nextInt();
            }
        }

        if (n < 46) {
            System.out.println();
            System.out.println("Os " + n + " primeiros números da sequência de Fibonacci são: ");
            while (i <= n) {
                System.out.print(fibA + " ");
                aux = fibA;
                fibA = fibA + fibP;
                fibP = aux;
                i = i + 1;
            }
        }
        System.out.println();
    }
}
