/*
Calcular el máximo común divisor de dos números mediante el algoritmo de 
Euclides, que consiste en ir restando el número más pequeño del más grande,
hasta que queden dos números iguales.
a) Hacerlo con un bucle.  1,5 puntos
b) Hacerlo con recursividad.  1,5 puntos

 */
package Examen;
public class E04 {
    public static void main(String arg[]){
        int n1 = 100;
        int n2 = 5;
        int acum= 0;
        while(n1 >= n2){
            n1 -=n2;
            acum++;
    }
           System.out.println (acum);
                
      
      System.out.println(euclides(100,5));
    }
    public static int euclides(int a, int b){
        if( a < b)
            return 0;
        else
       return euclides(a-b, b) +1;
        
    }
}