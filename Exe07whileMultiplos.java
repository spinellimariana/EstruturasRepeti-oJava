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
public class Exe07whileMultiplos {

    public static void main(String[] args) {
        int i = 0, c = 1;
        System.out.println("**MÚLTIPLOS DE 7 MENORES QUE 200**");
        System.out.println();

        while (i < 200) {
            i = c * 7;
            if (i > 200) {
                break;
            }
            c = c + 1;
            System.out.println(i);
        }
    }

}
