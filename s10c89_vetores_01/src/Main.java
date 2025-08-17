import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("\n-------------------------------------------------------------------");
        System.out.print("\n> Digite a quantidade de pessoas a ser adicionada: ");
        int n = sc.nextInt();
        double sum = 0.0;
        sc.nextLine();
        double[] vect = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("\n> Altura pessoa [" + (i+1) + "] : ");
            vect[i] = sc.nextDouble();
            sc.nextLine();
            sum += vect[i];
        }

        double averageHeight = sum / n;
        System.out.printf("\n ------------------- Altura média : %.2f" , averageHeight);


        sc.close();
    }
}