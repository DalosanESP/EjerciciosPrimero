/*
Mostrar por pantalla cuanto se ha vendido de cada producto
%s es par poner strings
 */
package primera;

public class Ejercicio030_mostrar_ventas_de_productos {
    public static void main(String arg[]){
        int tabla[][]= {{10, 20, 30, 40}, {50, 60, 70, 80}, {90, 100, 110, 120}};
        String productos[] = {"Naranjas","Peras","Melones"};
        int vector[]= {0, 0, 0};
        int acum;
    
          for(int i = 0; i < tabla.length; i++)
            for(int j = 0; j < tabla[i].length;j++){
               vector[i] += tabla[i][j];
            }
        for(int i=0;i<productos.length;i++)
               System.out.printf("Se han vendido %d kilos de %s\n", vector[i], productos[i]);
       
        
//ahora revolvemos utilizando acum en lugar de vector
       

for(int i = 0; i < tabla.length; i++){
        acum = 0;
            for(int j = 0; j < tabla[i].length;j++){
                acum += tabla[i][j];
            } 
                
               System.out.printf("Se han vendido %d kilos de %s\n", acum, productos[i]);
    }
              
            }
     }