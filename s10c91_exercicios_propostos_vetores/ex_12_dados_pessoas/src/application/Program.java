package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("\n -------------------- DADOS PESSOAS -------------------- ");
        System.out.print("Digite o tamanho do vetor: ");
        int size = sc.nextInt();
        sc.nextLine();
        Person[] p = new Person[size];

        // Preenchendo vetor ----------------------------------------------------
        for (int i = 0; i < p.length; i++) {
            p[i] = new Person();
            System.out.println("\n---------------------------");
            System.out.println("~ DADOS DA " + (i + 1) + "° PESSOA");
            System.out.print(" > NOME: ");
            p[i].setName(sc.nextLine());
            System.out.print(" > GÊNERO [M/F]: ");
            p[i].setGender(sc.next().toUpperCase().charAt(0));
            System.out.print(" > ALTURA: ");
            p[i].setHeight(sc.nextDouble());
            sc.nextLine();


        }
        System.out.println("\n -------------------------- DADOS GERAIS -------------------------- ");
        int qtyGeneral = 0;
        int indexBiggestHeightGeneral = 0;
        int indexSmallestHeightGeneral = 0;
        double biggestHeightGeneral = p[0].getHeight();
        double smallestHeightGeneral = p[0].getHeight();
        double sumHeightGeneral = 0;
        double mediaHeightGeneral;

        // Dados: Gerais ------------------------------------------------------------------
        for (int i = 0; i < p.length; i++) {
            if (biggestHeightGeneral < p[i].getHeight()) {
                biggestHeightGeneral = p[i].getHeight();
                indexBiggestHeightGeneral = i;
            }

            if (smallestHeightGeneral > p[i].getHeight()) {
                smallestHeightGeneral = p[i].getHeight();
                indexSmallestHeightGeneral = i;
            }
            sumHeightGeneral += p[i].getHeight();
            qtyGeneral++;

        }
        System.out.println("Quantidade de pessoas (total) : " + qtyGeneral);
        System.out.print("Pessoa com maior altura (geral) : ");
        System.out.println(p[indexBiggestHeightGeneral]);
        System.out.print("Pessoa com menor altura (geral) : ");
        System.out.print(p[indexSmallestHeightGeneral]);
        mediaHeightGeneral = sumHeightGeneral / qtyGeneral;
        System.out.printf("\nMédia de altura(geral) : %.2f", mediaHeightGeneral);

        // Dados: Masculino ------------------------------------------------------------------
        System.out.println("\n -------------------------- DADOS: MASCULINO -------------------------- ");
        int indexBiggestHeightMale = -1;
        int indexSmallestHeightMale = -1;
        int qtyMale = 0;
        double biggestHeightMale = -1;
        double smallestHeightMale = Double.MAX_VALUE;
        double sumHeightMale = 0;
        double mediaHeightMale;

        // Maior e menor altura entre os homens
        for (int i = 0; i < p.length; i++) {
            if (p[i].getGender() == 'M' || p[i].getGender() == 'm') {
                if (biggestHeightMale < p[i].getHeight()) {
                    biggestHeightMale = p[i].getHeight();
                    indexBiggestHeightMale = i;
                }

                if (smallestHeightMale > p[i].getHeight()) {
                    smallestHeightMale = p[i].getHeight();
                    indexSmallestHeightMale = i;
                }
                sumHeightMale += p[i].getHeight();
                qtyMale++;
            }

        }
        if (qtyMale > 0) {

            System.out.print("Homem com maior altura : ");
            System.out.println(p[indexBiggestHeightMale]);
            System.out.print("Homem com menor altura : ");
            System.out.println(p[indexSmallestHeightMale]);
            System.out.println("Quantidade de homens : " + qtyMale);
            mediaHeightMale = sumHeightMale / qtyMale;
            System.out.printf("\nMédia de altura dos homens : %.2f", mediaHeightMale);

        } else {
            System.out.println("Não há homens!");
        }
        // Dados: Mulheres ------------------------------------------------------------------
        System.out.println("\n -------------------------- DADOS: FEMININO -------------------------- ");
        int indexBiggestHeightFemale = -1;
        int indexSmallestHeightFemale = -1;
        int qtyFemale = 0;
        double biggestHeightFemale = -1;
        double smallestHeightFemale = Double.MAX_VALUE;
        double sumHeightFemale = 0;
        double mediaHeightFemale;

        // Maior e menor altura entre mulheres
        for (int i = 0; i < p.length; i++) {
            if (p[i].getGender() == 'F' || p[i].getGender() == 'f') {
                if (biggestHeightFemale < p[i].getHeight()) {
                    biggestHeightFemale = p[i].getHeight();
                    indexBiggestHeightFemale = i;
                }

                if (smallestHeightFemale > p[i].getHeight()) {
                    smallestHeightFemale = p[i].getHeight();
                    indexSmallestHeightFemale = i;
                }
                sumHeightFemale += p[i].getHeight();
                qtyFemale++;
            }

        }


        mediaHeightFemale = sumHeightFemale / qtyFemale;
        if (qtyFemale > 0) {
            System.out.println("Quantidade de mulheres : " + qtyFemale);
            System.out.print("Mulher com maior altura : ");
            System.out.println(p[indexBiggestHeightFemale]);
            System.out.print("Mulher com menor altura : ");
            System.out.println(p[indexSmallestHeightFemale]);
            System.out.printf("Média de altura das mulheres : %.2f", mediaHeightFemale);
        } else {
            System.out.println("Não há mulheres");
        }

        sc.close();

    }
}