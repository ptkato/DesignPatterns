public interface Animal extends Reino {
    void emitirSom();
    default void dormir() {
        System.out.println("Zzzzz...");
    }
}
