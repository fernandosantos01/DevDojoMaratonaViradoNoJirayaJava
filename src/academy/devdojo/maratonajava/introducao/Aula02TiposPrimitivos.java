package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        int age = (int)2147483648L;
        long numeroGrande = 99999999;
        double salarioDouble = 2000;
        float salarioFloat = 2500.0f;
        byte idadeByte = 10;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char letra = 'A';
        String nome = "Maria";
        System.out.println("A idade é " + age + " anos.");
        System.out.println("Oi, meu nome é " + nome);
    }
}
