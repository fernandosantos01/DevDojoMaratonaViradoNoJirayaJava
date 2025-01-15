package academy.devdojo.maratonajava.introducao.exerciciosParaReforcarAprendizado;

public class Exercicio06SomaDosElementosDeUmaMatriz {
    public static void main(String[] args) {
//        Crie um programa que tenha uma matriz 3 X 3 (array bidimensional de inteiros).
//        Use um laço para percorrer todos os elementos e calcular a soma de todos os valores.
//        Exemplo de saída esperada:
//        Matriz:
//        1 2 3
//        4 5 6
//        7 8 9
//        Soma total: 45
        int[][] arrayBid = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int soma = 0;
        for (int i = 0; i < arrayBid.length; i++) {
            for (int j = 0; j < arrayBid[i].length; j++) {
                soma += arrayBid[i][j];
            }


        }
        System.out.println("A Soma Total: "+soma);

    }
}
