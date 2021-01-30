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

public class Exe11soma2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0, numerador = 1, denominador = 1;
        int d;

        System.out.println("**SOMA FRACIONÁRIA**");
        System.out.print("Digite o número natural para o denominador: ");
        d = sc.nextInt();

        while (denominador <= d) {

            soma = soma + (numerador / denominador);
            if (denominador == d) {
                break;
            }
            denominador = denominador + 1;

            soma = soma - (numerador / denominador);
            denominador = denominador + 1;

            System.out.printf("Soma Parcial: %.2f \n", soma);
            

        }
        System.out.printf("Soma total é igual a: %.2f \n", soma);
        
    }

}
