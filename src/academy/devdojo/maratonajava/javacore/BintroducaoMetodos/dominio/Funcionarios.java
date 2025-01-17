package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio;

public class Funcionarios {
    private String nome;
    private int idade;
    private double[] salarios;
    private double medSalarios;

    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salarios == null) {
            System.out.println("Nenhum valor inserido em salarios");
            return;
        }
        System.out.println("Os salarios recebidos:");
        for (double salario : salarios) {
            System.out.println("R$ " + salario);
        }
        System.out.println("-----------------------------------");
        imprimirSalarios();
    }

    public void imprimirSalarios() {
        if (salarios == null) {
            return;
        }
        for (double sal : salarios) {
            medSalarios += sal;
        }
        medSalarios /= salarios.length;
        System.out.printf("A media salarial: R$: %.2f", medSalarios);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios(double[] doubles) {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedSalarios() {
        return medSalarios;
    }

}
