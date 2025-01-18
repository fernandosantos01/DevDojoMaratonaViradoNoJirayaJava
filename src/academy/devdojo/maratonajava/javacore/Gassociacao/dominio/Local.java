package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Local {
    private String nomeLocal;

    public Local(String local) {
        this.nomeLocal = local;
    }

    public void imprime() {
        if (nomeLocal == null) {
            System.out.println("Local Não Inserido");
        } else {
            System.out.println("Local: " + nomeLocal);
        }
    }

    public String getNomeLocal() {
        return nomeLocal;
    }

    public void setNomeLocal(String nomeLocal) {
        this.nomeLocal = nomeLocal;
    }
}
