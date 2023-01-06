/*
Descrição do Exercício

Professor: Lucas Bueno Ruas de Oliveira

Escreva um programa que, dado um inteiro x, temos um novo x de acordo
com a seguinte regra:

    * se x e par, x = x / 2
    * se x e ímpar, x = 3 * x + 1

O programa deve parar quando x = 1. Por exemplo, para x = 13, a saída será: 40, 20, 10,
5, 16, 8, 4, 2 e 1.
*/

package br.edu.ifsp.aluno.poos3.exercicios_lista03.exercicio03;

import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;

        x = Integer.parseInt(scanner.nextLine());

        while  (x != 1) {
            x = (x % 2 == 0) ? (x / 2) : (x * 3 + 1);
            System.out.print(x + ((x == 1) ? ".\n" : ", "));
        }

        scanner.close();
    }
}
