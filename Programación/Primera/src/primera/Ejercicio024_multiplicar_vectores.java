/*
Multiplicar datos por los numeros del vector
 */
package primera;

public class Ejercicio024_multiplicar_vectores {
    public static void main(String arg[]){
        int datos[] = {10, 20, 30, 40, 50, 60};
        int multiplos[] ={3, 5, 7};
        for(int i = 0; i < multiplos.length;i++){
          for(int j = 0; j < datos.length;j++)
        System.out.print(datos[j] * multiplos[i] + " ");
         System.out.println();
    }
    }
}
