package academy.devdojo.maratonajava.introducao.exerciciosParaReforcarAprendizado;

import java.util.Scanner;

public class Exercicio07IdentificarNumerosParesEmUmaMatriz {
    public static void main(String[] args) {
//        Crie uma matriz 4×2 (array bidimensional de inteiros) com valores
//        definidos por você. Percorra a matriz e identifique os números pares,
//        imprimindo sua posição (linha e coluna) e o valor.
//
//                Exemplo de saída esperada:
//        Número par encontrado: 2 (Linha: 0, Coluna: 1)
//        Número par encontrado: 8 (Linha: 1, Coluna: 0)
//        Número par encontrado: 4 (Linha: 3, Coluna: 1)

        Scanner in = new Scanner(System.in);
        int[][] arrayBid = new int[4][2];
        int z = 0;
        String[] mensagens = new String[8];
        for (int i = 0; i < arrayBid.length; i++) {
            for (int j = 0; j < arrayBid[i].length; j++) {
                System.out.println("Digite o valor: ");
                arrayBid[i][j] = in.nextInt();
                if (arrayBid[i][j] % 2 == 0) {
                    mensagens[z] = "Número par encontrado: " + arrayBid[i][j] + " (Linha: " + i + ", Coluna: " + j + ")";
                    z++;
                }

            }
        }
        for (String mensagem : mensagens) {
            if (mensagem != null) {
                System.out.println(mensagem);
            }
        }
        if (z==0){
            System.out.println("Nenhum numero par encontrado!!");
        }

    }


}
