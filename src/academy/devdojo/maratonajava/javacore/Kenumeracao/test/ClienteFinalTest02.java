package academy.devdojo.maratonajava.javacore.Kenumeracao.test;

import academy.devdojo.maratonajava.javacore.Kenumeracao.dominio.ClienteFinal;
import academy.devdojo.maratonajava.javacore.Kenumeracao.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenumeracao.dominio.TipoPagamento;

public class ClienteFinalTest02 {
    public static void main(String[] args) {
        ClienteFinal clienteFinal01 = new ClienteFinal("Maria Eduarda", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        ClienteFinal clienteFinal02 = new ClienteFinal("José Fernando", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(clienteFinal01);
        System.out.println(clienteFinal02);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
    }
}
