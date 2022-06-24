/*
Tenemos una tabla de enteros y un entero llamado multiplicador. Queremos modificar el contenido
de todos los elementos de la tabla al muliplicando cada uno de ellos por el multiplicador. Para eso
vamos a crear una funcion que lo haga
 */
package primera;

public class Ejercicio053_funcion_multiplicar_vector_por_1numero {
    public static void main(String arg[]){
        int tabla [][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int multiplicador = 4;
        modificar(tabla, multiplicador);
        for(int i=0;i<tabla.length;i++)
        for(int j=0;j<tabla[i].length;j++)
         System.out.printf(" %d ",tabla[i][j]);
       System.out.println();
     
    }
public static void modificar(int t[][], int mul){
    for(int i=0;i<t.length;i++)
        for(int j=0;j<t[i].length;j++)
            t[i][j]*= mul;
    }
}

