/*
Enviar un mensaje que indique el numero de veces que una subcadena se encuentra 
dentro de la cadena
 */
package primera;
public class Ejercicio064_indicar_repeticiones_de_cadena {
     public static void main(String arg[]){
        char cadena[] = {'E', 'n','n','n','n', ' ', 'u', 'n','n','n','n','n','n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        char subcadena[] = {'n','n','n'};
        int contador= 0;
        
        for(int i = 0; i < cadena.length - subcadena.length; i++){
            if(cadena[i] == subcadena[0]){
                int j=1;
                while((j < subcadena.length)&&(subcadena[j] == cadena[i+j]))
                    j++;
                if(j == subcadena.length)
                   contador++; 
                    
                
            }
            
        }
        System.out.println("Subcadena encontrada " + contador + " veces.");
     }
}
