/*
Obtener el maximo elemento y el minimo de toda la tabla y mostrar los resultaos
 */
package primera;

public class Ejercicio034_max_y_min_elemento {
    public static void main(String arg[]){
        int entradas[][]= {{100, 20, 30, 40, 25, 200, 153}, {50, 60, 70, 80, 88, 55, 77}, {13, 23, 34, 45, 67,78,89},{98, 76, 65, 54, 32,21, 11}};
        String peliculas[] = {"James Bond","Star Wars","Batman","Venom"};
        String dias[] = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
        int posmaxFila = 0;
        int posminFila = 0;
        int posmaxCol  = 0;
        int posminCol  = 0;
         for(int i = 0; i < entradas.length; i++)
           for(int j = 0; j < entradas[i].length; j++){
               if(entradas[i][j] > entradas[posmaxFila][posmaxCol]){
                   posmaxFila=i;
                   posmaxCol=j;
               }
               if(entradas[i][j] < entradas[posminFila][posminCol]){
                   posminFila= i;
                   posminCol= j;
               }
           }
        System.out.printf("%s el %s consigio maxima asistencia con %d espectadores\n", peliculas[posmaxFila], dias[posmaxCol], entradas[posmaxFila][posmaxCol]);
        System.out.printf("%s el %s consigio minima asistencia con %d espectadores\n", peliculas[posminFila], dias[posminCol], entradas[posminFila][posminCol]);      
    
        
}
}
