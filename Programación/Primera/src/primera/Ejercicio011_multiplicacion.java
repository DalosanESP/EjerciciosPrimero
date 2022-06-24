
package primera;

public class Ejercicio011_multiplicacion {
        public static void main(String arg[]){
        int multiplicando = 7;
        int multiplicador = 5;
        int acum = 0;
        for(int cont = 1; cont <=multiplicador; cont++)
           acum += multiplicando; //esto equivale a acum = acum + multiplicando
        System.out.println("El resultado es: " + acum);
            
       
        }
    
}
