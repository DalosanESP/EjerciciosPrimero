/*
Calcular el factorial de un número, llamando a una funcion recursiva
 */
package primera;

public class Ejercicio089_factorial_recursiva {
    public static void main(String arg[]){
        int resultado = factorial(5);
        System.out.println(resultado);
    }
    public static int factorial(int a){
        if( a == 1){
            return 1;
        }else{
          return a * factorial(a-1);
        }
    }
}
