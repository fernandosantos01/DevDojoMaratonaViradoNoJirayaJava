package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Calculadora;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraDeImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("IDEAPAD S145", 3500);
        Tomate tomate = new Tomate("Tomates Strawberry", 8000, "24/12/2025");
        Televisao televisao = new Televisao("SAMSUNG DU 8000", 15000);

        CalculadoraDeImposto.calculadoraDeImposto(computador);
        System.out.println("--------------------------------------");
        CalculadoraDeImposto.calculadoraDeImposto(tomate);
        System.out.println("--------------------------------------");
        CalculadoraDeImposto.calculadoraDeImposto(televisao);

//        CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();
//        calculadoraDeImposto.calculadoraDeImpostoComputador(computador);
//        calculadoraDeImposto.calculadoraDeImpostoTomate(tomate);
    }
}
