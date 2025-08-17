package application;

import java.util.Locale;
import java.util.Scanner;

public class abaixo_da_media {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("\n ------------------------ ABAIXO DA MEDIA  ------------------------ ");
        System.out.print("\n > Digite o tamanho do vetor: ");
        int size = sc.nextInt();
        double sum = 0.0;
        double[] vect = new double[size];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("\n > Digite o número [" + (i + 1) + "] : ");
            vect[i] = sc.nextDouble();
            sc.nextLine();
            sum += vect[i];
        }
        double media = sum / size;
        System.out.printf("\n --------------------- Média do vetor: %.3f", media);

        System.out.println(" \n\n------------------------- ELEMENTOS ABAIXO DA MÉDIA ------------------------- ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < media) {
                System.out.printf(" > %.1f", vect[i]);
            }

        }
    }
}