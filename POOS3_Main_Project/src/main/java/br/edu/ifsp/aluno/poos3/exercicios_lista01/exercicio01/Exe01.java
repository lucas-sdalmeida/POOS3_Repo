/*
Lucas Silva de Almeida

Professor: Lucas Bueno Ruas de Oliveira

Uma livraria está fazendo uma promoção para pagamento a vista. O comprador pode
escolher entre dois planos de pagamento:

    * Critério A: R$ 0,25 por livro + R$ 7,50 fixo
    * Critério B: R$ 0,50 por livro + R$ 2,50 fixo

Faça um programa em que o usuário informe a quantidade positiva e não nula de
livros e seja impresso qual o melhor plano de pagamento.

    Exemplo 1: Entrada = 100 | Saída = Criterio A
    Exemplo 2: Entrada = 5 | Saída = Criterio B
    Exemplo 3: Entrada = 20 | Saída = Indiferente
    Exemplo 4: Entrada = -5 | Saída = Erro

Qualquer valor fora do domínio de entrada tem como saída esperada a String
"Erro".
*/

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
