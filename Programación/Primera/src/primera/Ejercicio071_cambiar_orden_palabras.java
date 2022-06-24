/*
Cambiar palabras de orden
 */
package primera;

public class Ejercicio071_cambiar_orden_palabras {
    public static void main(String arg[]){
        char frase[] = { ' ','e', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'e', 'n', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a',};
        char frase2[] = new char [150];
        int inicio = frase.length - 1;
        int fin = inicio;
        int pos = 0; //indeice para frase 2
        
        while(inicio > 0){
            while(frase[inicio] !=' ')
                inicio--;
            for(int i=inicio; i<= fin; pos++, i++)
                frase2[pos] = frase[i];
            inicio = fin = inicio -1;
        }
        System.out.println(frase2);
    }
}
