public abstract class CafeDecorator extends Produto {
    protected Produto prox;
    public CafeDecorator(double preco) {
        super(preco);
    }
    public void setProx(Produto prox) {
        this.prox = prox;
    }
    public double getPreco() {
        return prox.getPreco() + super.getPreco();
    }
}
