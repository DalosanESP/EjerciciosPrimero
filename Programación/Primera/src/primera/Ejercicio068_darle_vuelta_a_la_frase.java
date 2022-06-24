/**

 */


package primera;
public class Ejercicio068_darle_vuelta_a_la_frase {
    public static void main(String arg[]){
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        char cadena2[] = new char [150];
        
        for(int i=(frase.length-1), j=0; i>=0; i--,j++)
            cadena2[j]=frase[i];
        
        System.out.println(cadena2);
    }
}
