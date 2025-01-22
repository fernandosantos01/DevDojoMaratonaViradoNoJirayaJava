package academy.devdojo.maratonajava.javacore.Kenumeracao.test;

import academy.devdojo.maratonajava.javacore.Kenumeracao.dominio.Cliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Maria Eduarda","PESSOA_FISICA");
        Cliente cliente02 = new Cliente("Toin","PESSOA_JURIDICA");
        Cliente cliente03 = new Cliente("Frances","PESSOA_fISICA");
        Cliente cliente04 = new Cliente("Murila","PESSOA_jUrIdica");

        System.out.println(cliente01);
        System.out.println(cliente02);
        System.out.println(cliente03);
        System.out.println(cliente04);
    }
}
