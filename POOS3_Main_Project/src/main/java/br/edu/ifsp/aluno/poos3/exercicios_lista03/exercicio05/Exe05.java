/*
Descrição do Exercício

Professor: Lucas Bueno Ruas de Oliveira

Faça um programa que leia dados de temperatura durante uma semana (i.e., sete
leituras), armazenando em um vetor. Na sequência, escreva quantos dias dessa
semana a temperatura esteve acima da média.
*/

package br.edu.ifsp.aluno.poos3.exercicios_lista03.exercicio05;

import java.util.Scanner;

public class Exe05 {
    private static final int READING_DAYS = 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] temperatures = new int[READING_DAYS];
        int averageTemperature = 0;
        int temperaturesAboveAverage = 0;

        for (int i = 0; i < READING_DAYS; i++) {
           temperatures[i] = scanner.nextInt();
           averageTemperature += temperatures[i];
        }
        averageTemperature /= READING_DAYS;
        for (int temperature : temperatures) {
            if (temperature > averageTemperature)
                temperaturesAboveAverage++;
        }

        System.out.println(temperaturesAboveAverage);
        scanner.close();
    }
}
