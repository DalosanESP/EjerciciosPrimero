
package Ejercicio04_Bombo;

public class Resultado {
    public static void main(String arg[]){
        Bombo bombo = new Bombo();
        int resultado[][] = new int [6][8];
        for(int i = 0; i < resultado.length; i ++)
            for(int j = 0; j < resultado[i].length; j++)
                resultado[i][j] = bombo.sacarBolas();
         for(int i = 0; i < resultado.length; i ++){
                System.out.println();
            for(int j = 0; j < resultado[i].length; j++)
                System.out.printf(" %d ", resultado[i][j]);
        }
    }
}
