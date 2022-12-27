package br.edu.ifsp.aluno.poos3.exercicios_lista02.exercicio05;

import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cousinAge;
        int numberOfBiggestCandles = 0;
        int biggestHeight = 0;

        cousinAge = Integer.parseInt(scanner.nextLine());

        if (cousinAge <= 0) {
            System.out.println("Erro");
            return;
        }
        for (int i = 0; i < cousinAge; i++) {
            int candleHeight = Integer.parseInt(scanner.nextLine());
            if (candleHeight < biggestHeight)
                continue;
            if (candleHeight > biggestHeight) {
                biggestHeight = candleHeight;
                numberOfBiggestCandles = 1;
                continue;
            }
            numberOfBiggestCandles++;
        }

        System.out.println(numberOfBiggestCandles);
    }
}
