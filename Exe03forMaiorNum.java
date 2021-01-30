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

public class Exe03forMaiorNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0, maiorNum;

        System.out.println("**VERIFICADOR DE MAIOR NÚMERO**");
        System.out.println();
        System.out.println("Digite uma sequência de 10 números:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite n." + i + ":");
            maiorNum = sc.nextInt();
            if (maiorNum > numero) {
                numero = maiorNum;
            }
        }
        System.out.println("O maior número digitado é: " + numero + ".");
    }

}
