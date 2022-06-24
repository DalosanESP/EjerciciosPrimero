/*
Añadir una a al final de cada palabra, sin replace
 */
package primera;

public class Ejercicio086_añadir_a_alfinal_sinreplce {
    public static void main(String arg[]){
        String frase = "Habia una vez, un circo, que alegraba siempre el corazon ";
       
        //frase = frase.replace(" ", "a");
        //System.out.println(frase);
        
        int posicion = frase.indexOf(" ");
        while(posicion != -1){
            frase = frase.substring(0, posicion).concat("a").concat(frase.substring(posicion));
            posicion = frase.indexOf(" ", posicion + 2);
            
        }
        System.out.println(frase);
    }
}
