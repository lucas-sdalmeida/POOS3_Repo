package br.edu.ifsp.aluno.poos3.exercicios_lista02.exercicio02;

import java.util.Scanner;

public class Exe02 {
    public static final int ARRAYS_LENGTH = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int[] arrayA = new int[ARRAYS_LENGTH];
        final int[] arrayB = new int[ARRAYS_LENGTH];
        final int[] arrayC = new int[ARRAYS_LENGTH];

        System.out.println(Integer.MAX_VALUE);

        for (int i = 0; i < ARRAYS_LENGTH; i++) {
            arrayA[i] = scanner.nextInt();
        }
        for (int i = 0; i < ARRAYS_LENGTH; i++) {
            arrayB[i] = scanner.nextInt();
            long sum = (long) arrayA[i] + arrayB[i];
            if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) {
                System.out.println("Erro");
                return;
            }
            arrayC[i] = arrayA[i] + arrayB[i];
        }
        for (int i = 0; i < ARRAYS_LENGTH; i++) {
            System.out.print(arrayC[i] + ((i < ARRAYS_LENGTH - 1) ? ", " : ""));
        }
    }
}
