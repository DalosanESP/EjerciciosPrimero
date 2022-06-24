/*
Tratar con Strings. Metodo chartAT
 */
package primera;

public class Ejercicio076_metodo_chartAT {
    public static void main(String arg[]){
        String frase = "En un lugar de la mancha, de cuyo nombre no quiero acordarme";
        char[] cadena =  new char[150];
        
        for(int i=0; i < frase.length();i++)
            System.out.printf("%C -", frase.charAt(i));
        
        for(int i=0; i < frase.length();i++)
            cadena[i] = frase.charAt(i);
        
        System.out.println();
        System.out.println(cadena);
            
    }
}
