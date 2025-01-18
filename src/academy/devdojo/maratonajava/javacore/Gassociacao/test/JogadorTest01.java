package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogadores;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogadores jogador1 = new Jogadores("Pelé");
        Jogadores jogador2 = new Jogadores("Zico");
        Jogadores jogador3 = new Jogadores("Vini Jr");

        Jogadores[] jogadores = new Jogadores[]{jogador1, jogador2, jogador3};
        for (Jogadores jogador : jogadores) {
            jogador.imprime();

        }
    }
}
