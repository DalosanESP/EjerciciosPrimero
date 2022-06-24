/*
Ley D'Hont
 */
package primera;

public class Ejercicio096_Ley_d_Hont {
    public static void main(String arg[]){
        final int ESCANOS = 7;
        String partidos[] = {"P.P","P.S.O.E", "Podemos","Ciudadanos","VOX"};
        int votos[] = {119421, 157420, 57398, 46645, 91978};
        int cocientes[] = {1, 1, 1, 1, 1};
        
        int posmax;
        for(int i=0; i < ESCANOS; i++){
            posmax = 0;
            for(int j=1; j < votos.length; j++)
                if((votos[j]/cocientes[j]) > (votos[posmax]/cocientes[posmax]))
                    posmax = j;
            cocientes[posmax]++;
        }
        for(int i=0; i<partidos.length;i++)
            System.out.printf("%s ha obtenido %d escaños\n", partidos[i], cocientes[i]-1);
        }
        
    }


