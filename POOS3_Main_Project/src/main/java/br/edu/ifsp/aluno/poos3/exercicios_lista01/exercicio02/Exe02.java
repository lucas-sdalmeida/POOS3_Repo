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
