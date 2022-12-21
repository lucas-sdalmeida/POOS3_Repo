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
