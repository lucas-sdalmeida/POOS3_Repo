/*
Descrição do Exercício

Professor: Lucas Bueno Ruas de Oliveira

Um robô possui um sensor de infravermelho para navegação e mapeamento que emite
181 feixes com um intervalo de um grau entre cada um deles (-90° na extrema es-
querda (feixe 0), 0° no centro (feixe 90) e 90° na extrema direita (feixe 180)).
O sensor está perfeitamente alinhado ao robô, sendo que o feixe 90 aponta para a
frente. Cada feixe possui alcance máximo de oito metros e uma medida inferior a
isso indica que há um obstáculo mais próximo no ambiente. Considerando-se que o
robô possui um GPS sem erro, é possível obter sua posição exata (x1, y1) em um
plano cartesiano. Utilize coordenadas polares para calcular a posição de um pon-
to de colisão no ambiente a partir das coordenadas "x1" e "y1" da posição do ro-
bô, do ângulo "a" de orientação do robô no plano (em graus), de um número "f"
indicando feixe escolhido e da distância "d" medida pelo feixe (d >=0). Por ques-
tão de simplificação, utilize valores inteiros para as coordenadas do robô e do
obstáculo (saída esperada), bem como para o ângulo do robô e a distância medida
pelo feixe. O valor da saída esperada deverá ser arredondado para inteiro, não
truncado. Dica: os métodos Math.sin(a) e Math.con(a) utilizam valores em radia-
nos e não graus.

Os números devem lidos na mesma linha, sendo os formatos de entrada e saída des-
critos a seguir:

Modelo de entrada: x1 y1 a f d | Modelo de saída: (x2, y2)

Exemplos de entrada e saída:
        Entrada	        Saída
    0 0 45 45 5	        (0,5)

 10 10 45 45 10	      (10,20)

  -4 4 45 135 4	        (0,4)

    0 0 0 135 4	       (3,-3)

Qualquer valor fora do domínio de entrada tem como saída esperada a String
"Erro".
*/

package br.edu.ifsp.aluno.poos3.exercicios_lista02.exercicio10;

import java.util.Scanner;

public class Exe10 {

    private static final int BEAM_ZERO_ANGLE_IN_DEG = -90;
    private static final int ANGLE_BETWEEN_BEAMS_IN_DEG = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] robotCoordinates = new int[2];
        int robotAngleToPlaneInDeg;
        int sensorBeamNumber;
        int beamAngleToPlaneInDeg;
        int beamDistance;
        double[] obstacleCoordinates = new double[2];
        double obstacleAngleInRads;

        robotCoordinates[0] = scanner.nextInt();
        robotCoordinates[1] = scanner.nextInt();
        robotAngleToPlaneInDeg = scanner.nextInt();
        sensorBeamNumber = scanner.nextInt();

        if (sensorBeamNumber < 0 || sensorBeamNumber > 180) {
            System.out.println("Erro");
            scanner.close();
            return;
        }

        beamDistance = scanner.nextInt();
        if (beamDistance < 0) {
            System.out.println("Erro");
            scanner.close();
            return;
        }

        beamAngleToPlaneInDeg = BEAM_ZERO_ANGLE_IN_DEG + ANGLE_BETWEEN_BEAMS_IN_DEG * sensorBeamNumber;
        obstacleAngleInRads = Math.toRadians(-beamAngleToPlaneInDeg + robotAngleToPlaneInDeg);
        obstacleCoordinates[0] = Math.cos(obstacleAngleInRads) * beamDistance + robotCoordinates[0];
        obstacleCoordinates[1] = Math.sin(obstacleAngleInRads) * beamDistance + robotCoordinates[1];

        System.out.printf("(%d, %d)", Math.round(obstacleCoordinates[0]), Math.round(obstacleCoordinates[1]));

        scanner.close();
    }
}
