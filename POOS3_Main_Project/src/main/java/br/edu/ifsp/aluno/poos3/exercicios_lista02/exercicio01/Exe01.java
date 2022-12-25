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
