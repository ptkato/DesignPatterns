public class Cliente {
    private String nome;
    private TipoCartao tp;
    private double anuidade;

    public Cliente(String nome, TipoCartao tp, double anuidade) {
        this.nome = nome;
        this.tp = tp;
        this.anuidade = this.tp.descontoAnuidade(anuidade);
    }

    public String mostrarDados() {
        return this.nome + "\n" +
               this.anuidade;
    }
}
