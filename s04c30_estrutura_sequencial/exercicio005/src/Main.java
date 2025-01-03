import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigoPeca1, codigoPeca2, quantidadePeca1, quantidadePeca2;
        double valorUnitarioPeca1, valorUnitarioPeca2, total;


        codigoPeca1 = sc.nextInt();
        quantidadePeca1 = sc.nextInt();
        valorUnitarioPeca1 = sc.nextDouble();

        codigoPeca2 = sc.nextInt();
        quantidadePeca2 = sc.nextInt();
        valorUnitarioPeca2 = sc.nextDouble();

        total = (valorUnitarioPeca1 * quantidadePeca1) + (valorUnitarioPeca2 * quantidadePeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

    }
}