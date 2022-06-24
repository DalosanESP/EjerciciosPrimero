/*
Tenemos un array bididimesnsional en el que se guardan el numero de entradas vendidas
en las cuatro salas de cine del centro comercial, cada dia de la semana
Mostrar por pantalla el dia en que más entradas se vendireon y cuantas entradas se vendieron ese dia
Y el dia que se vendieron menos y cuantas se vendieron
 */
package primera;
public class Ejercicio032_mejor_dia_y_num_entradas {
    public static void main(String arg[]){
        int entradas[][]= {{10, 20, 30, 40, 25, 200, 153}, {50, 60, 70, 80, 88, 55, 77}, {13, 23, 34, 45, 67,78,89},{98, 76, 65, 54, 32,21, 11}};
        String dias[] = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
        int vacum[] = {0, 0, 0, 0, 0, 0, 0};
        int posmax = 0;
        int posmin = 0;
        
        for(int i = 0; i < entradas.length; i++)
           for(int j = 0; j < entradas[i].length; j++)
               vacum[j] += entradas[i][j];
        for(int i=1; i < vacum.length; i++){
            if(vacum[i] > vacum[posmax])
                posmax = i;
            if(vacum[i] < vacum[posmin])
                posmin = i;
           }
        System.out.printf("El mejor dia fue el %s, y se vendieron %d entradas\n", dias[posmax], vacum[posmax]);
        System.out.printf("El peor dia fue el %s, y se vendieron %d entradas\n", dias[posmin], vacum[posmin]);
        
    }
}
        
    

    
   

