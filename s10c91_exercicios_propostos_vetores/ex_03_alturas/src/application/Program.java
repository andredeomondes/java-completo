package application;

import entities.Person;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println(" --------------------- PESSOAS x ALTURA --------------------- ");
        System.out.print(" > Digite a quantidade de pessoas: ");
        int size = sc.nextInt();
        sc.nextLine();
        Person[] p = new Person[size];

        // Enchendo os dados dos vetores ----------------------------------------------------------
        for (int i = 0; i < p.length; i++) {

            p[i] = new Person();

            System.out.println("\n --------------- Adicionando pessoa [" + (i + 1) + "] --------------- ");

            System.out.print("\n > Digite o nome da pessoa [" + (i + 1) + "] : ");
            p[i].setName(sc.nextLine());

            System.out.print("\n > Digite a idade da pessoa [" + (i + 1) + "] : ");
            p[i].setAge(sc.nextInt());
            sc.nextLine();

            System.out.print("\n > Digite a altura da pessoa [" + (i + 1) + "] : ");
            p[i].setHeight(sc.nextDouble());
            sc.nextLine();

            System.out.println("\n [" + (i + 1) + "] cadastrado!");
        }

        // Altura media ----------------------------------------------------------
        double sum = 0.0;
        for (int i = 0; i < p.length; i++) {
            sum += p[i].getHeight();
        }
        double media = sum / p.length;
        System.out.printf("\n > Altura média: %.2fm", media);

        // Porcentagem de pessoas com menos de 16 anos ----------------------------------------------------------
        int count = 0;
        for (Person person : p) {
            if (person.getAge() < 16) {
                count++;
            }

        }
        double percentage = (count * 100 / p.length);
        System.out.printf("\n > Pessoas com menos de 16 anos: %.0f %%", percentage);

        // Listar pessoas com menos de 16 anos ----------------------------------------------------------
        System.out.println("\n\n -------------- Lista de pessoas com menos de 16 anos -------------- ");
        for (Person person : p) {
            if (person.getAge() < 16) {
                System.out.print("\n - " + person.getName());
                ;
            }
        }
        sc.close();
    }
}