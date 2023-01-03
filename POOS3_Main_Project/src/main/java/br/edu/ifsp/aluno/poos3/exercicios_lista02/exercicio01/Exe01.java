/*
Descrição do Exercício

Professor: Lucas Bueno Ruas de Oliveira

Faça um programa que leia dados inteiros da temperatura diária durante uma sema-
na, armazenando em um vetor. Na sequência, escreva quantos dias dessa semana a
temperatura esteve acima da média. As sete temperaturas devem ser lidas na mesma
linha, separada por espaço.

Exemplos de entrada e saída esperada:

    * Exemplo 1: Entrada = 2 2 2 2 2 2 3            | Saída = 1
    * Exemplo 2: Entrada = 21 10 13 34 30 21 34     | Saída = 3
    * Exemplo 3: Entrada = 2 2 2 2 2 2 1            | Saída = 6

Qualquer valor fora do domínio de entrada tem como saída esperada a String
"Erro".
*/

package br.edu.ifsp.aluno.poos3.exercicios_lista02.exercicio01;

import java.util.Scanner;

public class Exe01 {
    public static final int NUMBER_OF_READING_DAYS = 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int[] temperatures = new int[NUMBER_OF_READING_DAYS];
        int averageTemperature = 0;
        int daysAboveAverageTemperature = 0;

        for (int i = 0; i < NUMBER_OF_READING_DAYS; i++) {
            temperatures[i] = scanner.nextInt();
            averageTemperature += temperatures[i];
        }
        averageTemperature /= NUMBER_OF_READING_DAYS;
        for (int temperature : temperatures) {
            if (temperature > averageTemperature)
                daysAboveAverageTemperature++;
        }

        System.out.println(daysAboveAverageTemperature);
    }
}
