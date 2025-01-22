package academy.devdojo.maratonajava.javacore.Kenumeracao.dominio;

public class Cliente {
    private String nome;
    private String tipo;
    public final static String PESSOA_FISICA = "PESSOA_FISICA";
    public final static String PESSOA_JURIDICA = "PESSOA_JURIDICA";

    public Cliente(String nome, String tipo) {
        if (!tipo.equals(PESSOA_FISICA) && !tipo.equals(PESSOA_JURIDICA)) {
            return;
        }
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + this.nome + '\'' +
                ", tipo='" + this.tipo + '\'' +
                '}';
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
