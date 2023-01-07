/*
Descrição do Exercício

Professor: Lucas Bueno Ruas de Oliveira

Faça um programa que construa dois vetores A e B de cinco posições, lendo e adi-
cionando valores inteiros a esses vetores. Crie um terceiro vetor C, composto
pela soma dos elementos de A e B.
*/

package br.edu.ifsp.aluno.poos3.exercicios_lista03.exercicio06;

import java.util.Arrays;
import java.util.Scanner;

public class Exe06 {
    private static final int ARRAYS_LENGTH = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayA = new int[ARRAYS_LENGTH];
        int[] arrayB = new int[ARRAYS_LENGTH];
        int[] arrayC = new int[ARRAYS_LENGTH];

        for (int i = 0; i < ARRAYS_LENGTH; i++) {
            arrayA[i] = scanner.nextInt();
        }

        for (int i = 0; i < ARRAYS_LENGTH; i++) {
            arrayB[i] = scanner.nextInt();

            long sum = (long)arrayA[i] + arrayB[i];

            if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) {
                System.out.println("Erro");
                scanner.close();
                return;
            }

            arrayC[i] = (int)sum;
        }

        System.out.println(Arrays.toString(arrayA));
        System.out.println(Arrays.toString(arrayB));
        System.out.println(Arrays.toString(arrayC));
        scanner.close();
    }
}
