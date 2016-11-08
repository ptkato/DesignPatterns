public class ChocolateEmPo extends CafeDecorator {
    public ChocolateEmPo(double preco) {
        super(preco);
    }

    public String verNomeProduto() {
        return prox.verNomeProduto() + "com chocolate em pó ";
    }
}
