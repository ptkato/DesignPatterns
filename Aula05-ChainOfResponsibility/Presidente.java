public class Presidente extends Cargo {
    public void aprovar(Processo p) {
        System.out.println(p.getNome() + " aprovado pelo Presidente");
    }
}
