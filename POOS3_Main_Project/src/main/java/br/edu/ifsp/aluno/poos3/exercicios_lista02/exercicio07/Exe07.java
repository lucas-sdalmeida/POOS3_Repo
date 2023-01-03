/*
Descrição do Exercício

Professor: Lucas Bueno Ruas de Oliveira

Clara está organizando as fotos da sua última viagem num álbum de fotos. Como
ela tem muitas fotos, para economizar páginas do álbum ela quer colar duas fo-
tos por página do álbum.

Como as fotos são retangulares, as fotos podem ser coladas giradas (mas sempre
com lados paralelos aos da página do álbum, para preservar o equilíbrio estético
do álbum), mas elas devem sempre ficar inteiramente contidas no interior da pá-
gina, e não devem se sobrepor.

Em geral, das muitas formas de posicionar as fotos do álbum só algumas (ou ne-
nhuma) satisfazem estas restrições, então pode ser difícil decidir se é possível
colar as duas fotos em uma mesma página do álbum, e por isso Clara pediu a sua
ajuda para escrever um programa que, dadas as dimensões da página e das fotos,
decide se é possível colar as fotos na página.

Faça um programa que receba como entrada na primeira linha dois inteiros X e Y,
indicando a largura e a altura da página do álbum. Cada uma das duas linhas se-
guintes contém dois inteiros L e H, indicando a largura e a altura das fotos.

Seu programa deve imprimir uma única linha, contendo um único caractere: "S",
se é possível colar as duas fotos na página do álbum, e "N", caso contrário.

Exemplos de entrada e saída:

    Entrada	    Saída
        7 5
        3 4         S
        3 4

      10 10
        6 6         N
        6 6

Fonte: Adaptado de Olimpíada Brasileira de Informática (OBI)

=> Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão
   (ICMC/USP)
*/

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
