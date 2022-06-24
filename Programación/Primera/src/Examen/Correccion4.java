/*
Calcular el máximo común divisor de dos números mediante el algoritmo de 
Euclides, que consiste en ir restando el número más pequeño del más grande,
hasta que queden dos números iguales.
a) Hacerlo con un bucle.  1,5 puntos
b) Hacerlo con recursividad.  1,5 puntos
 */
package Examen;

public class Correccion4 {
        public static void main(String arg[]){
            int a = 6;
            int b = 27;
            
            while (a != b ){
                if(a > b)
                    a -=b;
                else
                    b -=a;
            }
            System.out.println(a);
            System.out.println(mcd(a, b));
        }
    public static int mcd(int a, int b){
        if (a == b)
            return a;
        else
            if(a > b)
                return mcd(a-b, b);
        else
                return mcd(a, b-a);
    }
}

