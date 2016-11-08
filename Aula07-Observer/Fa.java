public class Fa extends Observer {
    public void update(Subject s) {
        System.out.println(this.toString() + " -> " + s.getFofoca());
    }
}
