package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professores;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminarios;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local01 = new Local("Rosa Dos Ventos");
        Local local02 = new Local("RU1");
        Local local03 = new Local("RU3");
        Aluno aluno01 = new Aluno("José", 18);
        Aluno aluno02 = new Aluno("Eduarda", 18);
        Aluno aluno03 = new Aluno("Pedro", 32);
        Professores professores01 = new Professores("R.Moura", "Estrutura De Dados");
        Professores professores02 = new Professores("Zoraida", "Demonologia");
        Seminarios seminarios01 = new Seminarios("A volta dos que não foram", local02);
        Seminarios seminarios02 = new Seminarios("A Ida dos que não foram", local01);
        Seminarios seminarios03 = new Seminarios("Desbinarize minha corpa", local03);


        Aluno[] alunosParaSeminario = {aluno01, aluno02, aluno03};
        Aluno[] alunosParaSeminario01 = {aluno02, aluno03};
        Seminarios[] seminariosDisponiveis02 = {seminarios01, seminarios02};
        Seminarios[] seminariosDisponiveis01 = {seminarios01, seminarios02, seminarios03};
        Professores[] professores = {professores01, professores02};
        Professores[]professores00 = {professores01};

        aluno01.setSeminarios(seminarios01);
        professores01.setSeminarios(seminariosDisponiveis01);
        seminarios01.setAluno(alunosParaSeminario);
        seminarios01.setProfessores(professores);

        aluno02.setSeminarios(seminarios02);
        professores02.setSeminarios(seminariosDisponiveis02);
        seminarios02.setAluno(alunosParaSeminario01);
        seminarios02.setProfessores(professores00);


        aluno01.imprime();
        System.out.println("----------------------");
        professores01.imprime();
        System.out.println("----------------------");
        seminarios01.imprime();
        System.out.println("----------------------");



        aluno02.imprime();
        System.out.println("--------------------------------");
        professores02.imprime();
        System.out.println("--------------------------------");
        seminarios02.imprime();
        System.out.println("-------------------------------");



    }
}
