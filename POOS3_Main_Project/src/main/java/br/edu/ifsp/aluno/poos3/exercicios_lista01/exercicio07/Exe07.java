/*
Descrição do Exercício

Professor: Lucas Bueno Ruas de Oliveira

Um motorista de Uber estipula o preço de uma determinada viagem dada a quantida-
de de quilômetros percorrida. Para viagens de até X km, é cobrado um valor R$ V1
por km. Acima de X km, é cobrado o valor R$ V2. Faça um programa que leia X, V1,
V2 e a quantidade de quilômetros A da viagem e imprima o valor total com duas
casas decimais.

Exemplos de entrada e saída:
        Entrada	        Saída
            100
           1.50         75.00
           1.25
             50

            100
           1.50        187.50
           1.25
            150

=> Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão
   (ICMC/USP)
*/

package br.edu.ifsp.aluno.poos3.exercicios_lista01.exercicio07;

import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double borderingDistance;
        double costWhenBellowTheBorder;
        double costWhenAboveTheBorder;
        double tripDistance;
        double totalCost;

        borderingDistance = Double.parseDouble(scanner.nextLine());
        costWhenBellowTheBorder = Double.parseDouble(scanner.nextLine());
        costWhenAboveTheBorder = Double.parseDouble(scanner.nextLine());
        tripDistance = Double.parseDouble(scanner.nextLine());

        if (tripDistance < 0 || borderingDistance <= 0 ||
                costWhenAboveTheBorder <= 0 || costWhenBellowTheBorder <= 0) {
            System.out.println("Erro");
            return;
        }

        totalCost = tripDistance * ((tripDistance > borderingDistance) ?
                                    costWhenAboveTheBorder : costWhenBellowTheBorder);
        System.out.printf("%.2f", totalCost);
    }
}
