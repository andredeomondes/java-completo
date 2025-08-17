package application;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("\n --------------------- SISTEMA SOMA-VETOR  --------------------- ");
        System.out.print("\n > Digite o tamanho do vetor: ");
        int size = sc.nextInt();
        sc.nextLine();
        double[] vectorNumbers = new double[size];


        // Inserindo numeros ao vetor  -----------------------------------------
        for (int i = 0; i < vectorNumbers.length; i++) {
            System.out.print("\n > Digite o número [" + (i + 1) + "] : ");
            vectorNumbers[i] = sc.nextDouble();
            sc.nextLine();
        }
        System.out.println("\n--------------------------------------");
        // Valores -----------------------------------------
        System.out.print("\n Valores = ");

        for (double vectorNumber : vectorNumbers) {
            System.out.printf("%.1f | ", vectorNumber);
        }
        // Soma    -----------------------------------------
        double sum = 0.0;
        for (int i = 0; i < vectorNumbers.length; i++) {
            sum += vectorNumbers[i];
        }
        System.out.printf("\n Soma = %.2f", sum);

        // Media   -----------------------------------------
        double media = sum / size;
        System.out.printf("\n Media = %.2f", media);
    }
}