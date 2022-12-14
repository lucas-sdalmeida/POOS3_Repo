/*
Descrição do Exercício

Professor: Lucas Bueno Ruas de Oliveira

Uma loja especializada em vendas pela internet está desenvolvendo drones para
entrega de caixas com as compras dos clientes. Cada caixa tem a forma de um pa-
ralelepípedo reto retângulo (ou seja, no formato de um tijolo).

O drone entregará uma caixa de cada vez, e colocará a caixa diretamente dentro
da casa do cliente, através de uma janela. Todas as janelas dos clientes têm o
formato retangular e estão sempre totalmente abertas. O drone tem um aplicativo
de visão computacional que calcula exatamente as dimensões H e L da janela. O
drone consegue colocar a caixa através da janela somente quando uma das faces da
caixa está paralela à janela, mas consegue virar e rotacionar a caixa antes de
passá-la pela janela.

Faça um programa que lê cinco números inteiros, cada um em uma linha. As três
primeiras linhas representam os valores A, B e C, indicando as três dimensões da
caixa, em centímetros. As duas últimas linhas representam os valores H e L, in-
dicando a altura e a largura da janela, em centímetros. Seu programa deve escre-
ver uma única linha, contendo apenas a letra "S" se a caixa passa pela janela e
apenas a letra "N" caso contrário.

Exemplos de entrada e saída:
        Entrada	        Saída
             30
             50
             80             S
             80
             60

             75
            100
             50             N
            100
             30

             20
             22
              5             S
             20
             10

Fonte: Adaptado de Olimpíada Brasileira de Informática (OBI)

=> Exercício gentilmente cedido pelos profs. Jorge Cutigi e Adenilso Simão
   (ICMC/USP)
*/

package br.edu.ifsp.aluno.poos3.exercicios_lista02.exercicio09;

import java.util.Arrays;
import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] boxDimensions = new int [3];
        int[] windowDimensions = new int[2];

        for (int i = 0; i < 3; i++) {
            boxDimensions[i] = Integer.parseInt(scanner.nextLine());
            if (boxDimensions[i] <= 0) {
                System.out.println("Erro");
                scanner.close();
                return;
            }
            Arrays.sort(boxDimensions);
        }

        for (int i = 0; i < 2; i++) {
            windowDimensions[i] = Integer.parseInt(scanner.nextLine());
            if (windowDimensions[i] <= 0) {
                System.out.println("Erro");
                scanner.close();
                return;
            }
            Arrays.sort(windowDimensions);
        }

        if (boxDimensions[0] > windowDimensions[0] || boxDimensions[1] > windowDimensions[1]) {
            System.out.println("N");
            scanner.close();
            return;
        }

        System.out.println("S");
        scanner.close();
    }
}
