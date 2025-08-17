package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("\n -------------------- APROVADOS -------------------- ");
        System.out.print("Digite o tamanho do vetor: ");
        int size = sc.nextInt();
        sc.nextLine();
        Student[] s = new Student[size];

        // Preenchendo vetor -----------------------------------------------------------
        for (int i = 0; i < s.length; i++) {
            s[i] = new Student();
            System.out.println("\n----------------------------------------------------");
            System.out.println("Dados do " + (i + 1) + "° aluno(a): ");
            System.out.print(" > Nome: ");
            s[i].setName(sc.nextLine());
            System.out.print(" > Nota (AV1) : ");
            s[i].setGrade1(sc.nextDouble());
            sc.nextLine();
            System.out.print(" > Nota (AV2): ");
            s[i].setGrade2(sc.nextDouble());
            sc.nextLine();
            s[i].setMedia(((s[i].getGrade1() + s[i].getGrade2()) / 2.0));
            System.out.printf(" ----------- Media: %.1f", s[i].getMedia());


        }
        System.out.println("\n ----------------------------------------------");
        System.out.println("  >>> Alunos aprovados: ");
        for (Student student : s) {
            if (student.getMedia() >= 6) {
                System.out.printf("\n - %s", student.getName());
            }
        }


        sc.close();
    }
}