package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio;

public class Pessoas {
    private String nome;
    private int idade;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Numero invalido!!!");
            return;
        }
        this.idade = idade;
    }
}
