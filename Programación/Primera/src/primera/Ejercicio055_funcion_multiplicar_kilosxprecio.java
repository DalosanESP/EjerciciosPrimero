/*
Multiplicar los kilos por sus precios
 */
package primera;
public class Ejercicio055_funcion_multiplicar_kilosxprecio {
     public static void main(String arg[]){
        int kilos [][] = {{5,6,9,23,7,14,0},{16,8,4,33,15,21,2}};
        double precios[] = {3.5,2.2};
        double ventas [][] = cargarTabla(kilos, precios);
        for(int i=0;i<ventas.length;i++){
         for(int j=0;j<ventas[i].length;j++)
             System.out.printf("%.2f ", ventas[i][j]);
        System.out.println();
        
     }
        double ventas2[][]= new double[2][7];
        cargarTabla2(kilos, precios, ventas2);
        for(int i=0;i<ventas2.length;i++){
         for(int j=0;j<ventas2[i].length;j++)
             System.out.printf("%.1f ", ventas2[i][j]);
        System.out.println();
        }
     }
     public static double[][] cargarTabla(int[][]k, double p[]){
     double totales[][]= new double[k.length][k[0].length];
     for(int i=0;i<k.length;i++)
         for(int j=0;j<k[i].length;j++)
             totales[i][j] = k[i][j]*p[i];
     return totales;
     }
     public static void cargarTabla2(int k[][], double p[], double v[][]){
     for(int i=0;i<k.length;i++)
         for(int j=0;j<k[i].length;j++)
             v[i][j] = k[i][j]*p[i];
     }
}
