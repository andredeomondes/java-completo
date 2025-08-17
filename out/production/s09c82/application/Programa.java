package application;

import entities.Conta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Conta c = new Conta();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da conta: ");
        c.numero = sc.nextInt();

        System.out.println("Digite o proprietário da conta: ");
        c.proprietario = sc.nextLine();

        System.out.println("Quer fazer um deposito inicial (s/n): ");


        sc.close();

    }
}