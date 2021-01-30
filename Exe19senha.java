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

public class Exe19senha {

    public static void main(String[] args) {
        int senha = 2002, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("**SENHA**");

        do {
            System.out.print("Digite sua senha: ");
            x = sc.nextInt();
            if (x != senha) {
                System.out.println("Senha inválida! Tente novamente.");
            }
        } while (x != senha);
        System.out.println("Acesso permitido!");

    }
}
