/*
Dado un numero entero que se encuentra dentro de una variable, diseccionarlo, 
analizandolo hasta las centenas de millar
 */
package primera;

public class Ejercicio094_contar_unidades {
        public static void main(String arg[]){
            String medidas[]={"Unidades","Decenas","Centenas","Unidades de millar", "Decenas de millar","Centenas de millar"};
            int numero = 256809;
            int i = 0; //Sera el indice que nos indique en que medida estamos
            while(numero > 0){
                System.out.println((numero % 10) + " " + medidas[i]);
                i++;
                numero /= 10;
            }
            System.out.println();
            numero = 256809;
            mostrar(numero, medidas,0);
        }
        public static void mostrar(int num, String medidas[], int i){
            if(num > 0){
                System.out.println((num % 10) + " " + medidas[i]);
                mostrar(num/10, medidas, i+1);
            }
        }
        

}
