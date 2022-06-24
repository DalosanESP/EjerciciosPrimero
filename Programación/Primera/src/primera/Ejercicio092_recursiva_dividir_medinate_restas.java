/*
Recursividad. Hacer division mediante restas
 */
package primera;

public class Ejercicio092_recursiva_dividir_medinate_restas {
        public static void main(String arg[]){
      
        System.out.println("Division entera de 17/3 = " + dividir(17,3));
    }
    public static int dividir(int a, int b){
        if( a < b)
            return 0;
        else
       return dividir(a-b, b) +1;
        
    }
}