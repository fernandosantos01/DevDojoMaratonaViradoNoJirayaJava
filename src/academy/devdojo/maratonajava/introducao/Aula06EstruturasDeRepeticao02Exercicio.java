package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02Exercicio {
    public static void main(String[] args) {
        //imprimir todos os numeros pares de 0 a 100000
        for (int i = 1; i <= 1000000000; i++) {
            if (i % 2 == 0) {
                System.out.println("Numeros pares"+i);
            }
        }
    }
}
