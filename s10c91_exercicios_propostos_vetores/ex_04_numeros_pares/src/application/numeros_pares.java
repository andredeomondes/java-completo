package application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.US;

public class numeros_pares {
    public static void main(String[] args) {

        Locale.setDefault(US);
        Scanner sc = new Scanner(System.in);

        System.out.println("\n ---------------- NÚMEROS PARES ----------------  ");
        System.out.print(" > Digite a quantidade de números: ");
        int size = sc.nextInt();
        sc.nextLine();
        int[] numbers = new int[size];

        // Preenchendo vetor -----------------------------------------------------------
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("\n > Digite um número inteiro [" + (i + 1) + "] : ");
            numbers[i] = sc.nextInt();
            sc.nextLine();
        }
        // Quantidade de números pares--------------------------------------------------
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }
        // Listagem de números pares----------------------------------------------------

        if (count != 0) {
            System.out.println("\n --------------------- Números pares ---------------------");
        } else {
            System.out.println("- Não existe número par!");
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print("\n - " + numbers[i]);
            }

        }
        if (count != 0) {
            System.out.println("\n - Quantidade de números pares: " + count);
        }
    }
}
