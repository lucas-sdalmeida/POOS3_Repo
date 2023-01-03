/*
Descrição do Exercício

Professor: Lucas Bueno Ruas de Oliveira

Todo Natal o Papai Noel se prepara para embarcar em seu trenó todos os N presen-
tes a serem entregues. A área em que os presentes ficam no trenó pode ser divi-
dida em dois lados: o lado A e o lado B. Para que o trenó fique equilibrado, a
diferença da soma dos pesos dos presentes que estão no lado A e no lado B não
pode ser maior que 5kg.

Você recebeu a tarefa de ajudar o Papai Noel este ano. Dados N presentes, você
deve descobrir se existe uma maneira de dividi-los nos lados A e B, de tal forma
que o trenó nunca fique desequilibrado.

Faça um programa que leia o número de presentes N que o Papai Noel deve entre-
gar. Após isso, leia N números inteiros P, representando o peso de cada presen-
te. Os presentes devem ser alocados um por vez, na ordem em que são lidos, e em
nenhum momento o trenó deve ficar desequilibrado. Seu programa deve imprimir "S"
se for possível equilibrar todos os presentes no trenó e "N" caso contrário.

Exemplos de entrada e saída:
        Entrada	        Saída
              3
          4 6 2	            S

              2
            6 6	            N

Fonte: Adaptado de https://neps.academy/problem/436

=> Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão
   (ICMC/USP)
*/

package br.edu.ifsp.aluno.poos3.exercicios_lista02.exercicio08;

import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfGifts;
        int weightDifference = 0;

        numberOfGifts = Integer.parseInt(scanner.nextLine());

        if (numberOfGifts <= 0) {
            System.out.println("Erro");
            scanner.close();
            return;
        }

        for (int i = 0; i < numberOfGifts; i++) {
            int giftWeight = scanner.nextInt();

            if (giftWeight <= 0) {
                System.out.println("Erro");
                scanner.close();
                return;
            }

            if (weightDifference + giftWeight > 5 && weightDifference - giftWeight < -5) {
                System.out.println("N");
                scanner.close();
                return;
            }
            if (Math.abs(weightDifference + giftWeight) <= Math.abs(weightDifference - giftWeight)) {
                weightDifference += giftWeight;
                continue;
            }
            weightDifference -= giftWeight;
        }

        System.out.println("S");
        scanner.close();
    }
}
