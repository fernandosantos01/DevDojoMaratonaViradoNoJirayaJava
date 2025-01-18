package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite nome: ");
        String nome = in.next();
        System.out.println("Digite sua idade: ");
        int idade = in.nextInt();
        System.out.println("Digite 'M' ou 'F para sexo: ");
        char sexo = in.next().charAt(0);
        System.out.println("--------------DADOS---------------");
        System.out.println("NOME: " + nome + " IDADE: " + idade + " SEXO: " + sexo);


    }
}
