package br.edu.ifsp.aluno.poos3.exercicios_lista02.exercicio04;

import java.util.Scanner;

public class Exe04 {
    private static final int NUMBER_OF_LAMPS = 2;

    public enum LampState {
        ON(1),
        OFF(0);

        private final int stateAsInt;

        LampState(int stateAsInt) {
            this.stateAsInt = stateAsInt;
        }

        public int getStateAsInt() {
            return stateAsInt;
        }

        public static LampState getLampStateFromInt(int value) {
            return (value > 0) ? ON : OFF;
        }

        public static LampState getInverseState(LampState lampState) {
            if (lampState == ON)
                return OFF;
            return ON;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final LampState[] lampStates = new LampState[NUMBER_OF_LAMPS * 2];
        int stateReadAsInt;
        int numberOfSwitchesNeededToPress = 0;

        for (int i = 0; i < NUMBER_OF_LAMPS * 2; i++) {
            stateReadAsInt = scanner.nextInt();
            if (stateReadAsInt < 0 || stateReadAsInt > 1) {
                System.out.println("Erro");
                return;
            }
            lampStates[i] = LampState.getLampStateFromInt(stateReadAsInt);
        }

        if (lampStates[1] != lampStates[3]) {
            lampStates[0] = LampState.getInverseState(lampStates[0]);
            lampStates[1] = LampState.getInverseState(lampStates[1]);
            numberOfSwitchesNeededToPress++;
        }
        if (lampStates[0] != lampStates[2])
            numberOfSwitchesNeededToPress++;

        System.out.println(numberOfSwitchesNeededToPress);
    }
}
