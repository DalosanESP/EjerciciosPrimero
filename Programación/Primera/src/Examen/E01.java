/*
Dada una cadena de caracteres cuyas palabras están separadas por un espacio en 
blanco, cambiar a mayúsculas las palabras cuya longitud sea superior a 3 caracteres.
a) Hacerlo sobre la propia cadena. 1,5 puntos
b) Hacerlo sobre una nueva cadena.  1,5 puntos

 */
package Examen;

public class E01 {
     public static void main(String arg[]){
        char frase[] = {'e', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'e', 'n', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        
        int x = 0;
        int longitud = 3;
       
       while(x > longitud){
           while(frase[x] != ' ')
               x++;
           frase[x]= Character.toUpperCase(frase[x+longitud]);
           
           
           x++;
       }
       System.out.println(frase);
    }   
}
  
         
     

