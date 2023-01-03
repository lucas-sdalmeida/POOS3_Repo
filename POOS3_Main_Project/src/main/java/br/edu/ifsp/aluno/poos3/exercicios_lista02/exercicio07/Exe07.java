package br.edu.ifsp.aluno.poos3.exercicios_lista02.exercicio07;

import java.util.Arrays;
import java.util.Scanner;

public class Exe07 {
    private static final int NUMBER_OF_PHOTOS_PER_PAGE= 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int[] pageDimensions = new int[2];
        final int[][] photosDimensions = new int[NUMBER_OF_PHOTOS_PER_PAGE][2];

        pageDimensions[0] = scanner.nextInt();
        pageDimensions[1] = scanner.nextInt();
        if (hasNonPositiveNumber(pageDimensions)) {
            System.out.println("Erro");
            return;
        }
        Arrays.sort(pageDimensions);

        for (int i = 0; i < NUMBER_OF_PHOTOS_PER_PAGE; i++) {
            photosDimensions[i][0] = scanner.nextInt();
            photosDimensions[i][1] = scanner.nextInt();
            if (hasNonPositiveNumber(photosDimensions[i])) {
                System.out.println("Erro");
                return;
            }
            Arrays.sort(photosDimensions[i]);
        }
    }

    private static boolean hasNonPositiveNumber(int[] array) {
        if (array == null)
            return false;
        for (int number : array) {
            if (number <= 0) return true;
        }
        return false;
    }
}
