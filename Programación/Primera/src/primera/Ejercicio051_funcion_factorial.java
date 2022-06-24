
package primera;

public class Ejercicio051_funcion_factorial {
     public static void main(String arg[]){
         int a=5;
         int b=2;
         System.out.printf("Combinaciones de %d elementos tomados de %d en %d resulta %d",a,b,b,a*b);
     }
    public static int factorial(int numero){
        int acum = 1;
        for(int i= 1; i <=numero; i++)
            acum *=i;
        return acum;
    }
}
