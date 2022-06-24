//multiplicar por dos los valores de el vector
package primera;


public class Ejercicio014_multiplicar_vector_por_2 {
        public static void main(String arg[]){
           int datos [] = {17,55,33,21,88};
           for(int i=0; i < datos.length; i++)
           System.out.printf("datos [%d] = %d \n", i, datos[i] );
       
        for(int i=0; i < datos.length; i++)
            datos[i] *=2; //datos[i]=datos[i]*2;
        for(int i=0; i < datos.length; i++)   
            System.out.printf("datos [%d] = %d \n", i, datos[i] );
        }
        
} 
