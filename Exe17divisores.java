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

public class Exe17divisores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, divisor;

        System.out.println("**DIVISORES**");
        System.out.print("Digite um número: ");
        numero = sc.nextInt();
        
        System.out.println("Os divisores do número que você digitou são: ");

        for (int i = 1; i <= numero; i++) {
            divisor = numero % i;
            if (divisor == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
