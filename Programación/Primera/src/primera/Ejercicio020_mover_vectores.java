//mover los elementos del vector a la izquierda
package primera;

public class Ejercicio020_mover_vectores {
        public static void main(String arg[]){
            int [] datos = {10, -20, 30, -40, 50, 60};
            int guarda = datos[0];
            
            for(int i=1; i < datos.length; i++)
                datos[i-1] = datos[i];
            datos[datos.length - 1] = guarda;
            for(int i=0; i < datos.length; i++)
        System.out.printf("%d ; ", datos[i]);
        }

}