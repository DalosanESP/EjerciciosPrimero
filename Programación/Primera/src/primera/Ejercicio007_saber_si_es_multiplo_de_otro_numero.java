//ENUNCIADO: Mostrar por pantalla si un numero es multipplo de otro o no.
package primera;

public class Ejercicio007_saber_si_es_multiplo_de_otro_numero {
    public static void main(String arg[]){
        int x = 3;
        int y = 21;
        int auxiliar;
   
      if (x < y);{
         auxiliar = y;
         y = x;
         x = auxiliar;
    }
     if((x % y) == 0)
         System.out.println (x +" es multiplo de " +y);
        else
         System.out.println (x +" no es multiplo de " +y);
    }
}

       

