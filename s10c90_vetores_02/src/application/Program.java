package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int size;
        double sum = 0.0;
        System.out.println("\n-------------------------------");
        System.out.println("        Objetos e Vetores!       ");
        System.out.println("-------------------------------");

        System.out.print("Digite o tamanho do vetor de produtos: ");
        size = sc.nextInt();
        sc.nextLine();
        Product[] vect = new Product[size];
        for (int i = 0; i < vect.length; i++) {

            vect[i] = new Product();
            System.out.print("\n> Digite o nome do produto: ");
            vect[i].setName(sc.nextLine());
            System.out.print("\n> Digite o preço do produto: ");
            vect[i].setPrice(sc.nextInt());
            sc.nextLine();
            System.out.println("Cadastro de produto confirmado! ---------------------");
            System.out.println(vect[i]);
            System.out.println("-----------------------------------------------");
        }

        for (int i = 0; i < vect.length ; i++) {
            sum += vect[i].getPrice();
        }

        double media = sum/size;
        System.out.printf("Preço médio: %.2f", media);

        sc.close();

    }
}