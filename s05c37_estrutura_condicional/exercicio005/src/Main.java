import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo;
        int quantidade;
        double total = 0;


        System.out.println("======================");
        System.out.println("| LANCHONETE DO MANÉ |");
        System.out.println("======================");
        System.out.println();
        System.out.printf("Digite o código do lanche: ");
        codigo = sc.nextInt();
        System.out.printf("Digite a quantidade: ");
        quantidade = sc.nextInt();

        switch (codigo) {
            case 1:
                total = 4.00 * quantidade;
                break;
            case 2:
                total = 4.50 * quantidade;
                break;
            case 3:
                total = 5.00 * quantidade;
                break;
            case 4:
                total = 2.00 * quantidade;
                break;
            case 5:
                total = 1.50 * quantidade;
                break;
        }
        System.out.printf("Total = R$ %.2f\n", total);

    }
}