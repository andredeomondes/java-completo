import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();
        double taxa;

        if (n <= 2000.00) {
            taxa = 0.0;
        } else if (n <= 3000.00) {
            taxa = (n - 2000.00) * 0.08;
        } else if (n <= 4500.00) {
            taxa = (n - 3000.00) * 0.18 + (1000 * 0.08);
        } else {
            taxa = (n - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
        }

        if (taxa == 0.0) {
            System.out.println("Isento");

        } else {
            System.out.printf("R$ %.2f%n", taxa);
        }


        sc.close();
    }
}