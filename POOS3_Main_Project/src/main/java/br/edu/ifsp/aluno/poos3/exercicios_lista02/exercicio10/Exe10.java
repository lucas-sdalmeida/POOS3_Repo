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
