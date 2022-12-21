package br.edu.ifsp.aluno.poos3.exercicios_lista01.exercicio04;

import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int moneyOfOsmar;
        int priceOfChocolates;
        int numberOfPackaging;
        int numberOfChocolates;
        
        moneyOfOsmar = Integer.parseInt(scanner.nextLine());
        priceOfChocolates = Integer.parseInt(scanner.nextLine());
        numberOfPackaging = Integer.parseInt(scanner.nextLine());

        if (moneyOfOsmar < 0 || priceOfChocolates <= 0 || numberOfPackaging <= 0) {
            System.out.println("Erro");
            return;
        }

        numberOfChocolates = moneyOfOsmar / priceOfChocolates;
        numberOfChocolates += numberOfChocolates / numberOfPackaging;

        System.out.println(numberOfChocolates);
    }
}
