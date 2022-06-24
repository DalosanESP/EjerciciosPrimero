
package Ejercicio02_Animales;

public class Sobreanimales {
    public static void main(String arg[]){
        Perro p1, p2;
       p1 = new Perro(10, "10/03/2020", "Toby", true, "Terrier",false);
       p2 = new Perro(12, "10/05/2019", "Sultan", true, "Caniche",true);

       
        Canguro c1;
       c1 = new Canguro (17, "1/08/2004", "Boby", true, 5, 30);
       
       p1.mostrar();
       p2.mostrar();
       c1.mostrar();
       System.out.println("Hola me lamo "+ p1.getNombre() + " soy de raza " + p1.getRaza());
       p1.setRaza("Pastor Alemán");
       System.out.println("Hola me lamo "+ p1.getNombre() + " soy de raza " + p1.getRaza());
    }
    
}
