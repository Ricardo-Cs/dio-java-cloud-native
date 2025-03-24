package list.Pesquisa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
        System.out.println("Número adicionado na lista!");
    }

    public int calcularSoma() {
        int soma = 0;

        for(int num : numeros)
            soma += num;

        return soma;
    }

    public int encontrarMaiorNumero() {
        return Collections.max(numeros);
    }

    public int encontrarMenorNumero() {
        return Collections.min(numeros);
    }

    public void exibirNumeros() {
        for(int num: numeros) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(6);
        somaNumeros.adicionarNumero(7);

        somaNumeros.calcularSoma();

        somaNumeros.exibirNumeros();

        System.out.println("Maior número da lista: " + somaNumeros.encontrarMaiorNumero());

        System.out.println("Menor número da lista: " + somaNumeros.encontrarMenorNumero());
    }
}
