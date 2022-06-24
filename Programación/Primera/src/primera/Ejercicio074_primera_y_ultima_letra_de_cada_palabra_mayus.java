/*
Modificar frase de manera que de cada palabra queden en mayuscula la primera y 
la ultima letra
 */
package primera;

public class Ejercicio074_primera_y_ultima_letra_de_cada_palabra_mayus {
    public static void main(String arg[]){
       char frase[] = {'e', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'e', 'n', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
       int inicio = 0, fin = 0;
       
       while(fin < frase.length){
           while(frase[fin] != ' ')
               fin++;
           frase[inicio]= Character.toUpperCase(frase[inicio]);
           frase[fin-1]= Character.toUpperCase(frase[fin-1]);
           
           inicio = ++fin;
       }
       System.out.println(frase);
    }   
}
