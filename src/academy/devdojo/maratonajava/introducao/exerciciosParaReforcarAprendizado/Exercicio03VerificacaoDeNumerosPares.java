package academy.devdojo.maratonajava.introducao.exerciciosParaReforcarAprendizado;

public class Exercicio03VerificacaoDeNumerosPares {
//    Crie um programa que tenha um array de números inteiros. Use um for-each para verificar e
//    imprimir apenas os números pares e um for de iteração para contar quantos números
//    ímpares existem no array.

    //    Exemplo de saída esperada:
//    Números pares: 2, 4, 6
//    Quantidade de números ímpares: 3
    public static void main(String[] args) {
        int[] numeros = new int[]{2,4, 6, 3, 5 , 11};
        int quantImpares = 0;
        for (int num: numeros){
            if (num%2==0){
                System.out.println("Números pares: "+ num);
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]%2==0){
                quantImpares ++;
            }

        }
        System.out.println("Quantidade de números ímpares: "+quantImpares);
    }
}
