public class Ator extends Subject {
    private String fofoca;

    public String getFofoca() {
        return fofoca;
    }

    public void setFofoca(String fofoca) {
        this.fofoca = fofoca;
        super.notificar();
    }
}
