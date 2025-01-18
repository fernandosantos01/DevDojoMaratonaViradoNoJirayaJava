package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

import com.sun.security.jgss.GSSUtil;

public class Escola {
    private String nome;
    private Professores[] professores;

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professores[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprime() {
        System.out.println(this.nome);
        if (professores == null) {
            return;
        }
        for (Professores professor : this.professores) {
            System.out.println(professor.getNome());
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professores[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professores[] professores) {
        this.professores = professores;
    }
}
