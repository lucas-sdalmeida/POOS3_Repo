/*
Descrição do Exercício

Professor: Lucas Bueno Ruas de Oliveira

Leia um conjunto de cinco números inteiros não repetidos em uma única linha e os
armazene em um vetor de 10 posições. A partir daí, leia um número por vez. Se o
número ainda não estiver no conjunto, faça a inclusão após o último número. Caso
ele esteja no conjunto, remova o número e libere espaço no array. A cada itera-
ção imprima o vetor. O programa acaba quando o array ficar totalmente cheio ou
vazio.

            Entrada      Array
      30 2 39 45 89      30 2 39 45 89
                 44      30 2 39 45 89 44
                 31      30 2 39 45 89 44 31
                  2      30 39 45 89 44 31
                 45      30 39 89 44 31
                 81      30 39 89 44 31 81

Qualquer valor fora do domínio de entrada tem como saída esperada a String
"Erro".
*/

package br.edu.ifsp.aluno.poos3.exercicios_lista02.exercicio03;

import java.util.Scanner;

public class Exe03 {
    public static final int ARRAY_LENGTH = 10;
    public static final int ARRAY_INITIAL_LENGTH = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[ARRAY_LENGTH];
        int arrayNextIndex = 0;
        int number;

        for (int i = 0; i < ARRAY_INITIAL_LENGTH; i++) {
            number = scanner.nextInt();

            if (indexOf(numbers, arrayNextIndex - 1, number) >= 0) {
                System.out.println("Erro");
                return;
            }

            if (addToArray(numbers, arrayNextIndex, number))
                arrayNextIndex++;
        }

        while (arrayNextIndex > 0) {
            printArray(numbers, arrayNextIndex - 1);
            number = scanner.nextInt();
            int indexOfNumber = indexOf(numbers, arrayNextIndex - 1, number);

            if (indexOfNumber >= 0 &&
                    removeFromArray(numbers, arrayNextIndex - 1, indexOfNumber)) {
                arrayNextIndex--;
                continue;
            }

            if (addToArray(numbers, arrayNextIndex, number))
                arrayNextIndex++;
        }
    }

    public static int indexOf(int[] array, int lastIndex, int number) {
        if (array == null)
            return -1;
        if (lastIndex < 0 || lastIndex >= array.length)
            return -1;
        for (int i = 0; i <= lastIndex; i++) {
            int arrayNumber = array[i];
            if (number == arrayNumber)
                return i;
        }
        return -1;
    }

    public static boolean addToArray(int[] array, int nextIndex, int number) {
        if (array == null)
            return false;
        if (nextIndex < 0 || nextIndex >= array.length)
            return false;
        array[nextIndex] = number;
        return true;
    }

    public static boolean removeFromArray(int[] array, int lastIndex, int index) {
        if (array == null)
            return false;
        if (lastIndex < 0 || lastIndex >= array.length)
            return false;
        if (index < 0 || index > lastIndex)
            return false;
        for (int i = index + 1; i <= lastIndex; i++) {
            array[i - 1] = array[i];
        }
        return true;
    }

    public static void printArray(int[] array, int lastIndex) {
        if (array == null)
            return;
        if (lastIndex < 0 || lastIndex >= array.length)
            return;
        for (int i = 0; i <= lastIndex; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
