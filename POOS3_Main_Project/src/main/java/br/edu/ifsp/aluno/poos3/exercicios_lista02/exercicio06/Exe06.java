/*
Descrição do Exercício

Professor: Lucas Bueno Ruas de Oliveira

Faça um programa que leia um valor inteiro N. Após isso, leia dois vetores A e B
de tamanho N. Em seguida, o programa deve criar um vetor C com os elementos de A
e B intercalados.

Exemplos de entrada e saída:
                Entrada	                            Saída
                      6
            5 6 3 8 2 0	    5 10 6 20 3 30 8 40 2 50 0 60
      10 20 30 40 50 60

                      3
                  1 2 3
                  1 1 1 	                  1 1 2 1 3 1

=> Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão
   (ICMC/USP)
*/

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
