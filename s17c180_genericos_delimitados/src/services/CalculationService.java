package services;

import java.util.List;

public class CalculationService {
    // Metodo genérico para encontrar o valor máximo em uma lista
    public static <T extends Comparable <T>> T max(List<T> list) {

        // Verifica se a lista está vazia
        if (list.isEmpty()) {
            // Lança uma exceção se estiver vazia
            throw new IllegalStateException("List can't be empty");
        }
        // Inicializa a variável max com o primeiro elemento da lista
        T max = list.get(0);

        // Itera sobre cada item na lista
        for (T item : list) {
            // Compara o item atual com o valor máximo encontrado até agora
            if(item.compareTo(max) > 0) {
                // Atualiza o valor máximo se o item atual for maior
                max = item;
            }
        }
        return max; // Retorna o valor máximo encontrado
    }
}
