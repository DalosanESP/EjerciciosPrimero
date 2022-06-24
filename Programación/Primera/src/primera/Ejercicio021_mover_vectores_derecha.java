//lo mismo pero a la derecha
package primera;

public class Ejercicio021_mover_vectores_derecha {
    public static void main(String arg[]){
        int [] datos = {10, -20, 30, -40, 50, 60};
            int guarda = datos[datos.length-1];
            
             for(int i= datos.length-1; i > 0; i--)
                 datos[i] = datos[i-1];
            datos[0] = guarda;
             for(int i=0; i < datos.length; i++)
        System.out.printf("%d ; ", datos[i]);
        }

}