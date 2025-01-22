package academy.devdojo.maratonajava.javacore.Kenumeracao.dominio;

public enum TipoPagamento {
    DEBITO(1, "Debito") {
        @Override
        public double calcularDesconto(double preco) {
            return preco * 0.10;
        }
    },
    CREDITO(2, "Crédito") {
        @Override
        public double calcularDesconto(double preco) {
            return preco * 0.05;
        }
    };
    public final int VALOR;
    private final String nomeRelatorio;

    public abstract double calcularDesconto(double preco);

    TipoPagamento(int VALOR, String nomeRelatorio) {
        this.VALOR = VALOR;
        this.nomeRelatorio = nomeRelatorio;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
