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

public class Exe06doWhileAlunos {

    public static void main(String[] args) {
        int i = 1, idade, maisVelho = 0;
        String nome, nome2 = "A", genero, gen2 = "N";
        Scanner sc = new Scanner(System.in);
        
        System.out.println("**APRESENTANDO OS DADOS DO ALUNO MAIS VELHO**");
        System.out.println();

        do {
            System.out.print("Informe o nome do aluno: ");
            nome = sc.next();
            System.out.print("Informe a idade do aluno: ");
            idade = sc.nextInt();
            System.out.print("Informe o gênero do aluno: ");
            genero = sc.next();
            System.out.println();

            if (idade > maisVelho) {
                maisVelho = idade;
                nome2 = nome;
                gen2 = genero;
                
            }

            i = i + 1;
        } while (i <= 5);
        System.out.println("O aluno (a) mais velho da turma é: " + nome2 + ".");
        System.out.println(nome2 + " tem " + maisVelho + " anos.");
        System.out.println("Gênero: " + gen2 + ".");

    }
}
