package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais06Exercicio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma data da semana(Numero): ");
        int data = in.nextInt();

        switch (data) {
            case 1:
                System.out.println("Domingo, Final de Semana\n");
                break;
            case 2:
                System.out.println("Segunda feira, dia util\n");
                break;
            case 3:
                System.out.println("Terça feira, dia util\n");
                break;
            case 4:
                System.out.println("Quarta feira, dia util\n");
                break;
            case 5:
                System.out.println("Quinta feira, dia util\n");
                break;
            case 6:
                System.out.println("Sexta feira, dia util\n");
                break;
            case 7:
                System.out.println("Sabado,  Final de semana\n");
                break;
            default:
                System.out.println("Valor invalido");
                break;
        }

    }
}
