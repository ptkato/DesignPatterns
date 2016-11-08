public class Teste {
    public static void main(String... args) {
        new Gato().emitirSom();
        new Cachorro().emitirSom();

        Animal c = new Cachorro();
        c.emitirSom();

        Animal g = new Gato();
        Gato h = (Gato) g;
        h.arranhar();

        Zoo z = new Zoo();
        z.checar(c);
        z.checar(g);
        z.checar(h);

        Reino r = new Gato();
        r.locomocao();
    }
}
