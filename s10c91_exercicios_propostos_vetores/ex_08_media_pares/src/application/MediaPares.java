package application;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("\n -------------------- MEDIA PARES  -------------------- ");
        System.out.print(" > Digite o tamanho do vetor: ");
        int size = sc.nextInt();
        sc.nextLine();
        int[] vect = new int[size];


        // Preenchendo vetor ---------------------------------------------------------
        for (int i = 0; i < vect.length; i++) {
            System.out.print("\n > Digite um número [" + (i + 1) + "]: ");
            vect[i] = sc.nextInt();
            sc.nextLine();
        }
        // Media dos pares ---------------------------------------------------------
        double sumEven = 0.0;
        int qtyEven = 0;
        double media;

        for (int j : vect) {
            if (j % 2 == 0) {
                sumEven += j;
                qtyEven++;
            }
        }

        media = (sumEven / qtyEven);
        if (media == 0) {
            System.out.printf("\n Média dos pares: %.1f", media);
        } else {
            System.out.println("\n ------------------ Nenhum número par! ------------------ ");
        }

        sc.close();
    }
}