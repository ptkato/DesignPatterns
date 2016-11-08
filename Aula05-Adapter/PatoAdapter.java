public class PatoAdapter implements Pato {
    private Peru p;
    
    public PatoAdapter(Peru p) {
        this.p = p;
    }

    public void grasnar() {
        p.wooble();
    }
    public void voar() {
        p.baterAsas();
    }
}
