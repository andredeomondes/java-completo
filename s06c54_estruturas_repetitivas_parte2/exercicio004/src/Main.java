import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();


        for (int i = 0; i < N; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            if (b == 0) {
                System.out.println("Divisão impossível");
            } else {
                double divisao = a / b;
                System.out.printf("%.1f%n", divisao);
            }

        }
    }
}