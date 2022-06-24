//desplazar los elemtenos de un vector una posicion a la derecha, tantas veces
//como elementos tenga el vector, de manera que al final el vector queda igual que al inicio
package primera;

public class Ejercicio023_desplazar_vectores {
     public static void main(String arg[]){
        int [] datos = {10, 20, 30, 40, 50, 60};
           for(int j=0; j < datos.length;j++){
               int guarda = datos[datos.length-1];
               for(int i= datos.length-1; i > 0; i--)
                 datos[i] = datos[i-1];
            datos[0] = guarda;
             for(int i=0; i < datos.length; i++)
        System.out.printf("%d ; ", datos[i]);
       System.out.println();//esto sirve para cambiar de linea
           }
     }
}

    

