/*
Mostrar por pantalla el numero de veces que aparecerra un caracter en un vector
de Strings
 */
package primera;

public class Ejercicio080_sacar_numero_deun_caracter_enun_vectordestrings {
     public static void main(String arg[]){
            String frase[]= {"En un lugar", "de la Mancha", "de cuyo nombre", "no quiero", "acordarme"};
            int cont = 0;
    for(int i=0; i < frase.length; i++)
        for(int j = 0; j < frase[i].length(); j++)
            if (frase[i].charAt(j) == 'a')
                cont++;
    System.out.printf("Hay %d aes\n", cont);
            
     }
}
