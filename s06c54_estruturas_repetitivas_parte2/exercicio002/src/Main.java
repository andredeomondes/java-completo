import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int in = 0, out = 0;


        for (int i = 0; i < N; i++) {

            int x = sc.nextInt();

            if (x >= 10 && x <= 20) {
                in++;
            } else {
                out++;
            }


        }

        System.out.println(in + " in");
        System.out.println(out + " out");

    }
}