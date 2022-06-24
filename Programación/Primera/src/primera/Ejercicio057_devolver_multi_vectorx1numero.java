/*
Implementar una funcion que modifique el conteido de la tabla de los kilos, multiplicando
por el multiplicador los elementos de los que se hayan vendido menos de 10 kilos
 */
package primera;

public class Ejercicio057_devolver_multi_vectorx1numero {
    public static void main(String arg[]){
        int kilos [][] = {{5,6,9,23,7,14,0},{16,8,4,33,15,21,2}};
        int multiplicador = 5;
        modificar(kilos,multiplicador);
        for(int i=0;i<kilos.length;i++){
            for(int j=0; j<kilos[i].length;j++)
                System.out.printf("%d ", kilos[i][j]);
            System.out.println();
        }
       
    }
    public static void modificar(int[][]k, int mul){
        for(int i=0;i<k.length;i++)
            for(int j=0; j<k[i].length;j++)
                if(k[i][j]<10)
                        k[i][j] *=mul;
    }
}
