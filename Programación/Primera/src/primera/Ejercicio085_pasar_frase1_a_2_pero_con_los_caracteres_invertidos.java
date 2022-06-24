/*
sobre frase 2 el contenido de frase1, pero con los caracteres invertidos
 */
package primera;

public class Ejercicio085_pasar_frase1_a_2_pero_con_los_caracteres_invertidos {
    public static void main(String arg[]){
       String frase1 = "Habia una vez, un circo, que alegraba siempre el corazon";
       String frase2 = "";
       
       for(int i=(frase1.length() - 1); i>=0; i--)
            frase2 = frase2.concat(Character.toString(frase1.charAt(i)));
        
        System.out.println(frase2);
    }
}

