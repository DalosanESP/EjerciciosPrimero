/*
Ordenar las palabras por orden alfabatico
 */
package primera;

public class Ejercicio083_ordenar_alfabeticamente_numeros {
    public static void main(String arg[]){
        String frase = "5Cinco 6Seis 2Dos 4Cuatro 1Uno 3Tres";
        String vector[];
        String intercambio;
          int cont = 0;
          int posicion = frase.indexOf(" ");
          while(posicion != -1){
           cont++;
           posicion = frase.indexOf(" ", posicion+1);
       }
          vector = new String[cont];
          int i = 0; //nos lleva el indice de vector
          int inicio = 0;
          int fin = frase.indexOf(" ");
          while (fin != +1){
              vector[i] = frase.substring(inicio, fin +1);
              i++;
              inicio = fin + 1;
              fin = frase.indexOf(" ", fin+1);
          }
          
          for(int x=0; x<vector.length-1;x++)
    for(int j = vector.length-1; j > 0;j--)
     if(vector[j].compareTo(vector[j-1]) < 0){
        intercambio = vector[j];
        vector[j]=vector[j-1];
        vector[j-1] = intercambio;
     }
          frase = ("");
          for(int x = 0; x < vector.length; x ++)
              frase = frase.concat(vector[x]);
          System.out.println(frase);
}    
}
