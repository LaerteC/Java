/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplo;

import java.util.Random;

/**
 *
 * @author laerte
 */
public class Exer2 {

    public static void main(String[] args) {

        int[][] numero = new int[10][10];

        Random aleatorio = new Random();

        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero[i].length; j++) {
                numero[i][j] = aleatorio.nextInt(10);
            }
        }

        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero[i].length; j++) {

                System.out.print(numero[i][j] + " ");
            }

            System.out.println();
        }

        int maiorL5 = 0;
        int menorL5 = 101;
        int linha5 = 5;

        for (int i = 0; i < numero[linha5].length; i++) {
            if (numero[linha5][i] > maiorL5) {
                maiorL5 = numero[linha5][i];
            }

            if (numero[linha5][i] < menorL5) {
                menorL5 = numero[linha5][i];
            }
        }

        System.out.println(maiorL5 + " Em relação a linha 5 ");

        System.out.println(menorL5 + "  EM relação a linha 5 ");

        int maiorL7 = 0;
        int menorL7 = 101;
        int coluna7 = 7;

        for (int i = 0; i < numero.length; i++) {

            if (numero[i][coluna7] > maiorL7) {

                maiorL7 = numero[i][coluna7];
            }

            if (numero[i][coluna7] < menorL7) {

                menorL7 = numero[i][coluna7];
            }

        }

        System.out.println(maiorL7 + "  Em relação a coluna 7");
        System.out.println(menorL7 + "  Em relação a coluna 7");
    }

}
