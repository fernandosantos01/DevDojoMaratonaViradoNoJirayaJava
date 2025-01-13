package academy.devdojo.maratonajava.introducao;

public class Aula04OperadoresAritmeticos {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        double resul = num1 / (double)num2;
        System.out.println(resul);

        //resto
        double resto = num1 % num2;
        System.out.println(resto);

        //sinais
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);

        //Logicos
    }
}
