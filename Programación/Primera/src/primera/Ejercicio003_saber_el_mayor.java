//doble igual para comparar
//! significa negación
//se pueden enlazar if
//si else o if tienen mas de una condicion hay que poner corchetes
//un punto de ruptura es para que se pare de ejecutara el programa en esa linea
//debug sirve para ejecutar el programa paso a paso (control+funcion+shift)
package primera;


public class Ejercicio003_saber_el_mayor {
     public static void main(String arg[]){
         int x= 75;
         int y= 105;
         if(x == y)
             System.out.println("x e y sin iguales y valen: "+ x);
         else if(x > y)
             System.out.println("El mayor es:" + x);
         else
             System.out.println("El mayor es: "+ y);
     }
}
     
     
