/*
Descrição do Exercício

Professor: Lucas Bueno Ruas de Oliveira

Osmar adora chocolates e vai para a loja com N dinheiro no bolso. O preço de ca-
da chocolate é C. A loja oferece um desconto: para cada M embalagens que ele dá
para a loja, ele ganha um chocolate grátis. Quantos chocolates Osmar consegue
comer? Por exemplo:

    * Para N=10, C=2, M=5, ele pode comprar 5 chocolates por $10 e trocar as 5
      embalagens por mais 1 chocolate, fazendo com que o número total de choco-
      lates que ele pode comer seja 6.

Faça um programa que leia inteiros N, C e M e imprima a quantidade de chocolates
que Osmar pode comer. C e M são inteiros positivos.

    Entrada	    Saída
         10
          2         6
          5

=> Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão
   (ICMC/USP)
*/

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
