/*
Implementar una función que devuelva el número de caracteres en blanco de una frase
 */
package primera;

public class Ejercicio058_devolver_num_caracteres_en_blanco {
    public static void main(String arg[]){
        char frase[] = {'E','n',' ','u','n',' ','l','u','g','a','r',' ','d','e',' ','L','a',' ','M','a','n','c','h','a'};
         System.out.printf("El numero de palabras es %d ", numEspacios(frase)+1);
                 }
    
    public static int numEspacios(char[] fr){
        int total = 0;
            for(int i=0;i<fr.length;i++)
            if(fr[i]== ' ')
                total++;
            return total;
    }
}

