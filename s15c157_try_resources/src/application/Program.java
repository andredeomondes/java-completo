package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        String path = "C:\\Users\\Aluno\\Desktop\\file.txt";

        // Dessa vez colocamos A INSTANCIAÇÃO DO BUFFERED READER E DO FILE READER DENTRO DOS PARAMETROS DO TRY
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();

            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}