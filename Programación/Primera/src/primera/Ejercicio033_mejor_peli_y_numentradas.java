/*
Muestra por pantlla la pelicula mas taquillera y cuantas entradas ha vendido y la menos taquilera
y cuantas ha vendido
 */
package primera;

public class Ejercicio033_mejor_peli_y_numentradas {
    public static void main(String arg[]){
        int entradas[][]= {{10, 20, 30, 40, 25, 200, 153}, {50, 60, 70, 80, 88, 55, 77}, {13, 23, 34, 45, 67,78,89},{98, 76, 65, 54, 32,21, 11}};
        String peliculas[] = {"James Bond","Star Wars","Batman","Venom"};
        int vacum[] = {0, 0, 0, 0,};
        int posmax = 0;
        int posmin = 0;
        
        for(int i = 0; i < entradas.length; i++)
           for(int j = 0; j < entradas[i].length; j++)
               vacum[i] += entradas[i][j];
        for(int i=1; i < vacum.length; i++){
            if(vacum[i] > vacum[posmax])
                posmax = i;
            if(vacum[i] < vacum[posmin])
                posmin = i;
           }
        System.out.printf("La mejor pelicula fue %s, y se vendieron %d entradas\n", peliculas[posmax], vacum[posmax]);
        System.out.printf("La peor pelicula fue %s, y se vendieron %d entradas\n", peliculas[posmin], vacum[posmin]);
        
}
}
