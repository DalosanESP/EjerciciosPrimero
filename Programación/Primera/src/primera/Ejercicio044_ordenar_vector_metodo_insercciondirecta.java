/*
 Ordenacion de un vector por el metodo de insercion directa
 */
package primera;
public class Ejercicio044_ordenar_vector_metodo_insercciondirecta {
     public static void main(String arg[]){
         int vector[] = {2, 12, 23, 34, 45, 56, 33};
         int inter;
        
         
           for(int x=1; x<vector.length-1;x++){
               int i= x;
         while((i > 0) && (vector[i] < vector[i-1])){
          
            inter = vector[i];
            vector[i]= vector[i-1];
            vector[i-1] = inter;
            i--;
          }
         }
         
      
     }
    
}
