package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("\n ---------------------- MAIS VELHO ----------------------  ");
        System.out.print(" > Digite o tamanho do vetor: ");
        int size = sc.nextInt();
        sc.nextLine();
        Person[] p = new Person[size];


        // PREENCHENDO VETOR -------------------------------------------------------------
        for (int i = 0; i < p.length; i++) {
            p[i] = new Person();
            System.out.println("-------------------------------------------");
            System.out.println("Dados da [" + (i + 1) + "a] pessoa: ");
            System.out.print(" > Nome: ");
            p[i].setName(sc.nextLine());
            System.out.print(" > Idade: ");
            p[i].setAge(sc.nextInt());
            sc.nextLine();
        }
        // PESSOA MAIS VELHA -------------------------------------------------------------
        int older = 0;
        int indexOlder = 0;

        for (int i = 0; i < p.length; i++) {
            if (p[i].getAge() > older) {
               older = p[i].getAge();
               indexOlder = i;
            }
        }
        System.out.println("-------------- Pessoa mais velha: "+p[indexOlder].getName());

    }
}