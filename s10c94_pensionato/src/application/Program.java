package application;

import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println(" -------------------- PENSIONATO --------------------");
        System.out.print("Digite a quantidade de quartos que quer reservar: ");
        int quantity = sc.nextInt();
        sc.nextLine();
        Rent[] r = new Rent[10];

        for (int i = 0; i < quantity; i++) {
            System.out.println("-----------------------------------------------------");
            System.out.println("Aluguel #" + (i + 1));
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("E-mail: ");
            String email = sc.nextLine();
            System.out.print("Quarto [0-9]: ");
            int roomIndex = sc.nextInt();
            sc.nextLine();
            r[roomIndex] = new Rent();
            r[roomIndex].setName(name);
            r[roomIndex].setEmail(email);

        }
        System.out.println("-----------------------------------------");
        System.out.println("Quartos ocupados:");
        for (int i = 0; i < r.length; i++) {
            if (r[i] != null) {
                System.out.println(i + ": " + r[i]);
            }
        }

        sc.close();
    }
}