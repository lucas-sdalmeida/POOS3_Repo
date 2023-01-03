/*
Descrição do Exercício

Professor: Lucas Bueno Ruas de Oliveira

A avenida principal da cidade de Algoritmopolis possui limite de velocidade de
L km/h. Se o motorista ultrapassar essa velocidade, é aplicado uma multa de
R$ M, mais R$ A por cada km acima do limite. Faça um programa que leia o limite
L, o valor da multa M, o valor adicional A e a velocidade V captada pelo radar e
informe o valor total da multa. Considere L e V sempre como números inteiros.
Apresente a resposta com duas casas decimais.

Exemplos de entrada e saída:
    Entrada	        Saída
         60
     150.00        200.00
      10.00
         65

         60
     150.00           0.0
      10.00
         50

=> Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão
   (ICMC/USP)
*/

package br.edu.ifsp.aluno.poos3.exercicios_lista01.exercicio05;

import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speedLimit;
        double ticketBaseValue;
        double tickedAdditionalValue;
        int speed;
        double actualTickedValue = 0;

        speedLimit = Integer.parseInt(scanner.nextLine());
        ticketBaseValue = Double.parseDouble(scanner.nextLine());
        tickedAdditionalValue = Double.parseDouble(scanner.nextLine());
        speed = Integer.parseInt(scanner.nextLine());

        if (speedLimit <= 0 || speed < 0 || ticketBaseValue <= 0 || tickedAdditionalValue <= 0) {
            System.out.println("Erro");
            return;
        }

        if (speed > speedLimit)
            actualTickedValue = ticketBaseValue + (speed - speedLimit) * tickedAdditionalValue;

        System.out.printf("%.2f\n", actualTickedValue);
    }
}
