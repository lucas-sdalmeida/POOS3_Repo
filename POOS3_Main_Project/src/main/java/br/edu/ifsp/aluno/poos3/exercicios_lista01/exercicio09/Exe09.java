package br.edu.ifsp.aluno.poos3.exercicios_lista01.exercicio09;

import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        double averageAge = 0;
        int numberOfPeopleOnLegalAge = 0;
        int numberOfOldPeople = 0;
        double percentageOfOldPeople = 0;
        int numberOfPeople = 0;

        while (true) {
            age = Integer.parseInt(scanner.nextLine());
            if (age < 0)
                break;
            numberOfPeople++;
            averageAge += age;
            if (age >= 18)
                numberOfPeopleOnLegalAge++;
            if (age > 75)
                numberOfOldPeople++;
        }

        if (numberOfPeople > 0) {
            averageAge /= numberOfPeople;
            percentageOfOldPeople = (double) numberOfOldPeople * 100 / numberOfPeople;
        }

        System.out.printf("%.2f\n%d\n%.2f%\n", averageAge, numberOfPeopleOnLegalAge, percentageOfOldPeople);

    }
}
