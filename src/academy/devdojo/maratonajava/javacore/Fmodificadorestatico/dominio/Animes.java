package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Animes {
    private String nome;
    private static int[] episodios;

    static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;

        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização 2");
    }

    static {
        System.out.println("Dentro do bloco de inicialização 3");
    }

    {
        System.out.println("Dentro do bloco de inicialização 4");
    }

    public Animes() {
        for (int episodio : Animes.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        Animes.episodios = episodios;
    }
}
