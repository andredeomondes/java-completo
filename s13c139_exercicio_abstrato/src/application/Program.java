package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();

            if (ch == 'i') {
                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                sc.nextLine();
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                sc.nextLine();

                list.add(new Individual(name, anualIncome, healthExpenditures));

            } else {
                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                sc.nextLine();

                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                sc.nextLine();

                list.add(new Company(name, anualIncome, numberOfEmployees));

            }
        }

        double totalTax = 0;
        System.out.println();
        System.out.println("TAXES PAID: ");
        for (TaxPayer tp : list) {
            System.out.println(tp);
            totalTax += tp.tax();
        }
        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f", totalTax);
        sc.close();
    }

}