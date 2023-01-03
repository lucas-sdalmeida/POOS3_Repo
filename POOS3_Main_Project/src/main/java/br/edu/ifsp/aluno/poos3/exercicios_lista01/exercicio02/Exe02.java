/*
Descrição do Exercício

Professor: Lucas Bueno Ruas de Oliveira

Sejam a, b e c os três lados de um triângulo. Elabore um algoritmo que verifica
se o triângulo é:

    * Escaleno (todos os lados diferentes)
    * Isósceles (possui dois lados iguais)
    * Equilátero (todos os lados iguais)
    * Não forma triângulo (a soma de dois lados deve ser maior que o terceiro lado).

Os três números devem ser inteiros positivos e lidos na mesma linha (Ex: 3 4 5).
Exemplos de entrada e saída esperada:

    Exemplo 1: Entrada = 2 3 2 | Saída = Isosceles
    Exemplo 2: Entrada = 2 2 2 | Saída = Equilatero
    Exemplo 3: Entrada = 1 2 4 | Saída = Nao forma triangulo
    Exemplo 4: Entrada = -1 2 4 | Saída = Erro

Qualquer valor fora do domínio de entrada tem como saída esperada a String
"Erro".
*/

package br.edu.ifsp.aluno.poos3.exercicios_lista01.exercicio02;

import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edgeA, edgeB, edgeC;
        boolean makeATriangle;

        edgeA = scanner.nextInt();
        edgeB = scanner.nextInt();
        edgeC = scanner.nextInt();

        if (edgeA <= 0 || edgeB <= 0 || edgeC <= 0) {
            System.out.println("Erro");
            return;
        }

        makeATriangle = Math.abs(edgeA - edgeB) < edgeC && (edgeA + edgeB) > edgeC;

        if (!makeATriangle) {
            System.out.println("Nao forma triangulo");
            return;
        }

        if (edgeA ==  edgeB && edgeB == edgeC)
            System.out.println("Equilatero");
        else if (edgeA != edgeB && edgeA != edgeC && edgeB != edgeC)
            System.out.println("Escaleno");
        else
            System.out.println("Isosceles");
    }
}
