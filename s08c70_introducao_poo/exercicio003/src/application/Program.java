package application;

import product.Notas;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Notas not = new Notas();

        System.out.printf("Name: ");
        not.name = sc.nextLine();
        System.out.printf("AV1: ");
        not.av1 = sc.nextDouble();
        System.out.printf("AV2: ");
        not.av2 = sc.nextDouble();
        System.out.printf("AV3: ");
        not.av3 = sc.nextDouble();


        System.out.println("FINAL GRADE = " + not.finalGrade());
        System.out.println(not.isPassed());


        sc.close();


    }
}