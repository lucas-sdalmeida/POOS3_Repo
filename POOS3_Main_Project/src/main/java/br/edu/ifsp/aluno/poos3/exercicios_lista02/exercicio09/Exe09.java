package br.edu.ifsp.aluno.poos3.exercicios_lista02.exercicio09;

import java.util.Arrays;
import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] boxDimensions = new int [3];
        int[] windowDimensions = new int[2];

        for (int i = 0; i < 3; i++) {
            boxDimensions[i] = Integer.parseInt(scanner.nextLine());
            if (boxDimensions[i] <= 0) {
                System.out.println("Erro");
                scanner.close();
                return;
            }
            Arrays.sort(boxDimensions);
        }

        for (int i = 0; i < 2; i++) {
            windowDimensions[i] = Integer.parseInt(scanner.nextLine());
            if (windowDimensions[i] <= 0) {
                System.out.println("Erro");
                scanner.close();
                return;
            }
            Arrays.sort(windowDimensions);
        }

        if (boxDimensions[0] > windowDimensions[0] || boxDimensions[1] > windowDimensions[1]) {
            System.out.println("N");
            scanner.close();
            return;
        }

        System.out.println("S");
        scanner.close();
    }
}
