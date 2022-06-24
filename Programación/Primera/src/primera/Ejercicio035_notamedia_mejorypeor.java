/*
Alumno con mejores notas y su media y alumno con peores notas y su media
Por otra parte mostrar por pantalla que asignatura tiene las mejores notas y su media,
y cual tiene las peores y su media
 */
package primera;

public class Ejercicio035_notamedia_mejorypeor {
     public static void main(String arg[]){
         int notas[][] = {{7,9,3,8},{10,9,9,8},{9,10,7,1},{3,10,5,6},{8,5,4,5}};
         String alumnos[] = {"Javier Marias","Antonio Muñoz","Isabel Allende","Jose Saramago","Jorge Martinez"};
         String asignaturas[] = {"Programacion","Leng. Marcas","Sistemas","Bases de Datos"};
         double vAlumnosNota[] ={0,0,0,0,0};
         double vAsigNota[] = {0,0,0,0};
         int posMejorAl = 0;
         int posPeorAl= 0;
    
         for(int i=0; i < alumnos.length;i++)
             for(int j=0; j < asignaturas.length; j++)
                 vAlumnosNota[i] += notas[i][j];
         for(int i=0; i < vAlumnosNota.length; i++){
             if(vAlumnosNota[i] > vAlumnosNota[posMejorAl])
                 posMejorAl = i;
             if(vAlumnosNota[i] < vAlumnosNota[posPeorAl])
                 posPeorAl=i;
             }
         System.out.printf("Las mejores notas son de %s, con una media de %.2f\n", alumnos[posMejorAl], vAlumnosNota[posMejorAl] / asignaturas.length);
         System.out.printf("Las peores notas son de %s, con una media de %.2f\n", alumnos[posPeorAl], vAlumnosNota[posPeorAl] / asignaturas.length);
         
         
         for(int j=0; j < asignaturas.length;j++)
             for(int i=0; i < alumnos.length;i++)
                 vAsigNota[j] += notas[i][j];
         int posMejorAs = 0;
         int posPeorAs= 0;
    
         for(int i=0; i < alumnos.length;i++)
             for(int j=0; j < asignaturas.length; j++)
                 vAsigNota[i] += notas[i][j];
         for(int i=0; i < vAsigNota.length; i++){
             if(vAsigNota[i] > vAsigNota[posMejorAs])
                 posMejorAs = i;
             if(vAsigNota[i] < vAsigNota[posPeorAs])
                 posPeorAs=i;
             }
         System.out.printf("Las mejores notas son de %s, con una media de %.2f\n", alumnos[posMejorAs], vAsigNota[posMejorAs] / asignaturas.length);
         System.out.printf("Las peores notas son de %s, con una media de %.2f\n", asignaturas[posPeorAs], vAsigNota[posPeorAs] / asignaturas.length);
         
            

     }
}