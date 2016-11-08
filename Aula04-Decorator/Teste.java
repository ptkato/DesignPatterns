public class Teste {
    public static void main(String... args) {
        Cafe c = new Cafe(3);
        Leite l = new Leite(0.5);
        Canela cn = new Canela(0.7);
        cn.setProx(l);
        l.setProx(c);
        System.out.println(cn.getPreco());
        System.out.println(cn.verNomeProduto());
        //System.out.println(new Canela(0.7).setProx(new Leite(0.5).setProx(new Cafe(3))).getPreco());
    }
}
