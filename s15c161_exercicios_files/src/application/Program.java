package application;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Criação da lista de produtos
        List<Product> list = new ArrayList<>();

        // Entrada de arquivo CSV
        System.out.println("Enter file path: ");
        String sourceFileStr = sc.nextLine();
        // "C:\\Users\\Aluno\\Documents\\source.csv";


        // Criação do novo arquivo
        File sourceFile = new File(sourceFileStr);

        // Endereço da pasta de origem
        String sourceFolderStr = sourceFile.getParent();

        // Criação da pasta out na pasta de origem
        boolean success = new File(sourceFolderStr + "\\out").mkdir();

        // Adição de "sourceForlderStr" a nova variável "targetFileStr"
        String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

        // Instanciação que aprendi para uma leitura com buff de formam mais rápida e eficiente
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

            // Leitura do buffer linha a linha
            String itemCsv = br.readLine();

            // Aqui enquanto a leitura da linha não for nula ele ira ler linha a linha
            while (itemCsv != null) {

                // Aqui é criado um vetor do tipo Strings chamado "fields" que separa as linhas que acabamos de ler a cada ","
                String[] fields = itemCsv.split(",");

                // Sabemos que a distribuição está por NOME | PREÇO | QUANTIDADE

                // Nome:
                String name = fields[0];

                // Preço:
                double price = Double.parseDouble(fields[1]);

                // Quantidade:
                int quantity = Integer.parseInt(fields[2]);

                // Instanciação de um novo produto dentro da lista
                list.add(new Product(name, price, quantity));

                // Recursão
                itemCsv = br.readLine();


            }

            // Instanciação que aprendi para uma leitura com buff de formam mais rápida e eficiente
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

                // Percorre item a item na nossa lista e escreve NOME DO PRODUTO | PREÇO TOTAL
                for (Product item : list) {
                    bw.write(item.getName() + "," + String.format("%.2f", item.total()));
                    bw.newLine();
                }
                System.out.println(targetFileStr + " CREATED!");

            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());

            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        sc.close();
    }
}
