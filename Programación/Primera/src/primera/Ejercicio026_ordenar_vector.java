/*
i para las filas y j para las columnas
 */
package primera;

public class Ejercicio026_ordenar_vector {
    public static void main(String arg[]){
        int tabla[][]= {{10, 20, 30, 40}, {50, 60, 70, 80}, {90, 100, 110, 120}};
        for(int i = 0; i < tabla.length;i++){
          for(int j = 0; j < tabla[i].length;j++)
        System.out.printf("%d  ", tabla[i][j]);
        System.out.println();
      } 
    }
} 
