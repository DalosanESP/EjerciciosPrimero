/*
Realizar una funcion recursiva que realice la multiplicacion de dos numeros
miedante sumas
 */
package primera;

public class Ejercicio090_recursiva_multiplicar_mediante_sumas {
    public static void main(String arg[]){
        int resultado = multiplicar(5,4);
        System.out.println("El resultado es " + resultado);
    }
    public static int multiplicar(int a, int b){
        if( b == 0)
            return 0;
        else
        return a + multiplicar(a, b-1);
        
    }
}

