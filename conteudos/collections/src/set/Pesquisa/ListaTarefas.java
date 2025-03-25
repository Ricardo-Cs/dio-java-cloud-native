package set.Pesquisa;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        if(tarefaSet.add(new Tarefa(descricao)))
            System.out.println("Tarefa adicionada com sucesso!");
        else
            System.out.println("Tarefa já existe no conjunto!");
    }

    public void removerTarefa(String descricao) {
        if(tarefaSet.remove(new Tarefa(descricao)))
            System.out.println("Tarefa removida com sucesso!");
        else
            System.out.println("Tarefa não existe no conjunto!");
    }

    public void exibirTarefas() {
        if(tarefaSet.isEmpty())
            System.out.println("Conjunto está vazio!");
        else
            System.out.println(tarefaSet);
    }

    public void contarTarefas() {
        System.out.println("Número de tarefas na lista: " + tarefaSet.size());
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        for(Tarefa t: tarefaSet) {
            if(t.isConcluida())
                tarefasConcluidas.add(t);
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        for(Tarefa t: tarefaSet) {
            if(!t.isConcluida())
                tarefasPendentes.add(t);
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        if(!tarefaSet.isEmpty()) {
            for(Tarefa t: tarefaSet) {
                if(t.getDescricao().equals(descricao) && !t.isConcluida()) {
                    t.setConcluida(true);
                    System.out.println("Tarefa atualizada com sucesso!");
                    break;
                }
            }
        }
        else
            System.out.println("Conjunto vazio!");
    }

    public void marcarTarefaPendente(String descricao) {
        if(!tarefaSet.isEmpty()) {
            for(Tarefa t: tarefaSet) {
                if(t.getDescricao().equals(descricao) && t.isConcluida()) {
                    t.setConcluida(false);
                    System.out.println("Tarefa atualizada com sucesso!");
                    break;
                }
            }
        }
        else
            System.out.println("Conjunto vazio!");
    }

    public void limparListaTarefas() {
        Set<Tarefa> removerTarefas = tarefaSet;
        if(tarefaSet.removeAll(removerTarefas))
            System.out.println("Lista limpa com sucesso!");
        else
            System.out.println("Não foi possível limpar a lista");
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Comprar mantimentos");
        listaTarefas.adicionarTarefa("Estudar Java"); // Teste de duplicação

        // Exibindo tarefas
        listaTarefas.exibirTarefas();
        listaTarefas.contarTarefas();

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Estudar Java");
        listaTarefas.marcarTarefaConcluida("Ler um livro"); // Tarefa inexistente

        // Exibindo tarefas concluídas e pendentes
        System.out.println("Tarefas concluídas: " + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());

        // Marcando uma tarefa como pendente novamente
        listaTarefas.marcarTarefaPendente("Estudar Java");

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Comprar mantimentos");
        listaTarefas.removerTarefa("Fazer café"); // Tarefa inexistente

        // Exibindo após remoção
        listaTarefas.exibirTarefas();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
