package academy.devdojo.maratonajava.introducao.exerciciosParaReforcarAprendizado;

public class Exercicio04DobrodosNumeros {
    public static void main(String[] args) {
//        Crie um programa que tenha um array de números inteiros. Use o for-each para imprimir o
//        valor de cada número e seu dobro. Em seguida, use o for de iteração para armazenar os
//        valores dobrados em um novo array e imprima esse array.
//
//        Exemplo de saída esperada:
//        Número: 1, Dobro: 2
//        Número: 3, Dobro: 6
//        Número: 5, Dobro: 10
//        Array com valores dobrados: [2, 6, 10]
        int []numeros = new int[]{1,3,5};
        int []dobro = new int[numeros.length];
        int j = 0;
        for (int num : numeros){
            dobro[j] = num*2;
            System.out.println("Número: "+num+" Dobro: " +dobro[j++]);
        }
        System.out.print("Array com valores dobrados: [");
        for (int i = 0; i < dobro.length; i++) {
            System.out.print(dobro[i]);
            if (i < dobro.length - 1) { // Adiciona vírgula apenas entre os elementos
                System.out.print(", ");
            }
        }
        System.out.println("]");


    }
}
