/*
1º)Mostrar por pantalla el trimestre con mas nacimientos
2º)Mes en el que mas bajas se han producido. De funciones y traslados
3º)Mostrr por pantalla cuentas personas nuevas han venido al pueblo y cuantas 
han desaparecido
 */
package primera;
public class Ejercicio097 {
     public static void main(String arg[]){
       
        String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo","Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int movPoblacion[][] = {{3,2,0,0},{1,5,1,0},{9,3,2,7},{2,5,3,6},{1,2,3,4},{5,4,3,2},{1,3,2,4},{1,9,2,8},{1,4,3,2},{2,3,1,1},{3,2,4,1},{1,2,2,1}};
        int posmaxFila = 0;
        int posmaxCol  = 0;
       for(int i = 0; i < movPoblacion.length; i++){
           for(int j = 0; j < movPoblacion[i].length; j++){
               if(movPoblacion[i][j] > movPoblacion[posmaxFila][posmaxCol]){
                   posmaxFila=i;
                   posmaxCol=j;
               }
     }
       }
        System.out.printf("%s con %d es el mes con mas nacimientos\n", meses[posmaxFila], movPoblacion[posmaxFila][posmaxCol]);

        int posmaxFiladef = 2;
        int posmaxColdef  = 2;
        
       for(int i = 2; i < movPoblacion.length; i++){
           for(int j = 2; j < movPoblacion[i].length; j++){
               if(movPoblacion[i][j] > movPoblacion[posmaxFiladef][posmaxColdef]){
                   posmaxFiladef=i;
                   posmaxColdef=j;
               }
     }
       }
         System.out.printf("%s con %d es el mes con mas defunciones\n", meses[posmaxFiladef], movPoblacion[posmaxFiladef][posmaxColdef]);

        int posmaxFilatras = 3;
        int posmaxColtras = 3;
          for(int i = 3; i < movPoblacion.length; i++){
           for(int j = 3; j < movPoblacion[i].length; j++){
               if(movPoblacion[i][j] > movPoblacion[posmaxFiladef][posmaxColdef]){
                   posmaxFilatras=i;
                   posmaxColtras=j;
               }
     }
       }
         
System.out.printf("%s con %d es el mes con mas traslados\n", (meses[posmaxFilatras]), (movPoblacion[posmaxFilatras][posmaxColtras] + movPoblacion[posmaxFiladef][posmaxColdef]));
//System.out.printf("%s con %d es el mes con mas traslados\n", meses[posmaxFilatras], movPoblacion[posmaxFilatras][posmaxColtras]);

}
     
}
