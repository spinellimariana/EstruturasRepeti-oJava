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

public class Exe20doWhileBanco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo, deposito, saque;
        int opcao;

        System.out.println("**CAIXA ELETRÔNICO**");
        System.out.print("Digite o valor do seu saldo atual: ");
        saldo = sc.nextDouble();

        do {
            System.out.println("Escolha uma das opção a seguir:");
            System.out.println("1 - Depósitos.");
            System.out.println("2 - Saques.");
            System.out.println("3 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser depositado: ");
                    deposito = sc.nextDouble();
                    saldo = saldo + deposito;
                    break;
                case 2:
                    System.out.print("Digite o valor que deseja retirar: ");
                    saque = sc.nextDouble();
                    saldo = saldo - saque;
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
            }
                       
        }while(opcao != 3);
        
        System.out.printf("Saldo Final: R$ %.2f reais. \n", saldo);
        
        if (saldo == 0){
            System.out.println("Conta Zerada!");
        }else if (saldo > 0) {
            System.out.println("Conta Preferencial!");
        }else{
            System.out.println("Conta Estourada!");
        }
    
    
    }
}
