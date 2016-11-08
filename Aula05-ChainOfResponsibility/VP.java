public class VP extends Cargo {
    public void aprovar(Processo p) {
        if (p.getPreco() < 1000000)
            System.out.println(p.getNome() + " aprovado pelo VP");
        else
            sucessor.aprovar(p);
    }
}
