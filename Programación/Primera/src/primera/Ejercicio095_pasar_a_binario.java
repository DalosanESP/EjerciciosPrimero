/*
Pasar un numero a binario
 */
package primera;

public class Ejercicio095_pasar_a_binario {
        public static void main(String arg[]){
            enBinario(29);
    }
        
   public static void enBinario(int x){
       if(x !=0){
           enBinario(x/2);
           System.out.printf("%d", x%2);
           
          
           
       }
   }
}
