package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        int numero = 0;
        while(numero <= 10) {
            System.out.println("numero = " + numero++);

        }
        do {
            System.out.println("numero = " + numero);
            numero++;
        }while (numero <= 10);
    }
}
