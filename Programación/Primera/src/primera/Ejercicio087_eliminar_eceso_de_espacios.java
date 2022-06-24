/*
Eliminar el exceso de espacios en blanco en una frase
 */
package primera;

public class Ejercicio087_eliminar_eceso_de_espacios {
    public static void main(String arg[]){
        String frase = "Habia      una      vez, un      circo, que      alegraba   siempre     el   corazon";
       //frase = frase.replaceAll(" +", " ");
       //System.out.println(frase);
    
     boolean primero = true;
     int i=0;
     while( i < frase.length())
         if(frase.charAt(i) == ' '){
             if(primero){
                 primero = false;
                 i++;
             }else{
                 frase = frase.substring(0, i).concat(frase.substring(i+1));
             }
            
         }else{
             i++;
             primero = true;
         }
            System.out.println(frase);
        
    }
}
