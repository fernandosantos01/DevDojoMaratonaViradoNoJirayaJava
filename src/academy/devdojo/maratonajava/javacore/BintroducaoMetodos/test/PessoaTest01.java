package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Pessoas;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoas pessoa = new Pessoas();
        pessoa.setNome("Kleyvison");
        pessoa.setIdade(-1);
//        pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
