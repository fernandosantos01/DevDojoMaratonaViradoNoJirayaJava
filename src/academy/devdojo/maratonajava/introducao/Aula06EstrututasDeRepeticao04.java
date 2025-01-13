package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula06EstrututasDeRepeticao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do carro: ");
        double valorDoCarro = sc.nextDouble();

        for (int parcela = 1; parcela < valorDoCarro; parcela++) {
            double valorDoParcela = valorDoCarro / parcela;
            if (valorDoParcela >= 1000) {
                System.out.println("Parcela " + parcela + " R$ " + valorDoParcela);
            }else {
                break;
            }
        }
    }
}
