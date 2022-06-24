/*
Tenemos una tabla de 4*4, cargada con enteros y otra tabla de las mismas dimensiones
pero que esta vacia. Debemos copiar el contenido de la primera tabla en la segunda, 
pero cambiando las filas por las columnas.
 */
package primera;

public class Ejercicio038_llenar_tabla_vacia_cambiar_filas_x_columnas {
    public static void main(String arg[]){
        int tabla1[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int tabla2[][] = new int [4][4];
   
        for(int i=0; i < tabla1.length;i++)
            for(int j=0; j < tabla1[i].length; j++)
                tabla2[j][i] = tabla1[i][j];
        
         for(int i=0; i < tabla2.length;i++){
            for(int j=0; j < tabla2[i].length; j++)
                System.out.print(tabla2[i][j] + " ");
                 System.out.println();
    }
    }
}
