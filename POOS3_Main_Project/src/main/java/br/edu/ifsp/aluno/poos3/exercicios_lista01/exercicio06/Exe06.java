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
