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
