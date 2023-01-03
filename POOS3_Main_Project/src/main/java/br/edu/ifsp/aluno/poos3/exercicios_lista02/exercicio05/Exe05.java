/*
Descrição do Exercício

Professor: Lucas Bueno Ruas de Oliveira

Você está responsável pelo bolo de aniversário da sua priminha e decidiu que o
bolo terá uma vela para cada ano da idade total dela. Quando ela assopra as ve-
las, ela só é capaz de apagar apenas as velas mais altas. Sua tarefa é fazer um
programa que leia a idade A da sua sobrinha e a altura das velas. Após isso, seu
programa deve imprimir a quantidade de velas que ela vai conseguir apagar.

Por exemplo, se sua sobrina está fazendo 4 anos e o bolo possui 4 velas de tama-
nhos 4, 4, 1, 3, então ela só vai conseguir apagar as duas mais altas, de tama-
nho 4. Portanto, a resposta deve ser 2.

Exemplos de entrada e saída:
        Entrada     	Saída
              4
              4
              4             2
              1
              3

              4
              3
              2             2
              1
              3

Fonte:
 Adaptado de https://www.hackerrank.com/challenges/birthday-cake-candles/problem

=> Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão
(ICMC/USP)
*/

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
