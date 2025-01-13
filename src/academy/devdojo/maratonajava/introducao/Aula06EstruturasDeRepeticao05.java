package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double valorDoCarro = 30000;
        for (int parcela = (int) valorDoCarro; parcela >= 1; parcela--) {
            double valorDaParcela = valorDoCarro / parcela;
            if (valorDaParcela < 1000) {
                continue;
            }
            System.out.printf("%d x de %.2f\n", parcela, valorDaParcela);
        }
    }
}
