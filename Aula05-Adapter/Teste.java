public class Teste {
    public static void main(String... args) {
        Pato p1 = new PatoBranco();
        Pato p2 = new PatoVerde();
        p1.grasnar();
        p1.voar();
        p2.grasnar();
        p2.voar();
        Pato p3 = new PatoAdapter(new Peru());
        p3.grasnar();
        p3.voar();
    }
}
