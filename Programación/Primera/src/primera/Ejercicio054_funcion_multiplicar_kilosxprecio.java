/*
Tendremos un array bidimensional con los enteros, con los kilos vendidosde dos productos 
cada día de la semana. Y un vector de doubles(para decimales) con los precios de los dos
productos. Hacer una funcion que sea capaz de modificar el contenido de la tabla, multiplicando
los kilos por el precio del producto.
 */
package primera;
public class Ejercicio054_funcion_multiplicar_kilosxprecio {
    public static void main(String arg[]){
        double kilos [][] = {{5,6,9,23,7,14,0},{16,8,4,33,15,21,2}};
        double precios[] = {4.5,2.2};
        modificar(kilos, precios);
        for(int i=0;i<kilos.length;i++)
        for(int j=0;j<kilos[i].length;j++)
         System.out.printf(" %.2f ",kilos[i][j]);
       System.out.println();
     
    }
public static void modificar(double k[][], double p[]){
    for(int i=0;i<k.length;i++)
        for(int j=0;j<k[i].length;j++)
            k[i][j]*= p[i];
    }
}