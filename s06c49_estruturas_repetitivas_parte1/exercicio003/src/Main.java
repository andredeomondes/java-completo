import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;


        while (n != 4) {
            switch (n) {

                case 1:
                    alcool++;
                    break;

                case 2:
                    gasolina++;
                    break;


                case 3:
                    diesel++;
                    break;


                case 4:
                    System.out.println("Encerrando...");
                    break;
            }
            n = sc.nextInt();

        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

    }
}