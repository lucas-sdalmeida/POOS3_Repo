package br.edu.ifsp.aluno.poos3.exercicios_lista01.exercicio08;

import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLemons;
        int valueInCentsOfTheFirstLemon;
        int totalCostInCents;

        numberOfLemons = Integer.parseInt(scanner.nextLine());
        valueInCentsOfTheFirstLemon = Integer.parseInt(scanner.nextLine());
        scanner.close();

        if (numberOfLemons <= 0 || valueInCentsOfTheFirstLemon <= 0) {
            System.out.println("Erro");
            return;
        }

        int firstLemonOf1Cent = Math.abs(-(1 - valueInCentsOfTheFirstLemon) + 1);
        int valueOfTheLastLemon = valueInCentsOfTheFirstLemon - (numberOfLemons - 1);

        totalCostInCents = valueInCentsOfTheFirstLemon + Math.max(valueOfTheLastLemon, 1);
        totalCostInCents *= Math.min(numberOfLemons, firstLemonOf1Cent);
        totalCostInCents /= 2;
        totalCostInCents += Math.max(numberOfLemons - firstLemonOf1Cent, 0);

        System.out.println(totalCostInCents);
    }
}
