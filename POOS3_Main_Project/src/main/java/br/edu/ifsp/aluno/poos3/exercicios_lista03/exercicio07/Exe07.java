/*
Descrição do Exercício

Professor: Lucas Bueno Ruas de Oliveira

Faça um programa que efetue a leitura de 5 elementos inteiros para um vetor A.
No final, apresente o total da soma de todos os elementos ímpares e pares.
*/

package br.edu.ifsp.aluno.poos3.exercicios_lista03.exercicio07;

import java.util.Arrays;
import java.util.Scanner;

public class Exe07 {
    private static final int ARRAY_LENGTH = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[ARRAY_LENGTH];
        int sumOfEvens = 0;
        int sumOfOdds = 0;

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            array[i] = scanner.nextInt();

            if (array[i] % 2 == 0) {
                sumOfEvens += array[i];
                continue;
            }

            sumOfOdds += array[i];
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Sum Of Evens = " + sumOfEvens);
        System.out.println("Sum Of Odds = " + sumOfOdds);
        scanner.close();
    }
}
