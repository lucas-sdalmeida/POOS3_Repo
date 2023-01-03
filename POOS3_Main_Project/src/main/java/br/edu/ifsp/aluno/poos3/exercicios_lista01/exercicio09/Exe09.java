/*
Descrição do Exercício

Professor: Lucas Bueno Ruas de Oliveira

Faça um programa que leia um conjunto de valores que correspondem as idades de
pessoas de uma comunidade. Quando o valor fornecido for um número negativo,
significa que não existem mais idades para serem lidas. Após a leitura, seu pro-
grama deve informar:

    * A média das idades das pessoas (com duas casas decimais)
    * A quantidade de pessoas maiores de idade
    * A porcentagem de pessoas idosas (considere quem uma pessoa idosa tem mais
      de 75 anos) (com duas casas decimais)

Exemplos de entrada e saída:
        Entrada	        Saída
             10
             20         35.00
             30             3
             80        25.00%
             -1

             25         33.33
             30             3
             45         0.00%
             -1

=> Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão
   (ICMC/USP)
*/

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
