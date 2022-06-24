/*

 */
package primera;

public class Ejercicio048_funcion_salarios_meses {
    public static void main(String arg[]){
         int salarios[][] = {{700, 900, 1300, 800, 790, 850}, {1000, 950, 1080, 1070, 1200, 1100}, {1300, 930, 1200, 1170, 1000, 1000}, {1500, 1950, 1880, 1978, 2200, 2100}};
        String empleados[] = {"Javier Marías", "Antonio Muñoz", "Isabel Allende", "Jose Saramago"};
        String meses[] = {"Enero", "Febrero", "marzo", "Abril", "Mayo", "Junio"};
//salarios semestrales sera una funcion que me devuelva un vector de 4 enteros
//con lo que ha cobrado cada empleado en los 6 meses
//salariosSemestrales2 recibirá el array bidimensional y el vector y modificara el vector
        int empleadosAcum[] = salariosSemestrales(salarios);
        for(int i=0; i < empleadosAcum.length;i++)
            System.out.printf("%s ha cobrado %d \n", empleados[i], empleadosAcum[i]);
        
        int emplAcum [] = {0, 0, 0, 0};
        salariosSemestrales2(salarios, emplAcum);
        
        int mesesAcum[] = salariosMensuales(salarios);
        for(int i=0; i < mesesAcum.length;i++)
            System.out.printf("En %s se ha pagado %d \n", meses[i], mesesAcum[i]);
        
        int mesesAcum2 [] = {0, 0, 0, 0, 0, 0};
        salariosMensuales2(salarios, mesesAcum2);
        for(int i=0; i < mesesAcum2.length;i++)
            System.out.printf("En %s se ha pagado %d \n", meses[i], mesesAcum2[i]);
    }
     public static int[] salariosSemestrales(int sal[][]){ 
         int acum[]={0,0,0,0};
         for(int i=0; i < sal.length;i++)
            for(int j=0; j < sal[i].length;j++)
                acum[i] += sal[i][j];
       return acum;
     }
     public static void salariosSemestrales2(int sal[][], int[] acum){
         for(int i=0; i < sal.length;i++)
            for(int j=0; j < sal[i].length;j++)
                acum[i] += sal[i][j];
     } 
     public static int[] salariosMensuales(int sal[][]){ 
         int acum[]={0,0,0,0,0,0};
         for(int i=0; i < sal.length;i++)
            for(int j=0; j < sal[i].length;j++)
                acum[j] += sal[i][j];
       return acum;
     }
     public static void salariosMensuales2(int mes[][], int[] acum){
         for(int i=0; i < mes.length;i++)
            for(int j=0; j < mes[i].length;j++)
                acum[i] += mes[i][j];
     } 
}
