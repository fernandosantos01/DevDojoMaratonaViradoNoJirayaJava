package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.idade = 15;
        estudante.nome = "Maria";
        estudante.sexo = "M";

        System.out.println(estudante.idade);
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
    }
}
