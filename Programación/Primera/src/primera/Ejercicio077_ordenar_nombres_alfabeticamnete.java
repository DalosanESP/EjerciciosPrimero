/*
Ordenar los nombres en Orden Alfabetico
 */
package primera;

public class Ejercicio077_ordenar_nombres_alfabeticamnete {
    public static void main(String arg[]){
      String nombres[]= {"Pepe", "Juan", "María", "Antonio", "Luisa"};
      String intercambio;
     for(int x = 0; x < nombres.length-1; x++)
         for(int i = nombres.length-1; i > x; i--)
             if(nombres[i].compareTo(nombres[i-1])<0){
                 intercambio = nombres[i];
                 nombres[i]= nombres[i-1];
                 nombres[i-1]= intercambio;
             }
     for( int x = 0; x < nombres.length; x++)
         System.out.printf("%s\n", nombres[x]);
    }
    
}
