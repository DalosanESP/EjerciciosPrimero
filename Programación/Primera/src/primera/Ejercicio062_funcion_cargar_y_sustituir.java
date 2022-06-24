/*
Implementar una funion a la que le pasemos una cadena de caracteres,un caracter 
a sustituir y otra cadena con los sustitutos, y nos devuelva otra cadena cargada
con los caracteres de la cadena original, pero sustituidos 
 */
package primera;
public class Ejercicio062_funcion_cargar_y_sustituir {
    public static void main(String arg[]){
        char frase[] = {'E','n',' ','u','n',' ','l','u','g','a','r',' ','d','e',' ','L','a',' ','M','a','n','c','h','a',' '};
        char sustituir = 'a';
        char sustituto[] = {'X','X','R'};
        char fraseMod[] = sustitucion(frase, sustituir, sustituto);
        System.out.println(fraseMod);
    }
    public static char[] sustitucion(char[]fr, char s1, char[] s2){
        char frase2[] = new char[100];
        for(int i=0, y=0; i < fr.length; i++)
           if(fr[i] == s1)
               for(int j=0; j < s2.length; j++)
                   frase2[++y]= s2[j];
        else
                   frase2[++y] = fr[i];
               
               return frase2;
        }
    
}
