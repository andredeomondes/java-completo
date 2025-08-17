import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println(" --------------------------- MATRIZ TUTORIAL --------------------------- ");
        System.out.print("Digite o tamanho da matriz : ");
        int n = sc.nextInt();
        sc.nextLine();
        int[][] mat = new int[n][n];
        System.out.println("------------------------------------------------------------------------");


        // Inserindo números na matriz -------------------------------------------------------------------------------------------------------------------
        for (int coluna = 0; coluna < n; coluna++) {
            for (int linha = 0; linha < n; linha++) {
                System.out.print(" > Digite o valor da coluna(" + coluna + ") linha (" + linha + ") : ");
                mat[coluna][linha] = sc.nextInt();
                sc.nextLine();
            }
        }
        System.out.print("----------------------------------------------------------------------------");
        System.out.println("\n Matriz atual: ");
        for (int coluna = 0; coluna < n; coluna++) {
            for (int linha = 0; linha < n; linha++) {
                System.out.print(" | " + mat[coluna][linha] + " | ");
            }
            System.out.println();
        }

        // Contando números negativos dentro da matriz -------------------------------------------------------------------------------------------------------------------
        int contadorNegativos = 0;
        for (int coluna = 0; coluna < n; coluna++) {
            for (int linha = 0; linha < n; linha++) {
                if (mat[coluna][linha] < 0) {
                    contadorNegativos++;
                }
            }
        }
        System.out.printf("\n > Quantidade de números negativos: " + contadorNegativos);
        // Exibindo diagonais -------------------------------------------------------------------------------------------------------------------
        System.out.print("\n > Diagonais: ");
        for (int coluna = 0; coluna < n; coluna++) {
            for (int linha = 0; linha < n; linha++) {
                if (coluna == linha) {
                    System.out.print(" | " + mat[coluna][linha] + " | ");
                }
            }
        }
        System.out.println();

        sc.close();

    }
}