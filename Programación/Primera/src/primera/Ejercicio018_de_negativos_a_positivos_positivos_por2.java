//cambiar los negativos a postivios y los postitivos por 2
package primera;

public class Ejercicio018_de_negativos_a_positivos_positivos_por2 {
    public static void main(String arg[]){
        int datos[] = {10, -20, 30, -40, 50, 60};
        for(int i=0; i < datos.length; i++)
            if (datos[i] > 0)
                datos[i] *=2;
        else
                datos[i]*= -1;
        
        for(int i=0; i < datos.length; i++)
            System.out.printf("%d - ", datos[i]);

    }
}
