import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x, y;

        System.out.printf("Digite o valor da coordenada X: ");
        x = sc.nextInt();
        System.out.printf("Digite o valor da coordenada Y: ");
        y = sc.nextInt();

        while (x != 0 || y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Está localizado no primeiro quadrante");
                System.out.printf("Digite o valor da coordenada X: ");
                x = sc.nextInt();
                System.out.printf("Digite o valor da coordenada Y: ");
                y = sc.nextInt();

            } else if (x < 0 && y > 0) {
                System.out.println("Está localizado no segundo quadrante");
                System.out.printf("Digite o valor da coordenada X: ");
                x = sc.nextInt();
                System.out.printf("Digite o valor da coordenada Y: ");
                y = sc.nextInt();

            } else if (x < 0 && y < 0) {
                System.out.println("Está localizado no terceiro quadrante");
                System.out.printf("Digite o valor da coordenada X: ");
                x = sc.nextInt();
                System.out.printf("Digite o valor da coordenada Y: ");
                y = sc.nextInt();

            } else if (x > 0 && y < 0) {
                System.out.println("Está localizado no quarto quadrante");
                System.out.printf("Digite o valor da coordenada X: ");
                x = sc.nextInt();
                System.out.printf("Digite o valor da coordenada Y: ");
                y = sc.nextInt();

            } else {
                System.out.println("..........");
                System.out.println("Encerrando");
                return;

            }


        }

    }
}