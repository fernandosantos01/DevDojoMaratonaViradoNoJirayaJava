package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professores;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminarios;

public class SeminarioTest01 {
    public static void main(String[] args) {
        Local local01 = new Local("Rosa Dos Ventos");
        Local local02 = new Local("RU1");
        Aluno aluno01 = new Aluno("José", 18);
        Aluno aluno02 = new Aluno("Eduarda", 18);
        Aluno aluno03 = new Aluno("Pedro", 32);
        Professores professores01 = new Professores("R.Moura", "Estrutura De Dados");
        Professores professores02 = new Professores("Zoraida", "Demonologia");
        Seminarios seminarios01 = new Seminarios("A volta dos que não foram");
        Seminarios seminarios02 = new Seminarios("A Ida dos que não foram");
        Seminarios seminarios03 = new Seminarios("Desbinarize minha corpa");

        Aluno[] alunos = {aluno01, aluno02, aluno03};
        Seminarios [] seminarios = {seminarios01, seminarios02, seminarios03};

        aluno01.setSeminarios(seminarios01);
        professores01.setSeminarios(seminarios);
        seminarios01.setAluno(alunos);
        seminarios01.setLocal(local01);
        seminarios01.setProfessores(professores01);

        aluno01.imprime();
        System.out.println("----------------------");
        aluno02.imprime();
        System.out.println("----------------------");
        seminarios01.imprime();
        System.out.println("----------------------");


    }
}
