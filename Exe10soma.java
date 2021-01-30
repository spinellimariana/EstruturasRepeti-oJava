package alplista2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Exe10soma {

    public static void main(String[] args) {
        
        float soma = 0, numerador = 1;
        
        System.out.println("**SOMA FRACIONÁRIA**");

        for (int denominador = 1; denominador <= 20; denominador++) {
            soma = soma + (numerador / denominador);
            System.out.printf("Soma Parcial %.2f \n", soma);
     
        }
        System.out.printf("Soma total de 1 até 1/20 é igual a: %.2f \n", soma);
    }
    
}
