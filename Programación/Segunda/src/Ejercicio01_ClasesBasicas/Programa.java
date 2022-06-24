/*

 */
package Ejercicio01_ClasesBasicas;

public class Programa {
    public static void main(String arg[]){
        Persona persona1, persona2, persona3;
        
        persona1 = new Persona();
        persona2 = new Persona("Maria","Dueñas");
        persona3 = new Persona("Camilo", "Cela", 1.70, 120);
        
       persona2 = persona1;
        
        persona1.mostrar();
        persona2.mostrar();
        persona3.mostrar();
    }
}
