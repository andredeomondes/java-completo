package application;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("\n --------------- MAIOR POSIÇÃO ---------------  ");
        System.out.print("\n > Digite o tamanho do vetor: ");
        int size = sc.nextInt();
        double[] numbers = new double[size];

        // Preenchendo vetor -----------------------------------------------------------

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("\n > Digite o numero [" + (i + 1) + "] : ");
            numbers[i] = sc.nextDouble();
            sc.nextLine();

        }

        // Maior valor -----------------------------------------------------------
        double biggerNumber = 0.0;
        for (double number : numbers) {
            if (number > biggerNumber) {
                biggerNumber = number;
            }

        }
        System.out.printf("\n - Maior número: %.1f ", biggerNumber);

        // Posição do maior valor -----------------------------------------------------------
        int biggerNumberPosition = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == biggerNumber) {
                biggerNumberPosition = i;
            }
        }
        System.out.printf("\n - Posicao do maior número: %d ", biggerNumberPosition);


    }
}