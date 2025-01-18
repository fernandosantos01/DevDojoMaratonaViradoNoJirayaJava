package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogadores;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Times;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogadores jogadores01 = new Jogadores("Pelezin");
        Jogadores jogadores02 = new Jogadores("Davi");
        Times times01 = new Times("Seleção Brasileira");
        Jogadores[] jogadores = {jogadores01, jogadores02};

        jogadores01.setTime(times01);
        jogadores02.setTime(times01);

//        Caso eu quisesse imprimir somente o jogador na posição 1 essa seria a forma 'Jogador[]{jogadores[1]'
//        times01.setJogadores(new Jogadores[]{jogadores[1]});
        times01.setJogadores(jogadores);

        System.out.println("----------------JOGADORES--------------");
        jogadores01.imprime();
        jogadores02.imprime();
        System.out.println("----------------TIMES-----------------");
        times01.imprime();
    }
}
