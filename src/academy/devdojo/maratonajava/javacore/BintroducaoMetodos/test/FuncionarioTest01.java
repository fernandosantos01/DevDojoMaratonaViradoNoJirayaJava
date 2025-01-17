package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Funcionarios;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionarios funcionario = new Funcionarios();

        funcionario.setNome("Maria Eduarda");
        funcionario.setIdade(21);
        funcionario.setSalarios(new double[]{1000, 7000, 854.52});


        funcionario.imprimirDados();

    }
}
