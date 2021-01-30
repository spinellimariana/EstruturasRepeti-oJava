/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADOs;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class ado6Tentativas {

    public static void main(String[] args) {

        String questao;
        int i = 0, c = 3;
        String r = "b";

        Scanner entrada = new Scanner(System.in);

        System.out.println("Você? terá 3 tentativas para responder a pergunta a seguir.");

        do {

            System.out.println("Leia a pergunta com atenção e selecione a alternativa correta: o número 111000111 em númeração binária corresponde à qual número no sistema de numeração decimal?");
            System.out.println("a) 351");
            System.out.println("b) 455"); //alternativa correta
            System.out.println("c) 201");
            System.out.println("d) 564");
            System.out.println("e) 111");
            System.out.print("Selecione a alternativa correta:");

            questao = entrada.next();

            switch (questao) {
                case "b":
                case "B":
                    System.out.println();
                    System.out.println("Resposta correta");
                    break;
                case "a":
                case "A":
                case "c":
                case "C":
                case "d":
                case "D":
                case "e":
                case "E":
                    c = c - 1;
                    System.out.println();
                    System.out.println("Resposta errada");

                    if (c != 0) {
                        System.out.println("Você tem mais " + c + " tentativa(s).");
                        System.out.println();
                    }
                    break;
            }

            i = i + 1;
        } while ((i <= 2) && !(questao.equalsIgnoreCase(r)));

        if (questao.equalsIgnoreCase(r)) {
            System.out.println("Parabéns! Você acertou na " + i + "a tentativa!");
        } else {
            System.out.println("Resposta incorreta nas 3 tentativas!");
        }

    }

}
