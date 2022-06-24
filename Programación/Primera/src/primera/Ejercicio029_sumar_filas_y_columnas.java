/*
Acumular las sumas de una tabla por filas en un vector y también por columnas 
en en otro
 */
package primera;

public class Ejercicio029_sumar_filas_y_columnas {
     public static void main(String arg[]){
       int tabla[][]= {{10, 20, -30, -40}, {50, 60, -70, 80}, {90, 100, -110, 120}};
        int v1[] = {0, 0, 0, 0};
        int v2[] = {0, 0, 0};
        for(int i = 0; i < tabla.length; i++)
            for(int j = 0; j < tabla[i].length;j++){
                v2[i] += tabla[i][j];
                v1[j] += tabla[i][j];
            }
        for(int i=0;i<v2.length;i++)
               System.out.print(v2[i]+" ");
              System.out.println();
        for(int i=0;i<v1.length;i++)
               System.out.print(v1[i]+" ");
    }
}

