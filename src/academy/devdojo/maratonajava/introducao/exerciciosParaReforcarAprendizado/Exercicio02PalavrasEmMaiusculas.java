package academy.devdojo.maratonajava.introducao.exerciciosParaReforcarAprendizado;

public class Exercicio02PalavrasEmMaiusculas {
    public static void main(String[] args) {
//        Crie um programa que tenha um array de strings (ex.: nomes de pessoas).
//        Use um for-each para imprimir todas as palavras em maiúsculas e um for de iteração para
//        contar quantas palavras têm mais de 5 caracteres.
//        Nome em maiúsculas: ANA
//        Nome em maiúsculas: JOÃO
//        Nome em maiúsculas: FERNANDA
//        Número de nomes com mais de 5 caracteres: 1
        String []nomePessoas = new String[]{"Ana","João","Fernanda"};
        int numNomesCom5 = 0;
        for(String nome: nomePessoas){
            System.out.println("Nome em maiúsculas: " +nome.toUpperCase());
        }
        for (int i = 0; i < nomePessoas.length; i++) {
            if (nomePessoas[i].length() >= 5) {
                numNomesCom5 +=1;
            }

        }
        System.out.println("Número de nomes com mais de 5 caracteres: " +numNomesCom5);
    }
}
