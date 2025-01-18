package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 350);
        Carro carro2 = new Carro("BUGGATI", 450);
        Carro carro3 = new Carro("CHEVROLET", 280);
        carro1.imprime();
        carro2.imprime();
        carro3.imprime();

    }
}
