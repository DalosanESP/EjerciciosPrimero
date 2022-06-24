/*
Implementar una funcion que devuelva un vector con el numero de kilos vendidos de cada prosucto
En el programa principal mostrar los resultados.
 */
package primera;

public class Ejercicio056_devolver_kilos_de_productos {
    public static void main(String arg[]){
        int kilos [][] = {{5,6,9,23,7,14,0},{16,8,4,33,15,21,2}};
        String productos[] = {"Peras", "Manzanas"};
        int sumaDeKilos[]=sumarKilos(kilos);
        for(int i=0;i<sumaDeKilos.length;i++)
            System.out.println(sumaDeKilos[i]+" kilos de " + productos);
           
        
        }
     
    public static int[] sumarKilos(int k[][]){
        int vector[] = {0,0};
        for(int i=0;i<k.length;i++)
            for(int j=0;j<k[i].length;j++)
                vector[i] += k[i][j];
       return vector;
     }
    }

