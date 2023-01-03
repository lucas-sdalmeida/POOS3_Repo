/*
Descrição do Exercício

Professor: Lucas Bueno Ruas de Oliveira

Leia cinco números inteiros e imprima o maior e o menor números. Cada
número da entrada deve ser lido após pressionar 'Enter'.
*/

package br.edu.ifsp.aluno.poos3.exercicios_lista03.exercicio01;

import java.util.Scanner;

public class Exe01 {
    private static final int QUANTITY_OF_NUMBERS = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int greatestNumber = 0;
        int lowestNumber = 0;

        for (int i = 0; i < QUANTITY_OF_NUMBERS; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (i == 0 || greatestNumber < number)
                greatestNumber = number;

            if (i == 0 || lowestNumber > number)
                lowestNumber = number;
        }

        System.out.println("Greatest Number = " + greatestNumber);
        System.out.println("Lowest Number = " + lowestNumber);
        scanner.close();
    }
}
