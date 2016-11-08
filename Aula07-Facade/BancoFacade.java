public class BancoFacade {
    private Investimento invest;
    private ContaCorrente cc;
    private Emprestimo e;

    public BancoFacade(Investimento invest, ContaCorrente cc, Emprestimo e) {
        this.invest = invest;
        this.cc = cc;
        this.e = e;
    }

    public void pedirEmprestimo() {
        cc.checarSaldo();
        e.verificarRenda();
        e.emprestar();
        cc.atualizarSaldo();
    }

    public void investir() {
        cc.checarSaldo();
        cc.verificarLimite();
        invest.receber();
        invest.incidirJuros();
    }
}
