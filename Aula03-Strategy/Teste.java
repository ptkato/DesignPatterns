public class Teste {
    public static void main(String... args) {
        Livro l1 = new Livro(100, "O JAVA É DA HORA");
        Livro l2 = new Livro(150, "USE A CABECA");
        PromoStrategy ps1 = () -> {
            return 0.85;
        };
        PromoStrategy ps2 = () -> {
            return 0.9;
        };
        l1.setPs(new Pct15());
        l2.setPs(new Pct10());
        System.out.println(l1.doPromo());
        System.out.println(l2.doPromo());
        l1.setPs(ps1);
        l2.setPs(ps2);
        System.out.println(l1.doPromo());
        System.out.println(l2.doPromo());
    }
}
