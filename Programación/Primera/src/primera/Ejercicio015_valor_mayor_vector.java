//Mostrar por pantalla el valor mayor de un vector
//i es igual a indice
package primera;

public class Ejercicio015_valor_mayor_vector {
    public static void main(String arg[]){
        int datos[] = {-17, -55, 33, -10, -44};
        int mayor = datos[0];
        int posMax = 0;
        for(int i = 1; i < datos.length; i++)
            if(datos[i] > mayor)
                mayor = datos [i];
        System.out.println("El valor máximo es " + mayor);
       for(int i = 1; i < datos.length; i++)
           if(datos[i] > datos [posMax])
                posMax = i;
        System.out.printf("El valor máximo está en la posición %d y es el %d ", posMax, datos[posMax]);
    }
}
