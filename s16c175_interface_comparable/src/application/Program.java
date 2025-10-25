package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        // Lista de Objetos do tipo Employee
        List<Employee> list = new ArrayList<>();

        // Caminho do arquivo
        String path = "C:\\Users\\Aluno\\Documents\\in.csv";

        // Leitura do arquivo
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            // Leitura linha a linha
            String employeeCsv = br.readLine();

            // Loop para ler todas as linhas do arquivo
            while (employeeCsv != null) {

                // Dividir a linha em campos
                String[] fields = employeeCsv.split(",");

                // Criar um objeto Employee e adicionar na lista
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));

                // Ler a próxima linha
                employeeCsv = br.readLine();
            }

            // Ordenar a lista pelo nome do funcionário
            Collections.sort(list); // Aqui ocorre o erro se Employee não implementar Comparable

           // Imprimir a lista ordenada
            for (Employee emp : list) {
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }

        // Tratamento de exceção
        } catch (IOException e) {
            // Mensagem de erro
            System.out.println("Error: " + e.getMessage());
        }
    }
}