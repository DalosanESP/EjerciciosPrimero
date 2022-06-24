//calcular el factorial de un numero
package primera;

public class Ejercicio010_factorial {
    public static void main(String arg[]){
       //bucle ascendente 
        int numero = 5;
        int acum = 1;
        for(int cont = 1; cont <=numero; cont++)
            acum*=cont; //esto es igual que poner acum = acum * cont
         System.out.println("El factorial de " + numero + " es " + acum);
         
       //bucle descendente
         acum = 1;
         for(int cont = (numero-1); cont >=1; cont--)
             acum*=cont;
          System.out.println("El factorial de " + numero + " es " + acum);

    }
}
            
       
            
            
            
    

