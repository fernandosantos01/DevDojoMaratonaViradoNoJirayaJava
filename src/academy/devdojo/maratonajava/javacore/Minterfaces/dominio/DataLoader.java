package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    int MAX_DATA_SIZE = 10;
    void load();
    default void checkPermission(){
        System.out.println("Fazendo Checkagem de Permissões");
    }


    static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize!");
    }

}
