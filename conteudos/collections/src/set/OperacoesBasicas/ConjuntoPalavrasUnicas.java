package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavraSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        if(palavraSet.add(palavra))
            System.out.println("Palavra adicionada com sucesso!");
        else
            System.out.println("Palavra já existe no conjunto!");
    }

    public void removerPalavra(String palavra) {
        if(palavraSet.remove(palavra))
            System.out.println("Palavra removida com sucesso!");
        else
            System.out.println("Palavra não existe no conjunto!");
    }

    public void verificarPalavra(String palavra) {
        if(palavraSet.contains(palavra))
            System.out.println("Palavra existe no conjunto!");
        else
            System.out.println("Palavra não existe no conjunto!");
    }

    public void exibirPalavrasUnicas() {
        if(palavraSet.isEmpty())
            System.out.println("Conjunto vazio!");
        else
            System.out.println(palavraSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        // Adicionando palavras
        conjunto.adicionarPalavra("Java");
        conjunto.adicionarPalavra("Python");
        conjunto.adicionarPalavra("Java"); // Teste de duplicação

        // Exibindo palavras
        conjunto.exibirPalavrasUnicas();

        // Verificando palavras
        conjunto.verificarPalavra("Java");
        conjunto.verificarPalavra("C++");

        // Removendo palavras
        conjunto.removerPalavra("Python");
        conjunto.removerPalavra("Ruby"); // Tentativa de remover algo que não existe

        // Exibindo após remoção
        conjunto.exibirPalavrasUnicas();
    }

}
