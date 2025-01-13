package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a idade:\n");
        int idade = sc.nextInt();
        if (idade < 15){
            System.out.println("Categoria Infantil!!");
        }else if (idade >= 15 && idade <18){
            System.out.println("Categoria juvenil!!");
        }else{
            System.out.println("Categoria Adulto!!");
        }
    }
}
