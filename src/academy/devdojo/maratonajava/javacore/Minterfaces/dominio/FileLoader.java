package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemove{
    @Override
    public void load() {
        System.out.println("Carregando Dados de um Arquivo!!");
    }

    @Override
    public void remove() {
        System.out.println("Removendo Dado de um Arquivo!!");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando Permissões no Arquivo!!");
    }
}
