/*
Dividir un string en 2
 */
package primera;

public class Ejercicio088_divirdir_string_en2_desordenadamente {
     public static void main(String arg[]){
        String frase = "Habia una vez, un circo, que alegraba siempre el corazon ";
        String fraseA = "";
        String fraseB = "";
        int inicio = 0;
        int fin = frase.indexOf(" ");
        boolean enFA = true;//en Frase A
        
        while (fin != -1){
            if(enFA){
                fraseA = fraseA.concat(frase.substring(inicio, fin + 1));
                enFA = false;
            }else{
                fraseB = fraseB.concat(frase.substring(inicio, fin + 1));
                enFA = true;
            }
            inicio = fin +1;
            fin = frase.indexOf(" ", inicio);
        }
            System.out.println(fraseA);
            System.out.println(fraseB);

     }
        
}
