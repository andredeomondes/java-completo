import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int senha, x;
        senha = 2002;

        System.out.print("Digite sua senha: ");
        x = sc.nextInt();

        while (x != senha) {
            System.out.println("Acesso negado");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.print("Digite sua senha novamente: ");

            x = sc.nextInt();
        }

        System.out.println("Acesso permitido");

    }
}