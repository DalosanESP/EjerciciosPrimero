//operacion matematica de elevar a x numero dividio or otro elvado a otro numero
//en printf, si estamos entre las comiilas y ponemos %d, nos saldra decimal
package primera;

public class Ejercicio012_operacion_matematica_rara {
        public static void main(String arg[]){
        int elementos = 7;
        int tomados = 4;
        int acumulador = 1;
        for(int cont = elementos; cont > tomados;cont--)
            acumulador *= cont;//acum = acum * cont
        System.out.println("Variaciones de "+elementos+" elementos de "+tomados+" en "+tomados+" es "+acumulador);
        System.out.printf("Variaciones de %d elementos tomados de %d en %d es %d ", elementos, tomados, tomados, acumulador );
       
            
        }
}
