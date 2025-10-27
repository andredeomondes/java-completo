package application;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    ;

    public static void main(String[] args) {
        System.out.println("Generics Delimitados - GET PUT");

        //  Uso de curinga delimitado para leitura (GET)

        List<Integer> intList = new ArrayList<Integer>(); // Criação da lista de inteiros
        intList.add(10); // Adiciona o valor 10 à lista
        intList.add(20); // Adiciona o valor 20 à lista

        List<? extends Number> list = intList; // Uso de curinga delimitado para leitura (GET)
        Number x = list.get(0); // Leitura do primeiro elemento da lista
        System.out.println(x); // Exibe o valor lido
        // list.add(20); // Erro de compilação: não é possível adicionar elementos a uma lista com curinga delimitado para leitura

        List<Object> myObjs = new ArrayList<Object>(); // Criação da lista de objetos
        myObjs.add("Maria"); // Adiciona o valor "Maria" à lista
        myObjs.add("Bob"); // Adiciona o valor "Bob" à lista
        List<? super String> myStrings = myObjs; // Uso de curinga delimitado para escrita (PUT)
        myStrings.add("Alex"); // Adiciona o valor "Alex" à lista
        myStrings.add("Anna"); // Adiciona o valor "Anna" à lista
        // String s = myStrings.get(0); // Erro de compilação: não é possível ler elementos como String de uma lista com curinga delimitado para escrita

        List<Integer> myInts = Arrays.asList(1, 2, 3, 4); // Criação da lista de inteiros
        List<Double> myDoubles = Arrays.asList(3.14, 6.28); // Criação da lista de doubles
        List<Object> myObjs2 = new ArrayList<Object>(); // Criação da lista de objetos
        copy(myInts, myObjs2); // Cópia de inteiros para doubles
        printList(myObjs2); // Impressão da lista de objetos
        copy(myDoubles, myObjs2); // Cópia de doubles para objetos
        printList(myObjs2); // Impressão da lista de objetos

    }

    public static void copy(List<? extends Number> source, List<? super Number> destination) {
        for (Number number : source) {
            destination.add(number);
        }
    }

    public static void printList(List<?> list) {

        System.out.println("----------------------------");

        for (Object obj : list) {
            System.out.println(obj);
        }
        System.out.println("----------------------------");
    }
}
