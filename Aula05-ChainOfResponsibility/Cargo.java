public abstract class Cargo {
    protected Cargo sucessor;

    public void setSucessor(Cargo sucessor) {
        this.sucessor = sucessor;
    }

    abstract void aprovar(Processo p);
}
