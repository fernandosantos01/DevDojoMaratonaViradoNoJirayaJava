package academy.devdojo.maratonajava.introducao.exerciciosParaReforcarAprendizado;

public class Exercicio05ContagemDeLetrasEmStrings {
    public static void main(String[] args) {
////        Crie um programa que tenha um array de strings (ex.: palavras ou frases).
////        Use um for-each para imprimir cada palavra com sua quantidade de letras.Depois, use um
////        for de iteração para contar o total de letras de todas as palavras combinadas.
//          Exemplo de saída esperada:
//          Palavra: Java, Letras: 4
//          Palavra: Programação, Letras: 11
//          Palavra: Fácil, Letras: 5
//          Total de letras: 20
        String[] frases = new String[]{"Java", "Programação", "Facil",};
        int j = 0;
        int totalLetras = 0;

        for (String palavra : frases) {
            int quantLetras = palavra.length();
            System.out.println("Palavra: " + palavra + "," + " Letras: " + quantLetras);
        }
        for (int i = 0; i < frases.length; i++) {
            totalLetras += frases[i].length();
            j++;
            if (j == frases.length) {
                System.out.println("Total de letras: "+totalLetras);
            }
        }

    }
}
