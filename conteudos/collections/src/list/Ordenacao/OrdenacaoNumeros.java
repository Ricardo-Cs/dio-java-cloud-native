package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numList;

    public OrdenacaoNumeros() {
        this.numList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numList.add(numero);
    }

    // Método para ordenar em ordem ascendente usando Comparable e Collections
    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(numList);
        Collections.sort(numerosAscendente);
        return numerosAscendente;
    }

    // Método para ordenar em ordem descendente usando Comparator e Collections
    public List<Integer> ordenarDescendente() {
        List<Integer> numerosDescendente = new ArrayList<>(numList);
        Collections.sort(numerosDescendente, Collections.reverseOrder());
        return numerosDescendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacao = new OrdenacaoNumeros();

        // Adicionando números
        ordenacao.adicionarNumero(5);
        ordenacao.adicionarNumero(2);
        ordenacao.adicionarNumero(8);
        ordenacao.adicionarNumero(1);
        ordenacao.adicionarNumero(3);

        // Testando ordenação ascendente
        System.out.println("Ordem ascendente: " + ordenacao.ordenarAscendente());

        // Testando ordenação descendente
        System.out.println("Ordem descendente: " + ordenacao.ordenarDescendente());
    }
}
