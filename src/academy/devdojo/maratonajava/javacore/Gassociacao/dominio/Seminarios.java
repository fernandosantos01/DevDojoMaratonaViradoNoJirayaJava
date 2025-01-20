package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Seminarios {
    private String seminario;
    private Aluno[] aluno;
    private Local local;
    private Professores[] professores;

    public Seminarios(String seminario) {
        this.seminario = seminario;
    }

    public Seminarios(String seminario, Local local) {
        this.seminario = seminario;
        this.local = local;
    }

    public Seminarios(String seminario, Local local, Aluno[] aluno, Professores[] professores) {
        this.seminario = seminario;
        this.aluno = aluno;
        this.local = local;
        this.professores = professores;
    }

    public void imprime() {
        if (seminario == null) {
            System.out.println("Nenhum seminário cadastrado!");
        } else {
            System.out.println("Tema Do Seminário: " + seminario);
        }

        if (aluno == null || aluno.length == 0) {
            System.out.println("Nenhum Aluno Cadastrado no Seminário");
        } else {
            for (Aluno aluno : this.aluno) {
                System.out.println("Aluno(a)(s) Cadastrado(a)s: " + aluno.getNome());
            }
        }

        if (professores == null) {
            System.out.println("Não Tem Palestrante");
        } else {
            for (Professores professor : this.professores) {
                System.out.println("Palestrante: " + professor.getNome() + " Especialidade: " + professor.getEspecialidade());
            }

        }

        if (local == null) {
            System.out.println("Local Não Inserido");
        } else {
            local.imprime();
        }
    }

    public Professores[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professores[] professores) {
        this.professores = professores;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public String getSeminario() {
        return seminario;
    }

    public void setSeminario(String seminario) {
        this.seminario = seminario;
    }
}
