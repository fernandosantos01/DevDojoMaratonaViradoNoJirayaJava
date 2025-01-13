package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Vou doar 500 reais para o Fernandão da massa!!!";
        String mensagemNaoDoar = "Não vou doar pq sou liso!!!";
        //Operador Ternário
        String resultadoMensagem = (salario >= 5000) ? mensagemDoar : mensagemNaoDoar;
        boolean possoDoarouN = (salario >= 5000) ? true : false;

        System.out.println(resultadoMensagem);


//        salario -= 3500;

//        if (5000 <= salario){
//            resultadoMensagem = mensagemDoar;
//        }else {
//            resultadoMensagem = mensagemNaoDoar;
//        }
//        System.out.println(resultadoMensagem);
    }
}
