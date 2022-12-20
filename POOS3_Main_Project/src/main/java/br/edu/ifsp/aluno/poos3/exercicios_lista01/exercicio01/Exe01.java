package br.edu.ifsp.aluno.poos3.exercicios_lista01.exercicio01;

import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfBooks;
        double criterioA;
        double criterioB;

        numberOfBooks = Integer.parseInt(scanner.nextLine());

        if (numberOfBooks <= 0) {
            System.out.println("Erro");
            return;
        }

        criterioA = .25 * numberOfBooks + 7.5;
        criterioB = .5 * numberOfBooks + 2.5;
        /*
        Anotação:
            - Esse é um Numeric Promotion Context;
            - <numberOfBooks> passa por uma Widening Primitive Conversion;
            - A conversão específica é a de int para double, na qual não há
              perda de informação.
        */

        if (criterioA < criterioB)
            System.out.println("Criterio A");
        else if (criterioB < criterioA)
            System.out.println("Criterio B");
        else
            System.out.println("Indiferente");
    }
}
