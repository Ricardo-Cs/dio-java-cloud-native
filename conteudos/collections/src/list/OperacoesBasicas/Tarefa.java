package list.OperacoesBasicas;

public class Tarefa {
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    // Reescreve o metodo ToString para retornar os valores de descrição, e nao a memoria
    @Override
    public String toString() {
        return descricao;
    }
}
