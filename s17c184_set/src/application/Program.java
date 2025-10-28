package application;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        System.out.println("---------------------- Aula de SET --------------------");
        System.out.println("Set: coleção de elementos que não permite duplicatas e não mantém uma ordem específica.");
        System.out.println("[ Hashset - mais rápido ] : implementação de Set que utiliza uma tabela hash para armazenar os elementos.");
        System.out.println("[ Treeset - mais lento] : implementação de Set que mantém os elementos em ordem crescente.");
        System.out.println("[ LinkedHashSet - intermediário ]: implementação de Set que mantém a ordem de inserção dos elementos.");


        System.out.println("---------------------- HASH SET  --------------------");

        // Hashset é uma coleção que não permite elementos duplicados e não mantém uma ordem específica dos elementos.
        Set<String> hashSet = new HashSet<>();

        // Adicionando elementos ao HashSet
        hashSet.add("Ana");
        hashSet.add("Carlos");
        hashSet.add("Bob");

        // Verificando se o HashSet contém o elemento "Ana"
        System.out.println(hashSet.contains("Ana"));
        for (String s : hashSet) {
            System.out.println(s);
        }

        // Treeset é uma coleção que não permite elementos duplicados e mantém os elementos em ordem crescente.
        System.out.println("---------------------- TREE SET  --------------------");
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Ana");
        treeSet.add("Carlos");
        treeSet.add("Bob");

        // Verificando se o TreeSet contém o elemento "Ana"
        System.out.println(hashSet.contains("Ana"));

        // Iterando sobre os elementos do TreeSet e imprimindo-os
        for (String s : treeSet) {
            System.out.println(s);
        }

        System.out.println("---------------------- LINKED HASH SET  --------------------");
        // LinkedHashSet é uma coleção que não permite elementos duplicados e mantém a ordem de inserção dos elementos.
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // Adicionando elementos ao LinkedHashSet
        linkedHashSet.add("Ana");
        linkedHashSet.add("Carlos");
        linkedHashSet.add("Bob");
        linkedHashSet.add("Lucas");

        // Verificando se o LinkedHashSet contém o elemento "Ana"
        System.out.println(linkedHashSet.contains("Ana"));

        // Iterando sobre os elementos do LinkedHashSet e imprimindo-os
        for (String s : linkedHashSet) {
            System.out.println(s);
        }


        // Removendo elementos que começam com a letra 'A'
        System.out.println("Removendo elementos que começam com a letra 'A':");
        linkedHashSet.removeIf(x -> x.charAt(0) == 'A');

        // Imprimindo os elementos após a remoção
        for (String s : linkedHashSet) {
            System.out.println(s);
        }

        System.out.println("---------------------- EXEMPLO DE UNIÃO DE CONJUNTOS COM TREESET  --------------------");
        // Exemplo de união de conjuntos usando TreeSet
        Set<Integer> conjuntoA = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> conjuntoB = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10, 11, 12));

        // Cojunto A
        System.out.println("Conjunto A: " + conjuntoA);

        // Conjunto B
        System.out.println("Conjunto B: " + conjuntoB);

        // União
        Set<Integer> conjuntoUniao = new TreeSet<>(conjuntoA);
        conjuntoUniao.addAll(conjuntoB);
        System.out.println("União: " + conjuntoUniao);

        // Interseção
        Set<Integer> conjuntoIntersecao = new TreeSet<>(conjuntoA);
        conjuntoIntersecao.retainAll(conjuntoB);
        System.out.println("Interseção: " + conjuntoIntersecao);

        // Diferença (A - B)
        Set<Integer> conjuntoDiferenca = new TreeSet<>(conjuntoA);
        conjuntoDiferenca.removeAll(conjuntoB);
        System.out.println("Diferença (A - B): " + conjuntoDiferenca);




    }
}