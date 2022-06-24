/*
El mismo ejercicio anterior, pero en lugar de tratar con una cadena de caracteres,
hacerlo con un String.  Sobre el mismo String.  2 puntos

 */
package Examen;

public class E02 {
    public static void main(String arg[]){
        String frase = "Habia hace mucho tiempo una galxia muy muy lejana";
          
        
        for(int i=0; i < frase.length();i++)
            System.out.printf("%C", frase.charAt(i));
        System.out.println();
       
            
    }
}
