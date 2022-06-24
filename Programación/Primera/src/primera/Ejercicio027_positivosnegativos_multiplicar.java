/*
Modificar la tabla de manera que los numeros que convirtamos los numeros positivos
a negatios y los positivos los multipliquemos por 5
 */
package primera;

public class Ejercicio027_positivosnegativos_multiplicar {
    public static void main(String arg[]){
        int tabla[][]= {{10, 20, -30, -40}, {50, 60, -70, 80}, {90, 100, -110, 120}};
         for(int i = 0; i < tabla.length;i++)
          for(int j = 0; j < tabla[i].length;j++)
              if(tabla[i][j]<0)
                  tabla[i][j] *=-1;
              else 
                  tabla[i][j] *=5;
        for( int i = 0; i < tabla.length; i++){
          for(int j = 0; j < tabla[i].length;j++)
              System.out.print(tabla[i][j]+ ", ");
          System.out.println();
    }
        
    }
}

