package academy.devdojo.maratonajava.javacore.CsobrecargaMetodos.test;

import academy.devdojo.maratonajava.javacore.CsobrecargaMetodos.dominio.Animes;

public class AnimeTest01 {
    public static void main(String[] args) {
        Animes anime = new Animes();
        anime.init("Demon Slayer", "TV", 12,"Ação");

        anime.imprime();
    }

}
