package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Professores {
    private String nome;
    private String especialidade;
    private Seminarios[] seminarios;

    public Professores(String nome) {
        this();
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professores(String nome, String especialidade) {
        this(nome);
        this.especialidade = especialidade;

    }

    public Professores() {
    }
    public void imprime(){
            System.out.println("Nome Professor: "+nome+" Sua Especialidade: "+especialidade);
    }

    public Seminarios[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminarios[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
