public class Leite extends CafeDecorator {
    public Leite(double preco) {
        super(preco);
    }

    public String verNomeProduto() {
        return prox.verNomeProduto() + "com leite ";
    }
}
