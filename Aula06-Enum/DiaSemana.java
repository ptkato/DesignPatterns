public enum DiaSemana {
    SEGUNDA(11, "Monday"), TERCA(12, "Tuesday"), QUARTA(13, "Wednesday"), QUINTA(14, "Thursday"), SEXTA(15, "Friday"), SABADO(16, "Saturday"), DOMINGO(17, "Sunday");

    private int numero;
    private String english;

    DiaSemana(int numero, String english) {
        this.numero = numero;
        this.english = english;
    }

    public void ola() {
        System.out.println("OLA " + this.name());
    }

    public int getNumero() {
        return this.numero;
    }

    public String getEnglish() {
        return this.english;
    }
}
