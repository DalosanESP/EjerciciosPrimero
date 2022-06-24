/*
Extraer una subcadena de una cadena. Funcion substring
 */
package primera;

public class Ejercicio078_sacar_subcadena_de_cadena_funcion_subestring {
     public static void main(String arg[]){
        String frase = "En un lugar de la mancha, de cuyo nombre no quiero acordarme";
        int inicio = 7;
        int fin = 17;
        System.out.println("La subcadena contiene: " + frase.substring(inicio, fin));
        System.out.println("La subcadena contiene: " + frase.substring(inicio));
        
        System.out.println("La subcadena contiene: " + frase.substring(inicio, fin));
     
     
     }    
}
