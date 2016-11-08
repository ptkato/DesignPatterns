public enum TipoCartao {
    SILVER(0.90), GOLD(0.85), PLATINUM(0.80), BLACK(0.0);

    private double desconto;

    TipoCartao(double desconto) {
        this.desconto = desconto;
    }

    public double descontoAnuidade(double vl) {
        return vl * this.desconto;
    }
}
