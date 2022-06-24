/*
Sustituir la subcadena por ella misma en mayusculas.
Y funcion de concatenar 
 */
package primera;

public class Ejercicio081_poner_subcadena_mayusculas {
    public static void main(String arg[]){
            String frase[]= {"en un lugar", "en la Mancha", "de cuyo nombre", "no quiero", "acordarme"};
            String subCadena = "en";
            
      for(int i=0; i < frase.length; i++)
           frase[i] = frase[i].replace(subCadena, subCadena.toUpperCase());
     frase[0] = frase[0].concat(" hola");
     for(int i=0; i < frase.length;i++)
         System.out.println(frase[i]);
    }
}
