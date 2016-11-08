public abstract class Produto {
    private double preco;
    public Produto(double preco) {
        this.preco = preco;
    }
    public double getPreco() {
        return preco;
    }
    abstract String verNomeProduto();
}
