package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Times {
    private String nome;
    private Jogadores[] jogadores;

    public Times(String nome) {
        this.nome = nome;
    }

    public Times(String nome, Jogadores[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprime() {
        System.out.println("Nome do Time: " + this.nome);
        if (jogadores == null) {
            return;
        }
        for (Jogadores jogador : jogadores) {
            System.out.println("Nome Do jogador: " + jogador.getNome());
        }
    }

    public Jogadores[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogadores[] jogadores) {
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
