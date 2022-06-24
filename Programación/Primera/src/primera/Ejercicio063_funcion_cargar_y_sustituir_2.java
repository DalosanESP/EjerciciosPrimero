/*
Sustituir un caracter por el primer caracter de s2 y luego meter los dos caracteres mas de s2.
 */
package primera;
//posible pregunta examen. dificil de cojones

public class Ejercicio063_funcion_cargar_y_sustituir_2 {
    public static void main(String arg[]){
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        char sustituir = 'n';
        char sustituto[] = {'X', 'X', 'R'};
        char frase2[]= new char[100];
        for(int i = 0; i < frase.length; i++)
            frase2[i] = frase[i];
        sustitucion(frase2, sustituir, sustituto, frase.length);
        System.out.println(frase2);
    }
    public static void sustitucion(char fr2[], char s1, char s2[], int longitud){
        for(int i = 0; i < longitud; i++)
            if(s1== fr2[i]){
                fr2[i] = s2[0];
                for(int x = 1; x < s2.length; x++){
                    for(int j = longitud; j > i; j--)
                        fr2[j] = fr2[j-1];
                    longitud++;
                    fr2[++i] = s2[x];
                    //fr2[i+1] = s2[x];
                    //i++;
                }
            }
    }
}
