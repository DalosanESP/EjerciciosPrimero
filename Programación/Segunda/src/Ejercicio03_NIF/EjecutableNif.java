//cuando se produce una excepcion ya no se ejecuta el programa, por eso tenemos 
//que tratarla, y lo hacemos con try and catch, diciendole el tipo de excepcion
//que se produce y dandole una salida a dicho error para que el programa continue
package Ejercicio03_NIF;

public class EjecutableNif {
    public static void main(String arg[])throws Exception{
        Nif persona1, persona2;
        try{
           int a = 7/0; 
           System.out.println();
        }catch(ArithmeticException ex){
            System.out.println("Has dividido por cero");
        }
        System.out.println("Continua la ejecucion");  
        
        persona1 = new Nif(73159571);
        persona2 = new Nif(32323232);
        
        persona2.escribir();
        persona1.escribir();
    }
}
