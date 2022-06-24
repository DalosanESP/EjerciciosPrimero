//invertir el contenido de los elemetos del vector
//variable inter quiere decir intercambio
package primera;


public class Ejercicio017_invertir_vectores {
    public static void main(String arg[]){
         int datos[] = {10, 20, 30, 40, 50, 60};
         int inter;
         for(int i=0; i < (datos.length/2); i++){
             inter = datos[i];
             datos[i] = datos[datos.length-1-i];
             datos[datos.length-1-i] = inter;
         }
         for(int i=0; i < (datos.length); i++)
             System.out.printf("%d - ", datos[i]);
         }
 }
