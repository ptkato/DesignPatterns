public class Processo {
    private String nome;
    private double preco;

    public Processo(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
}
