import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número (a) : ");
        int a = sc.nextInt();

        System.out.print("Digite o número (b) : ");
        int b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }
    }
}