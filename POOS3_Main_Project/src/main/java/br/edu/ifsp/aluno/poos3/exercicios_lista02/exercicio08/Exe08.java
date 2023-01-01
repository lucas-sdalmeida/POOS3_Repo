package br.edu.ifsp.aluno.poos3.exercicios_lista02.exercicio08;

import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfGifts;
        int weightDifference = 0;

        numberOfGifts = Integer.parseInt(scanner.nextLine());

        if (numberOfGifts <= 0) {
            System.out.println("Erro");
            scanner.close();
            return;
        }

        for (int i = 0; i < numberOfGifts; i++) {
            int giftWeight = scanner.nextInt();

            if (giftWeight <= 0) {
                System.out.println("Erro");
                scanner.close();
                return;
            }

            if (weightDifference + giftWeight > 5 && weightDifference - giftWeight < -5) {
                System.out.println("N");
                scanner.close();
                return;
            }
            if (Math.abs(weightDifference + giftWeight) <= Math.abs(weightDifference - giftWeight)) {
                weightDifference += giftWeight;
                continue;
            }
            weightDifference -= giftWeight;
        }

        System.out.println("S");
        scanner.close();
    }
}
