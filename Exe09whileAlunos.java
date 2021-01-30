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

public class Exe09whileAlunos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdAlunos, i = 1, contador = 0;
        float nota, soma = 0, media;
        
        System.out.println("**INFORMAÇÕES DA SUA TURMA**");
        
        System.out.print("Quantos alunos existem na turma: ");
        qtdAlunos = sc.nextInt();

        while (i <= qtdAlunos) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            nota = sc.nextInt();

            soma = soma + nota;
            contador = contador + 1;

            i = i + 1;
        }

        media = soma / contador;
        System.out.printf("A média artimética das notas de todos os alunos é igual a: %.2f: \n", media);
    }
}
