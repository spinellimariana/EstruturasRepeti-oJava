/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADOs;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ado10jogoAdvinha {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random aleatorio = new Random();
        int numero, c = 1, tentativa;

        numero = (aleatorio.nextInt(100) + 1);
        

        System.out.println("**ADVINHANDO OS NÚMEROS**");
        System.out.println();
        System.out.println("O computador selecionou um número inteiro de 1 a 100.");
        System.out.println();
        System.out.println("Você? terá 5 chances para tentar advinhá-lo!");
        System.out.println();

        do {
            System.out.print(c + "a tentativa: ");
            tentativa = input.nextInt();

            if (tentativa == (numero + 1) || tentativa == (numero - 1)) {
                System.out.println("Tá? QUENTE!");
                System.out.println();
            } else if (tentativa > numero) {
                System.out.println("O número que você? digitou é MAIOR que o número escolhido!");
                System.out.println();
            } else if (tentativa < numero) {
                System.out.println("O número que você? digitou é MENOR que o número escolhido!");
                System.out.println();
            } else if (tentativa == numero) {
                System.out.println("Parabéns! você? ganhou o jogo!");
                break;
            }
            c++;
        } while (c <= 5);

        if (tentativa != numero) {
            System.out.println("GAME OVER!");
        }
        System.out.println("O número selecionado pelo computador foi: " + numero);

    }

}
