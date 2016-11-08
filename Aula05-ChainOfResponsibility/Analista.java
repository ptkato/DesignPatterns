public class Analista extends Cargo {
    public void aprovar(Processo p) {
        if (p.getPreco() < 10000)
            System.out.println(p.getNome() + " aprovado pelo Analista");
        else
           sucessor.aprovar(p);
    }
}
