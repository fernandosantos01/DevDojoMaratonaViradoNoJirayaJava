package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        String[] nomes = new String[4];
        nomes[0] = "Maria";
        nomes[1] = "Joao";
        nomes[2] = "Pedro";
        nomes[3] = "Marinalva";

        for (int i = 0; i< nomes.length; i++){
            System.out.println("Nome: " + nomes[i]+"\n");
        }

    }
}
