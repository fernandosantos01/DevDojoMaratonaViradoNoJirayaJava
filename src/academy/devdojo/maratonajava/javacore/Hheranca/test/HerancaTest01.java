package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Antonio Gomes");
        endereco.setCep("64410-000");
        Pessoa pessoa = new Pessoa("José Fernando");
        pessoa.setCpf("054895362-92");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("André");

        funcionario.setCpf("254869956-25");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(8000);

        System.out.println("---------------------------------");
        funcionario.imprime();
        System.out.println("\n-------------------------------");

    }
}
