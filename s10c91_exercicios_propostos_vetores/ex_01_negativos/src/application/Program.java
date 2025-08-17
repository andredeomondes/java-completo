package application;

import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("\n ------------------------ Contador de números negativos ------------------------ ");
        System.out.print(" > Digite o tamanho do vetor: ");

        int size = sc.nextInt();
        sc.nextLine();
        int[] vectorNumbers = new int[size];


        for (int i = 0; i < vectorNumbers.length; i++) {
            System.out.print("\n > Digite o número [" + (i + 1) + "] : ");
            vectorNumbers[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("\n ------------- Números negativos ------------- ");

        for (int vectorNumber : vectorNumbers) {
            if (vectorNumber < 0) {
                System.out.println(" > " + vectorNumber);
            }
        }

    }
}