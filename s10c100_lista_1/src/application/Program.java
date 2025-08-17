package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------- LISTAS -------------------- ");
        System.out.print(" > Quantos empregados serão cadastrados? ");
        int quantidadeEmpregados = sc.nextInt();
        sc.nextLine();

        List<Employee> emp = new ArrayList<>();

        for (int i = 0; i < quantidadeEmpregados; i++) {
            System.out.println("Empregado #" + (i + 1) + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Salário: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            emp.add(new Employee(id, name, salary));
        }
        System.out.print(" > Digite o ID do funcionário que receberá um aumento: ");
        int idIncrease = sc.nextInt();
        sc.nextLine();
        int position = position(emp, idIncrease);
        if (position == -1) {
            System.out.println("O id informado não existe!");
        } else {
            System.out.print(" > Digite em quantos porcentos quer aumentar o salario: ");
           double percentage = sc.nextDouble();
           emp.get(position).increaseSalary(percentage);
        }
        System.out.println("Lista de funcionários: ");
        for (int i = 0; i < emp.size(); i++) {
            System.out.println(emp.get(i));
        }
        sc.close();
    }

    public static int position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

}