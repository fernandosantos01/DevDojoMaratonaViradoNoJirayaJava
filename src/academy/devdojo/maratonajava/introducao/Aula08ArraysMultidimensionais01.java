package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int [][] dias = new int[][]{{10, 22, 35},{14, 55, 96},{47, 58, 69}};

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println("dias[" + i +"]["+ j +"] = "+dias[i][j]);
            }
            System.out.println("----------------------------------------------");
            for (int[]arrBase:dias){
                for (int numDia : arrBase){
                    System.out.println(numDia);
                }
            }
        }
    }
}
