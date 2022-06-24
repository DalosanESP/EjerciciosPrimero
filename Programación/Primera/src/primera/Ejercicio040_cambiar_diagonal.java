/*
Sobre una misma tabla, intercaxmbiar los elementos de la diagonal principal por
los de la diagonal contraria
 */
package primera;

public class Ejercicio040_cambiar_diagonal {
    public static void main(String arg[]){
        int tabla1[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int inter;
        
         for(int i=0; i < tabla1.length;i++){
                inter = tabla1[i][i];
                tabla1[i][i] = tabla1[i][tabla1.length - i - 1];
                tabla1[i][tabla1.length - i - 1]=inter;
            }
         for(int i=0; i < tabla1.length;i++){
            for(int j=0; j < tabla1[i].length; j++)
                System.out.print(tabla1[i][j] + " ");
                 System.out.println();
    }
}
     
}
