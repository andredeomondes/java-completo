import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o horário de entrada: ");
        int entrada = sc.nextInt();

        System.out.print("Digite o horário de saída: ");
        int saida = sc.nextInt();

        int duracao;

        if (entrada > saida) {
            duracao = 24 - (entrada - saida);
        } else {
            duracao = saida - entrada;

        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

    }
}