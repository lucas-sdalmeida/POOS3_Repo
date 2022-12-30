package br.edu.ifsp.aluno.poos3.exercicios_lista02.exercicio07;

import java.util.Arrays;
import java.util.Scanner;

public class Exe07 {
    private static final int NUMBER_OF_PHOTOS_PER_PAGE= 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int[] pageDimensions = new int[2];
        final int[][] photosDimensions = new int[NUMBER_OF_PHOTOS_PER_PAGE][2];
        final int[] usedLengths = new int[2];

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

        for (int[] photoDimensions : photosDimensions) {
            int[] dimensionThatFits = somehowFits(photoDimensions, usedLengths, pageDimensions);

            if (dimensionThatFits != null) {
                int otherPageDimension = dimensionThatFits[1] == 0 ? 1 : 0;
                int otherPhotoDimension = dimensionThatFits[0] == 0 ? 1 : 0;
                usedLengths[dimensionThatFits[1]] += photoDimensions[dimensionThatFits[0]];
                usedLengths[otherPageDimension] += photoDimensions[otherPhotoDimension];
                continue;
            }

            System.out.println("N");
            return;
        }

        System.out.println("S");
    }

    private static boolean hasNonPositiveNumber(int[] array) {
        if (array == null)
            return false;
        for (int number : array) {
            if (number <= 0) return true;
        }
        return false;
    }

    private static int[] somehowFits(int[] dimensions, int[] usedLengths, int[] destiny) {
        if (dimensions == null || usedLengths == null || destiny == null)
            return null;
        if (dimensions.length != usedLengths.length && dimensions.length != destiny.length)
            return null;

        for (int i = dimensions.length - 1; i >= 0; i--) {
            int dimension = dimensions[i];

            for (int j = 0; j < usedLengths.length; j++) {
                int usedLength  = usedLengths[j];

                if (dimension + usedLength <= destiny[j])
                    return new int[] {i, j};
            }
        }
        return null;
    }
}
