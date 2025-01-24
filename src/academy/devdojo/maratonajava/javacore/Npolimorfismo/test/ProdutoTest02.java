package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraDeImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        //Sempre do mais generico para o mais especifico Produto -> Computador ou Produto -> Tomate
        Produto produto =  new Computador("Razer xt5000", 25000);
        Produto produto1 = new Tomate("Africano", 5239, "18/10/2025");
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calculaTaxacao());
        System.out.println("---------------------");
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println("---------------------");
        CalculadoraDeImposto.calculadoraDeImposto(produto1);
    }
}
