package academy.devdojo.maratonajava.introducao.exerciciosParaReforcarAprendizado;

import java.util.Scanner;

public class Exercicio01SomaDosNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[]{1, 2, 3, 4, 5};

        int soma = 0;

        for (int i = 0; i < num.length; i++) {
//            System.out.println("Digite o valor: \n");
//            num[i] = sc.nextInt();
            soma += num[i];

        }
        for (int numeros : num) {
            System.out.println("Numero: " + numeros + "\n");

        }
        System.out.println("Soma Total: " + soma);

    }
}
