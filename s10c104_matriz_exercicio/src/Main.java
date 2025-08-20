import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println(" ---------------------------- EXERCITANDO MATRIZES E VETORES ---------------------------- ");

        System.out.print(" > Digite a quantidade de linhas: ");
        int l = sc.nextInt();
        sc.nextLine();

        System.out.print(" > Digite a quantidade de colunas: ");
        int c = sc.nextInt();
        sc.nextLine();

        int[][] mat = new int[l][c];
        System.out.println("--------------------------------------------------------------------------------------------");
        // Inserindo números nas matrizes --------------------------------------------------------------------------------------
        for (int linhas = 0; linhas < l; linhas++) {
            for (int colunas = 0; colunas < c; colunas++) {
                System.out.print(" > Digite o valor [" + linhas + "] [" + colunas + "] : ");
                mat[linhas][colunas] = sc.nextInt();
                sc.nextLine();
            }
        }

        // Exibindo matriz ------------------------------------------------------------------------------
        System.out.print("----------------------------------------------------------------------------");
        System.out.println("\n Matriz atual: ");
        for (int linhas = 0; linhas < l; linhas++) {
            for (int colunas = 0; colunas < c; colunas++) {
                System.out.print(" | " + mat[linhas][colunas] + " | ");
            }
            System.out.println();
        }
        // Posição ------------------------------------------------------------------------------
        System.out.print("\n----------------------------------------------------------------------------");
        System.out.print("\nDigite um número da matriz para exibir a posição: ");
        int x = sc.nextInt();
        sc.nextLine();

        for (int linhas = 0; linhas < l; linhas++) {
            for (int colunas = 0; colunas < c; colunas++) {
                if (mat[linhas][colunas] == x) {
                    System.out.println("Posição: [" + linhas + " - " + colunas + "]");
                    if (linhas > 0) {
                        System.out.println("Esquerda: " + mat[linhas][colunas - 1]);
                    }
                    if (colunas > 0) {
                        System.out.println("Cima: " + mat[linhas - 1][colunas]);
                    }
                    if (colunas < c - 1) {
                        System.out.println("Direita: " + mat[linhas][colunas + 1]);
                    }
                    if (linhas < l - 1) {
                        System.out.println("Baixo: " + mat[linhas + 1][colunas]);
                    }
                }
            }
            System.out.println();
        }

        sc.close();
    }
}