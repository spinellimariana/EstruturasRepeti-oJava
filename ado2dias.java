/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADOs;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class ado2dias {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int hA, mA, sA;
        String dS, dia = "x", dom = "domingo", seg = "segunda", seg2 = "segunda-feira", ter = "terça", ter2 = "terça-feira";
        String qua = "quarta", qua2 = "quarta-feira", qui = "quinta", qui2 = "quinta-feira", sex = "sexta", sex2 = "sexta-feira", sab = "sábado";
        boolean opcaoIn;
        int teste;

        System.out.println("**DEFINIÇÃO DO ALARME**");

        do {
            do {
                System.out.println("Dia da semana: ");
                dS = input.next();
                if (dS.equalsIgnoreCase(dom)) {
                    opcaoIn = true;
                } else if (dS.equalsIgnoreCase(seg) || dS.equalsIgnoreCase(seg2)) {
                    opcaoIn = true;
                } else if (dS.equalsIgnoreCase(ter) || dS.equalsIgnoreCase(ter2)) {
                    opcaoIn = true;
                } else if (dS.equalsIgnoreCase(qua) || dS.equalsIgnoreCase(qua2)) {
                    opcaoIn = true;
                } else if (dS.equalsIgnoreCase(qui) || dS.equalsIgnoreCase(qui2)) {
                    opcaoIn = true;
                } else if (dS.equalsIgnoreCase(sex) || dS.equalsIgnoreCase(sex2)) {
                    opcaoIn = true;
                } else if (dS.equalsIgnoreCase(sab)) {
                    opcaoIn = true;
                } else {
                    opcaoIn = false;
                    System.out.println("Dia da semana inválido, tente novamente!");
                }
            } while (opcaoIn == false);

            System.out.println("Hora: ");
            hA = input.nextInt();

            System.out.println("Minutos: ");
            mA = input.nextInt();

            System.out.println("Segundo: ");
            sA = input.nextInt();

            for (int i = 1; i <= 7; i++) {
                if (i == 1) {
                    dia = dom;
                    System.out.println("DOMINGO");
                } else if (i == 2) {
                    dia = seg;
                    System.out.println("SEGUNDA");
                } else if (i == 3) {
                    dia = ter;
                    System.out.println("TERÇA");
                } else if (i == 4) {
                    dia = qua;
                    System.out.println("QUARTA");
                } else if (i == 5) {
                    dia = qui;
                    System.out.println("QUINTA");
                } else if (i == 6) {
                    dia = sex;
                    System.out.println("SEXTA");
                } else if (i == 7) {
                    dia = sab;
                    System.out.println("SáBADO");
                }

                for (int h = 0; h <= 23; h++) {
                    for (int m = 0; m <= 59; m++) { // também pode ser h<60;
                        for (int s = 0; s <= 59; s++) {
                            System.out.printf("%d:%d:%d \n", h, m, s);

                            if ((h == hA) && (m == mA) && (s == sA) && dS.equalsIgnoreCase(dia)) {
                                System.out.println("ALARME!!");
                                break;
                            }
                        }
                        if (h == hA && m == mA && dS.equalsIgnoreCase(dia)) {
                            break;
                        }
                    }
                    if (h == hA && dS.equalsIgnoreCase(dia)) {
                        break;
                    }
                }
                if (dS.equalsIgnoreCase(dia)) {
                    break;
                }
            }
            System.out.println("1 - Para continuar");
            teste = input.nextInt();
        } while (teste == 1);

    }

}
