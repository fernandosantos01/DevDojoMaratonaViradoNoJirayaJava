package academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um Banco De Dados!");
    }
}
