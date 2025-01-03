import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();


        for (int i = 1; i <= N; i++) {

            int q = i * i;
            int c = i * i * i;
            System.out.print(i + " " + " " + q + "  " + c + "\n");


        }

    }
}