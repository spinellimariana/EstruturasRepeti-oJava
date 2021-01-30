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

public class Exe16parImpar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, i = 1, n;

        System.out.println("**VERIFICADOR PAR/ÍMPAR - POSITIVO/NEGATIVO**");
        System.out.print("Digite a quantidade de números que deseja verificar: ");
        x = sc.nextInt();

        do {
            System.out.print("Digite um número qualquer: ");
            n = sc.nextInt();

            if (n > 0) {
                System.out.println("Positivo!");
            } else if (n < 0) {
                System.out.println("Negativo!");
            }
            if (n == 0) {
                System.out.println("Nulo");
            }
            if (n % 2 == 0 && n != 0) {
                System.out.println("Par!");
            } else if (n % 2 != 0 && n != 0) {
                System.out.println("Ímpar!");
            }
            System.out.println();
            i = i + 1;
        } while (i <= x);

    }
}
