package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogadores;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Times;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogadores jogador01 = new Jogadores("Pelé");
        Times time01 = new Times("Seleção Brasileira");
        jogador01.setTime(time01);
        jogador01.imprime();
    }
}
