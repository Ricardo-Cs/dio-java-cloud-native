package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio07 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Ordena em ordem decrescente e imprime o segundo valor
        numeros.stream()
                .sorted((a, b) -> b.compareTo(a)) // Ordena decrescente
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
