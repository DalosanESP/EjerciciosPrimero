/*
Eliminar los espacios en lanco de un string sin usar replace
 */
package primera;

public class Ejercicio082_quitar_espacios_sin_replace {
   public static void main(String arg[]){
       String frase = "Habia una vez, un circo, que alegraba siempre el corazon";
       
       int posicion = frase.indexOf(" ");
       while(posicion != -1){
          frase = frase.substring(0, posicion).concat(frase.substring(posicion+1));
           posicion = frase.indexOf(" ");
       }
       System.out.println(frase);
   }
}
