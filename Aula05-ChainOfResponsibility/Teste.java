public class Teste {
    public static void main(String... args) {
        Analista a = new Analista();
        Coordenador c = new Coordenador();
        Gerente g = new Gerente();
        Superintendente s = new Superintendente();
        VP v = new VP();
        Presidente p = new Presidente();
        a.setSucessor(c);
        c.setSucessor(g);
        g.setSucessor(s);
        s.setSucessor(v);
        v.setSucessor(p);
        Processo pc = new Processo("Chain", 150000);
        a.aprovar(pc);
    }
}
