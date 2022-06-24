/*
Sustituir las apariciones de la subcadena1, por la subcadena 2, utilizando un 
vector auxiliar.

 */
package primera;

public class Ejercicio070_sustituir_con_vector_aux {
     public static void main(String arg[]){
        char frase[] = {'e', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'e', 'n', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        char subcadena1[] = {'e','n',' '};
        char subcadena2[] = {'X','X','X','X','X'};
        char frase2[] = new char[150];
        int iS;
        for(int i = 0, j = 0; i < frase.length; i++, j++){
         if(frase[i] == subcadena1[0]){
             iS = 1;
             while((iS<subcadena1.length) && (subcadena1[iS] == frase[i+iS]))
                 iS++;
             if(iS == subcadena1.length){
                 for(int z = 0; z < subcadena2.length; z++)
                     frase2[j++] = subcadena2[z];
                 j--;
                 i += subcadena1.length - 1;
             }else
                 frase2[j] = frase[i];
         }else
             frase2[j] = frase[i];
     }
        System.out.println(frase2);
     }
}
