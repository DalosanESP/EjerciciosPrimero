/*
Mostrar por pantalla el nombre del empleado que más cobra y su salario medio mensual y el que
menos cobra y su salario medio mensual
Mostrar el mes en que más se cobra y cúal es su salario medio y mes en que menos se cobra y cual
es su media
 */
package primera;

public class Ejercicio037_empleadomasymenoscobra_mesmenosymassecobraymedia {
        public static void main(String arg[]){
        int salarios[][] = {{700, 900, 1300, 800, 790, 850}, {1000, 950, 1080, 1070, 1200, 1100}, {1300, 930, 1200, 1170, 1000, 1000}, {1500, 1950, 1880, 1978, 2200, 2100}};
        String empleados[] = {"Javier Marías", "Antonio Muñoz", "Isabel Allende", "Jose Saramago"};
        String meses[] = {"Enero", "Febrero", "marzo", "Abril", "Mayo", "Junio"};    
        double empleadosAcum[] = {0, 0, 0, 0};
        double mesesAcum[] = {0, 0, 0, 0, 0, 0};
        
        int posmaxEmp = 0;
        int posminEmp = 0;
        int posmaxMes = 0;
        int posminMes = 0;
        
        for(int i=0; i < empleados.length; i++)
           for(int j=0; j < meses.length; j++){
                empleadosAcum[i] += salarios[i][j];
                mesesAcum[j] += salarios[i][j];
            }
        for(int i=1; i < empleados.length; i++){
            if(empleadosAcum[i] > empleadosAcum[posmaxEmp])
                posmaxEmp = i;
            if(empleadosAcum[i] < empleadosAcum[posminEmp])
                posminEmp = i;
        }
        System.out.printf("El empleado que más cobra es %s, con una media de %.2f euros al mes.\n", empleados[posmaxEmp], empleadosAcum[posmaxEmp] / meses.length);
        System.out.printf("El empleado que menos cobra es %s, con una media de %.2f euros al mes.\n", empleados[posminEmp], empleadosAcum[posminEmp] / meses.length);
        
                for(int i=1; i < meses.length; i++){
            if(mesesAcum[i] > mesesAcum[posmaxMes])
                posmaxMes = i;
            if(mesesAcum[i] < mesesAcum[posminMes])
                posminMes = i;
   }
       
   System.out.printf("El mes que más cobra es %s, con una media de %.2f euros al mes.\n", meses[posmaxMes], mesesAcum[posmaxMes] /empleados.length);
   System.out.printf("El mes que menos cobra es %s, con una media de %.2f euros al mes.\n", meses[posminMes], mesesAcum[posminMes] / empleados.length);
}
}