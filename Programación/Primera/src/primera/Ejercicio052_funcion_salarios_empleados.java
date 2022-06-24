/*
Dada la tabla de salarios y el vector de empleados, queremos que se muestre por pantalla, de 
cada empleado, su nombre, y cuanto ha ganado en esos 6 meses de trabajo.
Para lo que se pide implementar una funcion que devuelva la suma de los salarios de 
un empleado
 */
package primera;
public class Ejercicio052_funcion_salarios_empleados {
        public static void main(String arg[]){
         int salarios[][] = {{700, 900, 1300, 800, 790, 850}, {1000, 950, 1080, 1070, 1200, 1100}, {1300, 930, 1200, 1170, 1000, 1000}, {1500, 1950, 1880, 1978, 2200, 2100}};
        String empleados[] = {"Javier Marías", "Antonio Muñoz", "Isabel Allende", "Jose Saramago"};
        
        
        for(int i=0;i<salarios.length;i++)
         System.out.printf("El empleado %s ha conseguido %d € \n", empleados[i], suma(salarios[i]));
     }
        
     
    public static int suma(int sals[]){
        int acum = 0;
    for(int i =0; i<sals.length;i++)
    acum += sals [i];
    return acum;
     }
    }

        
        
        
   
