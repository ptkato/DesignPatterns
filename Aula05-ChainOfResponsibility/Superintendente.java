public class Superintendente extends Cargo {
    public void aprovar(Processo p) {
        if (p.getPreco() < 200000)
            System.out.println(p.getNome() + " aprovado pelo Superintendente");
        else
            sucessor.aprovar(p);
    }
}
