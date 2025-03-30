package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio06 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Apenas retornar se tem ou não o valor maior
        boolean resultado = numeros.stream().anyMatch(n -> n > 10);
        if(resultado) System.out.println("Existe número maior do que 10!");

        // Para retornar o primeiro valor maior do que 10
        numeros.stream()
                .filter(n -> n > 10)
                .findFirst()
                .ifPresent(n -> System.out.println("Número maior que 10 encontrado: " + n));
    }
}
