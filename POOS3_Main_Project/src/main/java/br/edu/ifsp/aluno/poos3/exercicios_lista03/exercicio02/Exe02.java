/*
Descrição do Exercício

Professor: Lucas Bueno Ruas de Oliveira

Escreva dois programas, um recursivo e outro iterativo, que calculem o
fatorial de um número n. O fatorial de n é calculado tal que:
    * n! = n * (n-1)!
    * 1! = 1
    * 0! = 1
*/

package br.edu.ifsp.aluno.poos3.exercicios_lista03.exercicio02;

import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int iterativeFactorialOfN;
        int recursiveFactorialOfN;

        n = Integer.parseInt(scanner.nextLine());

        if (n < 0) {
            System.out.println("Erro");
            scanner.close();
            return;
        }

        iterativeFactorialOfN = iterativeFactorial(n);
        recursiveFactorialOfN = recursiveFactorial(n);

        System.out.println("Iterative Factorial Of N = " + iterativeFactorialOfN);
        System.out.println("Recursive Factorial Of N = " + recursiveFactorialOfN);
        scanner.close();
    }

    private static int iterativeFactorial(int n) {
        int factorial = 1;

        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    private static int recursiveFactorial(int n) {
        return n > 0 ? n * recursiveFactorial(n - 1) : 1;
    }
}
