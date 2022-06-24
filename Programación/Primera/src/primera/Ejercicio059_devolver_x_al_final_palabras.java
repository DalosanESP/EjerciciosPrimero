/*
Implementar dos funcionnes similares que carguen fraseMod con los caracteres de frase, pero sustiyunedo
los espacios en blanco por 'x' al final de cada palabra. En la primera l funcion no devolvera nada 
y en la segunda la funcion devolvera una cadena de caracteres
*/
package primera;

public class Ejercicio059_devolver_x_al_final_palabras {
    public static void main(String arg[]){
        char frase[] = {'E','n',' ','u','n',' ','l','u','g','a','r',' ','d','e',' ','L','a',' ','M','a','n','c','h','a',' '};
        char fraseMod[]= new char [50];
        
        modificarFrase(frase, fraseMod);
        System.out.println(fraseMod);
        
        char[] nueva = modificarFrase(frase);
        System.out.println(nueva);
    }
    public static void modificarFrase(char[]f1, char[]f2){
            for(int i=0, j=0; i < f1.length; i++, j++){
                if(f1[i] == ' '){
                    f2[j] = 'x';
                    j++;
                }
                f2[j]=f1[i];
            }
    }
    public static char[] modificarFrase(char[]f1){
        char[] f2 = new char[50];
            for(int i=0, j=0; i < f1.length; i++, j++){
                if(f1[i] == ' '){
                    f2[j] = 'x';
                    j++;
                }
                f2[j]=f1[i];
            }
            return f2;
    }
}