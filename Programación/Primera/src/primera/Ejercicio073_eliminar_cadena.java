/*
Eliminar de una cadena de caracteres todas las veces que se repite una subcadena.
Sin utilizar una cadena de caracteres auxiliar
 */
package primera;
public class Ejercicio073_eliminar_cadena {
    public static void main(String arg[]){
        char frase[] = {'e', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'e', 'n', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        char cadAEliminar[] = {'e','n',' '};
        int longitud = frase.length;
        int i =0; //llevara el indice de frase
        int y; //llevara el indice de cadEliminar
        int x; //llevara el indice de frase cuando hyaa una coincidencia
        
        while(i < longitud-cadAEliminar.length){
            if(frase[i] == cadAEliminar[0]){
                y=1;
                x = i+1;
                while((y < cadAEliminar.length) && (frase[x] == cadAEliminar[y])){
                    y++;
                    x++;
                }
                if (y == cadAEliminar.length){
                    for(int j=0; j<cadAEliminar.length;j++){
                        for(int z = i; z < longitud-1; z++)
                            frase[z] = frase[z+1];
                    frase[longitud-1] = ' ';
                    longitud--;
                }
            }
        
        }
        i++;
    }
    System.out.println(frase);
}
}