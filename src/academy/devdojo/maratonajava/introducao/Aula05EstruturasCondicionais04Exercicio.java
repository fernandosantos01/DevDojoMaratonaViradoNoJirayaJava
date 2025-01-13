package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais04Exercicio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor do seu salario:\n");
        double salario = in.nextDouble();
        double taxa = 0.0;
        double valorTaxa = 0.0;
        if (salario <= 34712) {
            taxa = 0.097;
            valorTaxa = salario * taxa;
            salario -= valorTaxa;
        } else if (salario > 34712 && salario <= 68507) {
            taxa = 0.3735;
            valorTaxa = salario * taxa;
            salario -= valorTaxa;
        } else {
            taxa = 0.4950;
            valorTaxa = salario * taxa;
            salario -= valorTaxa;
        }
        System.out.printf("Valor do seu salário após pagar a taxa de: %.1f%% e descontar o valor de: %.2f%% deixando o valor do seu salario em: %.1f%n", (taxa * 100), valorTaxa, salario);

    }
}
