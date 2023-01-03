/*
Descrição do Exercício

Professor: Lucas Bueno Ruas de Oliveira

Sabe-se que uma lata de tinta tem um custo C e é capaz de pintar uma área de M
metros quadrados. Faça um programa que leia a largura L, a altura A de uma pare-
de, o valor C de uma lata de tinta e o rendimento M desta lata. Após isso, im-
prima quantas latas de tintas são necessárias e o custo total (com duas casas
decimais). Assuma que não é possível comprar lata de tinta fracionada.

Exemplos de entrada e saída:
        Entrada	        Saída
              4
              3             4
              5         20.00
              3

           10.0
            2.0             3
            5.0         15.00
              7

=> Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão
   (ICMC/USP)
*/

package br.edu.ifsp.aluno.poos3.exercicios_lista01.exercicio06;

import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double paintCanPrice;
        double paintCanCapacityArea;
        double wallWidth;
        double wallHeight;
        int numberOfNeededCans;
        double totalCost;

        wallWidth = Double.parseDouble(scanner.nextLine());
        wallHeight = Double.parseDouble(scanner.nextLine());
        paintCanPrice = Double.parseDouble(scanner.nextLine());
        paintCanCapacityArea = Double.parseDouble(scanner.nextLine());

        if (wallWidth <= 0 || wallHeight <= 0 || paintCanPrice <= 0 || paintCanCapacityArea <= 0) {
            System.out.println("Erro");
            return;
        }

        double wallArea = wallWidth * wallHeight;
        numberOfNeededCans = (int)Math.ceil(wallArea / paintCanCapacityArea);
        totalCost = paintCanPrice * numberOfNeededCans;

        System.out.printf("%d\n%.2f", numberOfNeededCans, totalCost);
    }
}
