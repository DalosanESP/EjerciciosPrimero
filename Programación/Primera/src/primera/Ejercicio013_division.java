//division entera mediante restas
package primera;


public class Ejercicio013_division {
    public static void main(String arg[]){
        int dividendo = 7;
        int divisor =2;
        int contador= 0;
        int x = dividendo;
        while(x >= divisor){
            x -=divisor;
            contador++;
    }
           System.out.printf("El resultado de %d / %d es %d ",dividendo, divisor, contador);
                
    }

}
