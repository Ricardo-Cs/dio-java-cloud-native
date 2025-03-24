package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
        System.out.println("Item adicionado ao carrinho!");
    }

    public void removerItem(String nome) {
        // Procura o primeiro valor na lista com o nome
        Optional<Item> itemParaRemover = itemList.stream()
                .filter(item -> item.getNome().equals(nome))
                .findFirst();

        // Se encontrado, o remove
        itemParaRemover.ifPresentOrElse(item -> itemList.remove(item), () -> System.out.println("Item não encontrado no carrinho!"));
        // () -> é chamado de expressão lambda (algo como uma array function do javascript)
    }

    public void calcularValorTotal() {
        double sum = 0;

        for(Item i : itemList) {
            sum += (i.getPreco() * i.getQuantidade());
        }

        System.out.println("Valor total do carrinho: R$ " + sum);
    }

    public void exibirItens() {
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Televisão", 3000.23, 2);
        carrinho.adicionarItem("Blusa", 30.52, 7);
        carrinho.adicionarItem("Sapato", 200.2, 2);

        carrinho.calcularValorTotal();

        carrinho.removerItem("Sapato");
        carrinho.removerItem("Tênis");

        carrinho.calcularValorTotal();

        carrinho.exibirItens();
    }
}
