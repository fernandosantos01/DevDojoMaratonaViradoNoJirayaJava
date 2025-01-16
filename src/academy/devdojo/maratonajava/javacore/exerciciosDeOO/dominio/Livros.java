package academy.devdojo.maratonajava.javacore.exerciciosDeOO.dominio;

public class Livros {
    public String titulo;
    public String autor;
    public int anoDePublicacao;
    public String genero;

    public Livros(String titulo, String autor, int anoDePublicacao, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.genero = genero;
    }
    public void exibirDetalhes(){
        System.out.println("Titulo: "+titulo+"\nAutor: "+autor+"\nAno de Publicação: "+anoDePublicacao+"\nGenero: "+genero+"\n");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
