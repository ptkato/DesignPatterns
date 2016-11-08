public abstract class Produto {
    protected double preco;
    private String nome;
    PromoStrategy ps;

    public Produto(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public String getNome() {
        return this.nome;
    }

    public PromoStrategy setPs(PromoStrategy ps) {
        return this.ps = ps;
    }

    public double doPromo() {
        return ps.calcPromo() * this.preco;
    }
}
