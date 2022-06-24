/*
Mover las letras a la derecha de cada frase, poniendo asi el ultimo en la primera posicion de cada frase.
 */
package primera;


public class Ejercicio066_mover_primera_letra_al_final_decadapalabra {
    public static void main(String arg[]){
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        int fin = 0;
        int inicio = 0;
        while(fin < frase.length){
            while(frase[fin] != ' ')
                fin++;
            int ultimo = fin-1;
            //despDerecha(frase, ultimo, inicio);
            despIzquierda(frase, ultimo, inicio);
            inicio = fin+1;
            fin++;
        }   
        System.out.println(frase);
    }

    public static void despDerecha(char[] frase, int ultimo, int inicio) {
        char inter;
        inter = frase[ultimo];
        for(int j = ultimo; j > inicio; j--){
            frase[j] = frase[j-1];
        }
        frase[inicio] = inter;
    }
    public static void despIzquierda(char[] frase, int ultimo, int inicio) {
        char inter;
        inter = frase[inicio];
        for(int j = inicio; j < ultimo; j++){
            frase[j] = frase[j+1];
        }
        frase[ultimo] = inter;
    }
}