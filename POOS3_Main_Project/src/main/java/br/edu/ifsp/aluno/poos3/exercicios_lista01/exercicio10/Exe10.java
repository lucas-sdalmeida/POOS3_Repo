package br.edu.ifsp.aluno.poos3.exercicios_lista01.exercicio10;

import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialPositionOfKangaroo1;
        int jumpDistanceOfKangaroo1;
        int initialPositionOfKangaroo2;
        int jumpDistanceOfKangaroo2;

        initialPositionOfKangaroo1 = Integer.parseInt(scanner.nextLine());
        jumpDistanceOfKangaroo1 = Integer.parseInt(scanner.nextLine());
        initialPositionOfKangaroo2 = Integer.parseInt(scanner.nextLine());
        jumpDistanceOfKangaroo2 = Integer.parseInt(scanner.nextLine());

        if (initialPositionOfKangaroo1 < 0 || initialPositionOfKangaroo2 < 0
                || jumpDistanceOfKangaroo1 < 0 || jumpDistanceOfKangaroo2 < 0) {
            System.out.println("Erro");
            return;
        }

        if (jumpDistanceOfKangaroo1 == jumpDistanceOfKangaroo2) {
            System.out.println((initialPositionOfKangaroo1 == initialPositionOfKangaroo2) ? "SIM" : "NÂO");
            return;
        }

        int numberOfJumpsToEqualPosition = initialPositionOfKangaroo2 - initialPositionOfKangaroo1;
        numberOfJumpsToEqualPosition /= (jumpDistanceOfKangaroo1 - jumpDistanceOfKangaroo2);

        System.out.println((numberOfJumpsToEqualPosition >= 0) ? "SIM" : "NÂO");
    }
}
