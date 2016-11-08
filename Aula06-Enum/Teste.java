public class Teste {
    public static void main(String... args) {
        DiaSemana d = DiaSemana.SEGUNDA;
        System.out.println(d);
        d.ola();
        System.out.println(d.getEnglish());
        //--
        Animal a = Animal.PORCO;
        System.out.println(a);
        a.emitirSom();
        //--
        Cliente c = new Cliente("João", TipoCartao.PLATINUM, 100.0);
        System.out.println(c.mostrarDados());
    }
}
