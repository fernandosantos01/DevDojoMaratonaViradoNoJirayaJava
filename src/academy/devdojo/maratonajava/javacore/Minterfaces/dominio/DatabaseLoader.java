package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemove {


    @Override
    public void load() {
        System.out.println("Carregando dados  no banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo no banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando Permissões no Banco de Dados!!");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize na classe DataBaseLoader!");
    }
}
