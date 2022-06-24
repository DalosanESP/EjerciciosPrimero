/*
Sustituir un asubcadena por otra .replace
Buscar una subcadena dentro de otra. indexOf
 */
package primera;

public class Ejercicio079_sustituir_una_cadena_x_otra_y_buscar_subcadena {
    public static void main(String arg[]){
        String frase = "En un lugar de la mancha, de cuyo nombre no quiero acordarme";
        
        frase = frase.replace('a', 'X');
        
        System.out.println(frase);
        
        frase = frase.replace("lugXr", "sitio");
        System.out.println(frase);
        
        
//Numero de veces que se encuentra una subcadena dentro de una cadena
   int contador = 0;
   int posicion = frase.indexOf("sitio");
   while(posicion != -1){
       contador++;
       posicion = frase.indexOf("sitio", posicion+1);
   }
   
   System.out.println("Se ha encontrado " + contador + " veces.");
    }    
}
