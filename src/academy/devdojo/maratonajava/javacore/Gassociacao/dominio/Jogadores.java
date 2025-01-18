package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Jogadores {
    private String nome;
    private Times time;

    public Jogadores(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("Nome: "+this.nome);
        if (time != null){
            System.out.println("Time: "+time.getNome());
        }else {
            System.out.println("Sem time");
        }

    }

    public Times getTime() {
        return time;
    }

    public void setTime(Times time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
