//\ es para separar de linea lo que se muestra en pantalla
package primera;

public class Ejercicio016_valoryposicion_maxymin_envector {
        public static void main(String arg[]){
        int datos[] = {-17, -55, 33, -1, -44};
        int posMax = 0;
        int posMin = 0;
        for(int i = 1; i < datos.length; i++)
           if(datos[i] > datos [posMax])
                posMax = i;
         System.out.printf("El valor máximo está en la posición %d y es el %d \n", posMax, datos[posMax]);
        for(int i = 1; i < datos.length; i++)
           if(datos[i] < datos [posMin])
                posMin = i;
            System.out.printf("El valor mínimo está en la posición %d y es el %d ", posMin, datos[posMin]);
       
        }
 
    
}
