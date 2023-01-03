/*
Descrição do Exercício

Professor: Lucas Bueno Ruas de Oliveira

Alan quer comprar limões para fazer uma limonada. Próximo da sua casa há um mer-
cadinho que vende limões da seguinte forma: O primeiro limão é vendido por C
centavos, o segundo por C − 1 centavos, o terceiro por C − 2 e assim por diante
até o menor valor de 1 centavo. Por exemplo, se C = 3 e Alan quiser comprar 5
limões, o preço total será 3 + 2 + 1 + 1 + 1 = 8.

Faça um programa que leia dois inteiros N e C que indicam respectivamente o nú-
mero de limões e o valor em centavos do primeiro limão. Em seguida imprima o
valor total em centavos.

Exemplos de entrada e saída:
        Entrada	        Saída
            5 3	            8
            3 3	            6

Fonte: Adaptado de https://neps.academy/problem/193
=> Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão
   (ICMC/USP)
*/

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
