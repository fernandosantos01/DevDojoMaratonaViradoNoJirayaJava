package academy.devdojo.maratonajava.javacore.Isobreescrita.dominio;

public class Anime extends Object{
    private String nome;

    public Anime(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString(){
        return "Anime: "+this.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
