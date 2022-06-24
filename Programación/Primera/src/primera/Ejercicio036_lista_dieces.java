/*
Mostrar por patanalla listado de dieces
 */
package primera;

public class Ejercicio036_lista_dieces {
     public static void main(String arg[]){
         int notas[][] = {{7,9,3,8},{10,9,9,8},{9,10,7,1},{3,10,5,6},{8,5,4,5}};
         String alumnos[] = {"Javier Marias","Antonio Muñoz","Isabel Allende","Jose Saramago","Jorge Martinez"};
         String asignaturas[] = {"Programacion","Leng. Marcas","Sistemas","Bases de Datos"};
         
         System.out.println("Listado de DIECES: ");
         
         for(int i=0; i < alumnos.length;i++)
             for(int j=0; j < asignaturas.length; j++)
                 if(notas[i][j] == 10)
                     System.out.printf("%s en %s\n", alumnos[i], asignaturas[j]);
         
         
     }
    
}
