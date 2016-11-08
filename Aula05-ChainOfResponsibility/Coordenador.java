public class Coordenador extends Cargo {
    public void aprovar(Processo p) {
        if (p.getPreco() < 25000)
            System.out.println(p.getNome() + " aprovado pelo Coordenador");
        else
            sucessor.aprovar(p);
    }
}
