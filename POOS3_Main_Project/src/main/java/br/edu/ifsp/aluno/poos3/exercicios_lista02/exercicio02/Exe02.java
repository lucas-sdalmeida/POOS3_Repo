/*
Descrição do Exercício

Professor: Lucas Bueno Ruas de Oliveira

Faça um programa que construa dois vetores A e B de 5 posições, lendo e adicio-
nando valores inteiros a esses vetores. Crie um terceiro vetor C, composto pela
soma dos elementos de A e B. Por exemplo:

    * C[0] = A[0] + B[0]
    * C[1] = A[1] + B[1]

Após isso, escreva o conteúdo do vetor C, separados por vírgula. Qualquer situa-
ção fora do domínio de entrada resulta em saída uma “Erro”.

Exemplos de entrada e saída esperada:

    * Entrada = 2 5 8 34 5                  | Saída = 10, 56, 10, 50, 10
                8 51 2 16 5

    * Entrada = -10 0 10 20 30              | Saída = 90, 50, 10, -30, -70
                100 50 0 -50 -100
*/

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
