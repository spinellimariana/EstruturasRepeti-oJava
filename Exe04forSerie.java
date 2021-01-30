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
public class Exe04forSerie {

    public static void main(String[] args) {

        System.out.println("**SÉRIE DE 10 EM 10**");

        for (int i = 10; i <= 1000; i += 10) { // ATENÇÃO: i += 10 é a mesma coisa que i = i + 10
            System.out.print(i + " ");

        }
        System.out.println();
    }
}
