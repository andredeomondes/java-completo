package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println(" ----------------- SOMA VETORES ----------------- ");
        System.out.print("\n > Digite o tamanho dos vetores: ");
        int size = sc.nextInt();
        sc.nextLine();

        // Preenchendo Vetor A ----------------------------------------------------------
        System.out.println("\n ----------------- VETORES [A] ----------------- ");
        int[] vectA = new int[size];
        for (int i = 0; i < vectA.length; i++) {
            System.out.print("\n >(Vetor A) Digite o número [" + (i + 1) + "] : ");
            vectA[i] = sc.nextInt();
            sc.nextLine();
        }

        // Preenchendo Vetor B ----------------------------------------------------------
        System.out.println("\n ----------------- VETORES [B] ----------------- ");
        int[] vectB = new int[size];
        for (int i = 0; i < vectB.length; i++) {
            System.out.print("\n >(Vetor B) Digite o número [" + (i + 1) + "] : ");
            vectB[i] = sc.nextInt();
            sc.nextLine();
        }
        // Somando Vetores A + B ----------------------------------------------------------
        System.out.println("\n ----------------- SOMA DOS VETORES VETORES [A+B] ----------------- ");
        for (int i = 0; i < vectA.length; i++) {
            int sum;
            sum = (vectA[i] + vectB[i]);
            System.out.printf("\n > [" + (i + 1) + "] = %d ", sum  );

        }

        sc.close();
    }
}