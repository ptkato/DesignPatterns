public class Filme extends Produto {
    public Filme(double preco, String nome) {
        super(preco, nome);
    }

    public double calcPromo() {
        return 0.85 * super.getPreco();
    }
}
