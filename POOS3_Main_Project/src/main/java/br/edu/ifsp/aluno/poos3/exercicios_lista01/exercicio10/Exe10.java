/*
Descrição do Exercício

Professor: Lucas Bueno Ruas de Oliveira

Você está na Austrália treinando cangurus para se locomoverem em linha reta. Vo-
cê quer saber se dois cangurus estarão na mesma posição em um determinado tempo,
dado a posição inicial de cada canguru e qual a distância que eles saltam. Como
você sabe programar muito bem, você decidiu fazer um programa para isso. Seu
programa deve ler:

    * A posição inicial X1 e a distância do pulo V1 do primeiro canguru.
    * A posição inicial X2 e a distância do pulo V2 do segundo canguru.

Após isso, seu programa deve imprimir SIM se os dois cangurus se encontrarão no
mesmo ponto e NAO caso eles nunca se encontrem.

Por exemplo, o primeiro canguru começa em X1 = 2 e tem uma distância do pulo de
V1 = 1. O segundo canguru começa em X2 = 1 e tem uma distância de pulo de
V2 = 2. Após um pulo ambos estarão no ponto 3, portanto a respota é SIM.

Exemplos de entrada e saída:
        Entrada	        Saída
              0
              3           SIM
              4
              2

              0
              2           NÂO
              5
              3

Fonte: Adaptado de https://www.hackerrank.com/challenges/kangaroo/problem
=> Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão
   (ICMC/USP)
*/

package br.edu.ifsp.aluno.poos3.exercicios_lista01.exercicio10;

import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialPositionOfKangaroo1;
        int jumpDistanceOfKangaroo1;
        int initialPositionOfKangaroo2;
        int jumpDistanceOfKangaroo2;

        initialPositionOfKangaroo1 = Integer.parseInt(scanner.nextLine());
        jumpDistanceOfKangaroo1 = Integer.parseInt(scanner.nextLine());
        initialPositionOfKangaroo2 = Integer.parseInt(scanner.nextLine());
        jumpDistanceOfKangaroo2 = Integer.parseInt(scanner.nextLine());

        if (initialPositionOfKangaroo1 < 0 || initialPositionOfKangaroo2 < 0
                || jumpDistanceOfKangaroo1 < 0 || jumpDistanceOfKangaroo2 < 0) {
            System.out.println("Erro");
            return;
        }

        if (jumpDistanceOfKangaroo1 == jumpDistanceOfKangaroo2) {
            System.out.println((initialPositionOfKangaroo1 == initialPositionOfKangaroo2) ? "SIM" : "NÂO");
            return;
        }

        int numberOfJumpsToEqualPosition = initialPositionOfKangaroo2 - initialPositionOfKangaroo1;
        numberOfJumpsToEqualPosition /= (jumpDistanceOfKangaroo1 - jumpDistanceOfKangaroo2);

        System.out.println((numberOfJumpsToEqualPosition >= 0) ? "SIM" : "NÂO");
    }
}
