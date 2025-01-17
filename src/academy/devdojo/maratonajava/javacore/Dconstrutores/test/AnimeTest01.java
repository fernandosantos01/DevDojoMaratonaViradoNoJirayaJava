package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Animes;

public class AnimeTest01 {
    public static void main(String[] args) {
        Animes anime = new Animes("Atack On Titan", "Streaming", 212, "Ficção", "Production IG");

        anime.imprime();
    }

}
