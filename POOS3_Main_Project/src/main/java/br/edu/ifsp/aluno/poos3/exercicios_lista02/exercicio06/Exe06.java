package br.edu.ifsp.aluno.poos3.exercicios_lista02.exercicio06;

import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraysLength;
        int[] arrayA;
        int[] arrayB;
        int[] arrayC;

        arraysLength = Integer.parseInt(scanner.nextLine());

        if (arraysLength <= 0) {
            System.out.println("Erro");
            return;
        }

        arrayA = new int[arraysLength];
        arrayB = new int[arraysLength];
        arrayC = new int[arraysLength * 2];

        for (int i = 0; i < arraysLength; i++) {
            arrayA[i] = scanner.nextInt();
            arrayC[i * 2] = arrayA[i];
        }
        for (int i = 0; i < arraysLength; i++) {
            arrayB[i] = scanner.nextInt();
            arrayC[i * 2 + 1] = arrayB[i];
        }

        for (int i = 0; i < arrayC.length; i++) {
            int number = arrayC[i];
            System.out.print(number + ((i < arrayC.length - 1) ? " " : "\n"));
        }
    }
}
