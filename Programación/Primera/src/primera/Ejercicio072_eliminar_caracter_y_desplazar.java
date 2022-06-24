/*
El ejercicio debe eliminar de una cadena de caracteres, el caracter que hay en 
la variable. Eliminar consistirá en desplazar hacía la izquierda los caracteres 
del resto de la tabla
 */
package primera;

public class Ejercicio072_eliminar_caracter_y_desplazar {
     public static void main(String arg[]){
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        char caracter = 'n';
        
        int longitud = frase.length;
        int i=0;
        while(i < longitud)
            if(frase[i] == caracter){
                for(int z=i; z < longitud-1; z++)
                    frase[z] = frase[z+1];
                frase[longitud-1]= ' ';
                longitud--;
            }else
                i++;
        System.out.println(frase);
     }
}
