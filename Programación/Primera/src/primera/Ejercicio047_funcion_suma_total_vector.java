/*
Crear una funcion que devuelva la suma de todos los elementos de una tabla de enteros.
 */
package primera;

public class Ejercicio047_funcion_suma_total_vector {
     public static void main(String arg[]){
          int salarios[][] = {{700, 900, 1300, 800, 790, 850}, {1000, 950, 1080, 1070, 1200, 1100}, {1300, 930, 1200, 1170, 1000, 1000}, {1500, 1950, 1880, 1978, 2200, 2100}};
          
          
          System.out.println("La suma de los salarios es " + suma(salarios));
     }
     public static int suma(int sal[][]){
            int acum = 0;
        for(int i=0; i < sal.length;i++)
            for(int j=0; j < sal[i].length;j++)
                acum += sal[i][j];
        return acum;
        
            
               
    }
}