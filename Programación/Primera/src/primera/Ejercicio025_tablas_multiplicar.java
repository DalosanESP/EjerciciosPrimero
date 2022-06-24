/*
Mostrar por pantalla las tablas de multiplicar
 */
package primera;

public class Ejercicio025_tablas_multiplicar {
     public static void main(String arg[]){
        for(int i = 1; i < 10;i++){
            System.out.println("TABLA DEL "+i+": ");
            for(int j = 1; j <= 10;j++)
                System.out.printf("%d * %d = %d \n", i,j,(i*j));
     }
    
    
}
    
}
