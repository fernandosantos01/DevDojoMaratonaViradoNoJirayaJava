package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professores;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professores professores01 = new Professores("Jiraya Sensei");
        Professores professores02 = new Professores("Kakashi Sensei");
        Professores[] professores = {professores01, professores02};
        Escola escola = new Escola("Konoha",professores);

        escola.imprime();

    }
}
