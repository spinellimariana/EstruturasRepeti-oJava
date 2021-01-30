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

public class Exe15Fatorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, f = 1;

        System.out.println("**FATORIAL**");

        do {
            System.out.print("Digite um número inteiro maior que zero: ");
            x = sc.nextInt();
            if (x <= 0) {
                System.err.println("Opção inválida!");
            }
        } while (x <= 0);

        System.out.println("Os números da sequencia fatorial são:");
        
        for (int i = 1; i <= x; i++) {
            f = f * i;

            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("O fatorial de " + x + "! é: " + f);
    }

}
