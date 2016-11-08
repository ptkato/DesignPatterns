public class Teste {
    public static void main(String... args) {
        BancoFacade bf = new BancoFacade(new Investimento(), new ContaCorrente(), new Emprestimo());
        bf.pedirEmprestimo();
        bf.investir();
    }
}
