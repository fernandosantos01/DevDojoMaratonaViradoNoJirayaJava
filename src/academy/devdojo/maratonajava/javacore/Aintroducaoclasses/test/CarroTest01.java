package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carros;

public class CarroTest01 {
    public static void main(String[] args) {
        Carros carro1 = new Carros();
        Carros carro2 = new Carros();

        carro1.nome = "Chevrolet";
        carro1.modelo = "Onix";
        carro1.ano = 2022;

        carro2.nome = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2016;

        System.out.println("Nome: " +carro2.nome+" \nModelo: "+carro2.modelo+" \nAno: "+carro2.ano);
        carro1 = carro2;
        System.out.println("--------------------------------------------");
        
        System.out.println("Nome: "+carro1.nome+" \nModelo: "+carro1.modelo+" \nAno: "+carro1.ano);

    }
}
