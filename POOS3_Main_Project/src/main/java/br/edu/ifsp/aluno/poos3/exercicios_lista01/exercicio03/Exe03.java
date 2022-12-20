package br.edu.ifsp.aluno.poos3.exercicios_lista01.exercicio03;

import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        boolean itIsALeapYear;

        year = Integer.parseInt(scanner.nextLine());

        if (year <= 0) {
            System.out.println("Erro");
            return;
        }

        itIsALeapYear = year % 400 == 0 || year % 4 == 0 && year % 100 != 0;

        if (itIsALeapYear)
            System.out.println("Ano bissexto");
        else
            System.out.println("Ano nao bissexto");
    }
}
