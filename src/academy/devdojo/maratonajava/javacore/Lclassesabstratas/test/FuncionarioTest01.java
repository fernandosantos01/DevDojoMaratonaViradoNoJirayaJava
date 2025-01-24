package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("José Fernando", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Maria Eduarda", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
    }
}
