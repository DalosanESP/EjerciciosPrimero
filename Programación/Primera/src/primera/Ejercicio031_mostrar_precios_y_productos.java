/*
 //mismo ejercicio pero con un vector de precios y sacar por pantalla cuanto 
has vendido y los precios tres precios
Double=Float
 */
package primera;
public class Ejercicio031_mostrar_precios_y_productos {
     public static void main(String arg[]){
    int kilos[][]= {{10, 20, 30, 40,44}, {50, 60, 70, 80,88}, {90, 100, 110, 120,122}};
    String productos[] = {"Naranjas","Peras","Melones"};
    double precios[] = {1.5, 2.08, 0.8};
    double acum;
    double total = 0; 
    for(int i = 0; i < productos.length; i++){
        acum=0;
        for(int j = 0; j < kilos[i].length;j++){
               acum += (kilos[i][j] * precios[i]);
    }
            System.out.printf("Vendidos %.2f euros de %s\n", acum, productos[i]);
            total += acum;
}
            System.out.printf("Hemos recaudado %2f euros en total ", total);
    }
     }
