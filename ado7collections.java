/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADOs;

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class ado7collections {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean acertou = false;
        String opcaoCorreta = "455", opcao;
        ArrayList<String> alt = new ArrayList<>();
        alt.add("351");
        alt.add("455"); // resposta correta
        alt.add("201");
        alt.add("546");
        alt.add("111");

        do {

            Collections.shuffle(alt);
            Collections.shuffle(alt);

            System.out.println("Leia a pergunta com atenção e selecione a alternativa correta: "
                    + "o número 111000111 em númeração binária corresponde à qual número no sistema "
                    + "de numeração decimal?");
            System.out.println("a) " + alt.get(0));
            System.out.println("b) " + alt.get(1));
            System.out.println("c) " + alt.get(2));
            System.out.println("d) " + alt.get(3));
            System.out.println("e) " + alt.get(4));
            System.out.print("Selecione a alternativa correta: ");

            opcao = entrada.next();

            switch (opcao) {
                case "a":
                case "A":
                    if (opcaoCorreta.equals(alt.get(0))) {
                        acertou = true;
                    }
                    break;
                case "b":
                case "B":
                    if (opcaoCorreta.equals(alt.get(1))) {
                        acertou = true;
                    }
                    break;
                case "c":
                case "C":
                    if (opcaoCorreta.equals(alt.get(2))) {
                        acertou = true;
                    }
                    break;
                case "d":
                case "D":
                    if (opcaoCorreta.equals(alt.get(3))) {
                        acertou = true;
                    }
                    break;
                case "e":
                case "E":
                    if (opcaoCorreta.equals(alt.get(4))) {
                        acertou = true;
                    }
                    break;
            }

            if (acertou == true) {
                System.out.println("Resposta correta!");
                System.out.println();
            } else {
                System.out.println("Resposta errada!");
                System.out.println();
            }
        } while (acertou == false);

    }
}
