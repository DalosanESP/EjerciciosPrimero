/*
Implementar una funcion que reciba una frase y la modifique convirtiendo todos 
sus caracteres a mayusculas.
 */
package primera;

public class Ejercicio060_devolver_frase_en_mayusculas {
    public static void main(String arg[]){
        char frase[] = {'E','n',' ','u','n',' ','l','u','g','a','r',' ','d','e',' ','L','a',' ','M','a','n','c','h','a',' '};
        aMayusculas(frase);
        System.out.println(frase);
    }
    public static void aMayusculas(char[]fr){
        for(int i=0; i < fr.length; i++)
                fr[i] = Character.toUpperCase(fr[i]);
    }
}

