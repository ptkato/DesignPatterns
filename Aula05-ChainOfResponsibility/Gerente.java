public class Gerente extends Cargo {
    public void aprovar(Processo p) {
        if (p.getPreco() < 50000)
            System.out.println(p.getNome() + " aprovado pelo Gerente");
        else
            sucessor.aprovar(p);
    }
}
