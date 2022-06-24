//calcular la media del vector
package primera;

public class Ejercicio019_media_vector {
    public static void main(String arg[]){
        int datos[] = {10, 20, 30, -40, 50, 60};
        int acumulador = 0;
        for(int i=0; i < datos.length; i++)
            acumulador += datos[i];
        System.out.printf("La media de datos es %d", acumulador/datos.length);
    }
    
}
