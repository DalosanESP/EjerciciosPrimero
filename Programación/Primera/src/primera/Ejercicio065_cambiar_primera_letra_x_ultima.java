/*
Modificar cada palabra de la frase de manera que se intercambien la primera letra
con la última. Sabemos que cada palabra se separa de la siguiente por un espacio 
en blanco.
 */
package primera;
public class Ejercicio065_cambiar_primera_letra_x_ultima {
    public static void main(String arg[]){
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        int inicio= 0;
        int fin = 0;
        char intercambio;
        
        
       while(fin < frase.length){
           while(frase[fin] != ' ')
               fin++;
           intercambio = frase[inicio];
           frase[inicio] = frase[fin-1];
           frase[fin-1] = intercambio;
           inicio = fin+1;
           fin++;
           //inicio= ++fin; Equivalente a las dos anteriores
       }
            
    }
    
}
