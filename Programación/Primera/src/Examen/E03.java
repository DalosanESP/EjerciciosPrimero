/*
Realizar una función que sea capaz de multiplicar una tabla de enteros de 
dimensiones 4*4, por un vector de 4 enteros y devuelva una nueva tabla con el 
contenido de dicha multiplicación.  Mostrar la tabla resultante por pantalla.

 */
package Examen;

public class E03 {
    public static void main(String arg[]){
        int tabla[][]= {{1, 2, 3, 4}, {2, 4, 6, 8}, {3, 6, 6, 12},{4, 8, 12, 16}};
        int tabla2[]= {1, 2, 3, 4};
        modificar(tabla, tabla2);
       for(int i=0;i<tabla.length;i++)
        for(int j=0;j<tabla[i].length;j++)
               System.out.printf("%d ",tabla[i][j]);
                System.out.println();
        }
    
    
public static void modificar(int t[][], int t2[]){
    for(int i=0;i<t.length;i++)
        for(int j=0;j<t[i].length;j++)
            t[i][j]*= t2[i];
    }
}
