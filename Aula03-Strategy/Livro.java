public class Livro extends Produto {
    public Livro(double preco, String nome) {
        super(preco, nome);
    }

    public double calcPromo() {
        return 0.9 * super.getPreco();
    }
}
