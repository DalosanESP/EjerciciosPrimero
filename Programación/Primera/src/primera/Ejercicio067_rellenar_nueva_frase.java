/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primera;

public class Ejercicio067_rellenar_nueva_frase {
     public static void main(String arg[]){
        char frase[] = {'E', 'n', ' ', 'u', 'n', ' ', 'l', 'u', 'g', 'a', 'r', ' ', 'd', 'e', ' ', 'l', 'a', ' ', 'M', 'a', 'n', 'c', 'h', 'a', ' '};
        char cadena2[] = new char [150];
        int i;
        for(i=0; i < frase.length;i++)
            cadena2[i]=frase[i];
        
        for(int j=0; j < frase.length; j++)
            cadena2[i] = frase[j];
        
       
        System.out.println(cadena2);
     }
     
}
