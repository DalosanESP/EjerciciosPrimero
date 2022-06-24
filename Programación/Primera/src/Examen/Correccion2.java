/*
El mismo ejercicio anterior, pero en lugar de tratar con una cadena de caracteres,
hacerlo con un String.  Sobre el mismo String.  2 puntos

 */
package Examen;

public class Correccion2 {
    public static void main(String arg[]){
        String frase = "En un lugar de la Mancha de cuyo nombre";
        int inicio= 0;
        int fin = frase.indexOf(" ");
        while (fin != -1){
            if((fin - inicio) > 3)
                frase = frase.substring(0, inicio).concat(frase.substring(inicio, fin).toUpperCase()).concat(frase.substring(fin));
            inicio = fin + 1;
            fin = frase.indexOf(" ", fin + 1);
        }
        System.out.println(frase);
    }
}
