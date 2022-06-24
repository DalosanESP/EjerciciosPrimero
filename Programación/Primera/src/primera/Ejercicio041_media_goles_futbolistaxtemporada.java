/*
Teneis que mostrar por pantalla la media de goles por temporada de cada futbolista
Sin usar un vector auxiliar
 */
package primera;

public class Ejercicio041_media_goles_futbolistaxtemporada {
    public static void main(String arg[]){
        int goles[][] = {{18,19,22,33,20},{22,26,27,18,16},{19,10,11,12},{13,14,15,16}};
        String futbolistas[] = {"Messi","Ronaldo","Suarez","Griezman","Neymar"};
        double acum;
        
        for(int j=0; j < futbolistas.length; j++){
            acum=0;
            for(int i=0; i < goles.length; i++)
               acum += goles[i][j];
            System.out.printf("La media de los goles de %s es de %.1f por temporada\n", futbolistas[j], acum / goles.length);
            
        }
    }
}

            
            
    
        
        
    

