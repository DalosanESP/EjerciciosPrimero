/*
Implementar una funcion que devuelva un entero con el numero de campanadas que
han sonado en el reoj, contando la hora acual (de 1 a 24 pm), a lo largo del dia
 */
package primera;

public class Ejercicio093_contar_campanadas {
        public static void main(String arg[]){
            System.out.println("Numero de campanadas: " + campanadas1(13));
    }
public static int campanadas1(int hora){
  int acum = 0;
  for (int i= 1; 1 <= hora; ++i)
        if(i<=12)
      acum += i;
  else
       acum += (i-12);
  return acum;   
}
public static int campanadas2(int hora){
    if(hora == 1)
        return 1;
    else
        if (hora > 12)
            return(hora - 12) + campanadas2 (hora-1);
    else
            return hora + campanadas2(hora - 1);
}
}

