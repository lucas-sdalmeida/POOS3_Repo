/*
Descrição do Exercício

Professor: Lucas Bueno Ruas de Oliveira

Um matemático italiano da idade média conseguiu modelar o ritmo do crescimento
da população de coelhos por meio de uma sequência de números naturais que passou
a ser conhecida como Sequência de Fibonacci. Tal sequência é descrita da seguin-
te forma:

    * Fi = Fi-1 + Fi-2 para i > 2;
    * F2 = 1; e
    * F1 = 1.

Escreva dois algoritmos para calcular os n primeiros números de uma Sequência de
Fibonnaci, sendo um na forma iterativa e outro na forma recursiva.
*/

package br.edu.ifsp.aluno.poos3.exercicios_lista03.exercicio04;

import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fibonacciLength;

        fibonacciLength = Integer.parseInt(scanner.nextLine());

        if (fibonacciLength < 1) {
            System.out.println("Erro");
            scanner.close();
            return;
        }

        iterativeFibonacci(fibonacciLength);
        System.out.println();

        for (int i = 1; i <= fibonacciLength; i++) {
            System.out.print(recursiveFibonacci(i) + " ");
        }
        System.out.println();
        scanner.close();
    }

    private static void iterativeFibonacci(int n) {
        if (n < 1)
            return;

        int a;
        int b = 1;
        int c = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(c + " ");
            a = c;
            c = b;
            b += a;
        }

        System.out.println();
    }

    private static int recursiveFibonacci(int n) {
        if (n < 1)
            return 0;

        return n <= 2 ? 1 : recursiveFibonacci(n - 2) +  recursiveFibonacci(n - 1);
    }
}
