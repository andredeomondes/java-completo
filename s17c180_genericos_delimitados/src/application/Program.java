package application;

import entities.Product;
import services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        // Criação da lista para armazenar os produtos
        List<Product> list = new ArrayList<>();

        // Caminho do arquivo de entrada
        String path = "C:\\Users\\Aluno\\Desktop\\lista-teste.Csv";

        // Leitura do arquivo usando try-with-resources para garantir o fechamento do recurso
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine(); // Lê a primeira linha do arquivo
            while (line != null) {  // Enquanto houver linhas para ler
                String [] fields = line.split(","); // Divide a linha em campos usando vírgula como delimitador
                String name = fields[0]; // Primeiro campo é o nome do produto
                double price = Double.parseDouble(fields[1]); // Segundo campo é o preço do produto
                list.add(new Product(name, price)); // Cria um novo produto e adiciona à lista
                line = br.readLine(); // Lê a próxima linha
            }

            Product max = CalculationService.max(list); // Chama o serviço para encontrar o produto com o maior preço
            System.out.println("Most expensive: " + max); // Exibe o valor máximo encontrado

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        }
    }
}
