/*
Descrição do Exercício

Professor: Lucas Bueno Ruas de Oliveira

Você está de volta em seu hotel na Tailândia depois de um dia de mergulhos. O
seu quarto tem duas lâmpadas, chamadas de A e B. No hotel há dois interruptores,
que chamaremos de C1 e C2. Ao apertar C1, a lâmpada A acende se estiver apagada,
e apaga se estiver acesa. Se apertar C2, cada uma das lâmpadas A e a B troca de
estado: se estiver apagada, fica acesa e se estiver acesa apaga.

Você chegou no hotel e encontrou as lâmpadas em um determinado estado, como fo-
ram deixadas por seu amigo. Vamos chamar o estado inicial da lâmpada A de IA e o
estado inicial da lâmpada B de IB. Você gostaria de deixar as lâmpadas em uma
certa configuração final, que chamaremos de FA e FB, respectivamente, apertando
os interruptores a menor quantidade de vezes possível. Por exemplo, se as duas
lâmpadas começam apagadas, e você quer que apenas a lâmpada A termine acesa,
basta apertar o interruptor C1.

Faça um programa que leia os estados iniciais IA e IB e os estados finais dese-
jados FA e FB das duas lâmpadas. Os valores de IA, IB, FA e FB são lidos na mes-
ma linha nessa ordem. Seus valores possíveis são 0, se a lâmpada estiver apagada
e 1 caso contrário. Ao final, seu programa deverá imprimir o número mínimo de
interruptores que devem ser apertados.

    Entrada	        Saída
    0 0 1 1	            1
    0 0 0 1	            2
*/

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
