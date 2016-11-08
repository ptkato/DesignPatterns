public class Canela extends CafeDecorator {
    public Canela(double preco) {
        super(preco);
    }

    public String verNomeProduto() {
        return prox.verNomeProduto() + "com canela ";
    }
}
