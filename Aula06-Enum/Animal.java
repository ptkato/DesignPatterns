public enum Animal {
    CACHORRO {
        public void emitirSom() {
            System.out.println("Au au");
        }
    }, GATO {
        public void emitirSom() {
            System.out.println("Miau");
        }
    }, PORCO {
        public void emitirSom() {
            System.out.println("Oinc");
        }
    };

    public abstract void emitirSom();
}
