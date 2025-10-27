package application;

import entities.Client;

public class Program {
    public static void main(String[] args) {

        System.out.println("--------------------------------------");
        System.out.println("Aula de HashCode e Equals");
        System.out.println("--------------------------------------");

        // Equals o que é: metodo que compara o conteudo de dois objetos
        // Hashcode o que é: metodo que retorna um valor inteiro que representa o objeto na memória

        // Exemplo 1: Comparação de Strings com equals
        String a = "Maria";
        String b = "Carla";

        // Comparação usando equals
        if (a.equals(b)) {
            System.out.println("As strings são iguais.");
        } else {
            System.out.println("As strings são diferentes.");
        }
        System.out.println("--------------------------------------");
        // Exemplo 2: Exibindo hashcodes de Strings
        System.out.println("Maria - " + a.hashCode());
        System.out.println("Carla - " + b.hashCode());
        System.out.println("--------------------------------------");

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Alex", "alex@gmail.com");
        Client c3 = new Client("Maria", "mariab@gmail.com");

        System.out.println(c1 + " - " + c1.hashCode());
        System.out.println(c2 + " - " + c2.hashCode());
        System.out.println(c3 + " - " + c3.hashCode());








    }
}
