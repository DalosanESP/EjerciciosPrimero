/*
Tenemos que copiar en cadena2 el contenido de frase, dos vececs. La primera normal
y la segunda con las letras al revés
 */
package primera;

public class Ejercicio069_efecto_espejo {
    public static void main(String arg[]){
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        char cadena2[] = new char [150];
        int i;
         for(i=0; i < frase.length;i++)
            cadena2[i]=frase[i];
         
         for(int j=i-1; j>=0; j--,i++)
             cadena2[i] = frase[j];
         
         System.out.println(cadena2);
        
    }
    
}
