/*
Dada una cadena de caracteres cuyas palabras están separadas por un espacio en 
blanco, cambiar a mayúsculas las palabras cuya longitud sea superior a 3 caracteres.
a) Hacerlo sobre la propia cadena. 1,5 puntos
b) Hacerlo sobre una nueva cadena.  1,5 puntos

 */
package Examen;

public class Correccion1 {
     public static void main(String arg[]){
       char frase[] = {'e', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'e', 'n', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
       int inicio = 0, fin = 0;
       
       while(fin < frase.length){
           while(frase[fin] != ' ')
               fin++;
           if((fin-inicio) > 3)
               for(int i = inicio; i < fin; i++)
          
           frase[i]= Character.toUpperCase(frase[i]);
           
           
           inicio = ++fin;
       }
       System.out.println(frase);
       inicio = 0;
       fin = 0;
       char frase2[] = new char[100];
              
       while(fin < frase.length){
           while(frase[fin] != ' '){
               frase2[fin]=frase[fin];
               fin++;
           
       }
       frase2[fin]=frase[fin];
           if((fin-inicio) > 3)
               for(int i = inicio; i < fin; i++)
           frase2[i]= Character.toUpperCase(frase[i]);
           inicio = ++fin;
       }
       System.out.println(frase2);
       
       
    }   
}

         

