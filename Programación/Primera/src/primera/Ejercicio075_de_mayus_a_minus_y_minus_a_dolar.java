/*
Cambiar vocales a mayusculas y de minisculas a mayusculas
 */
package primera;

public class Ejercicio075_de_mayus_a_minus_y_minus_a_dolar {public static void main(String arg[]){
       char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'e', 'n', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
      
       for(int i=0; i < frase.length;i++)
           switch(frase[i]){
                case 'A': case 'E':case 'I': case 'O': case 'U':
                            frase[i] = Character.toLowerCase(frase[i]);
                            break;
                case 'a': case 'e': case 'i': case 'o': case 'u':
                            frase[i] = Character.toUpperCase(frase[i]);
                             break;
                default:
                            frase[i]='$';
                             
}
      System.out.println(frase);
    }   
}
