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
public class Exe08media {

    public static void main(String[] args) {

        int soma = 0, contador = 0, x, media;
        
        System.out.println("**MÉDIA ARITMÉTICA**");
        System.out.println();

        for (int i = 13; i <= 73; i++) {
            x = i % 2;

            if (x == 0) {
                soma = soma + i;
                contador = contador + 1;
            }
        }
        media = soma / contador;
        System.out.println("A média aritmética dos números pares compreendidos entre 13 e 73 é de: " + media + ".");
    }
}
