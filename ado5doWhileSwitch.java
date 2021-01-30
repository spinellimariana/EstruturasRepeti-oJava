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

public class ado5doWhileSwitch {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("***JOGUINHO***");
            System.out.println("Escolha uma das opções a seguir:");
            System.out.println("1 - Instruções;");
            System.out.println("2 - Jogar;");
            System.out.println("3 - Créditos;");
            System.out.println("4 - Sair.");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Instruções a seguir.");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Prepare-se, o jogo vai começar!!");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Créditos: esse jogo foi desenvolvido por Mariana.");
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    System.out.println();
            }

        } while (opcao != 4);
        System.out.println("Saindo...");

    }
    
   
}
