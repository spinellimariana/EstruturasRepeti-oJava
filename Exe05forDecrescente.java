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
public class Exe05forDecrescente {

    public static void main(String[] args) {

        System.out.println("**NÚMEROS PARES EM ORDEM DECRESCENTE COM LAÇO DE REPETIÇÃO**");

        for (int i = 100; i >= 1; i -= 2) {   //  ATENÇÃO i -= 2 é a mesma coisa que i = i - 2
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
