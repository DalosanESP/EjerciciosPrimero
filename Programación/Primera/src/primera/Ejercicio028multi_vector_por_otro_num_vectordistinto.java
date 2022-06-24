/*
Tenemos una tabla de 3*4 y cada elemento de la primera fila lo multiplicaremos 
por un numero, cada elemento de la segunda lo multiplicaremos por otro y lo mismo
con los elementos en la tercera fila
 */
package primera;

public class Ejercicio028multi_vector_por_otro_num_vectordistinto {
    public static void main(String arg[]){
        int tabla[][]= {{10, 20, -30, -40}, {50, 60, -70, 80}, {90, 100, -110, 120}};
        int v1[] = {2, 4, 6};
        for(int i = 0; i < tabla.length;i++){
          for(int j = 0; j < tabla[i].length;j++)
              System.out.printf("%d, ", tabla[i][j]*v1[i]);
              System.out.println();
    }
  
    
}
}
