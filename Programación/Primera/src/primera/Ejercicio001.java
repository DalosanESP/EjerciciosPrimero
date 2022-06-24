//los nombres de las clsases se pone en mayusculas.
//Si la clase es publica se puede usar en otro proyecto.
//El nombre de la clase generalmente coincide con el nombre del archivo. 
//Dentro de las clases se definen atributos o variables 
//Main es el nombre del programa que se va a ejecutar
//nombre del metodo y variables en minuscula, sin signos de puntuacion, excepto _ .
//Todos los metodos devuleven algo, si no es asi hay que especificarlo con void a la izquierda del nombre
//despues del metodo se abren parentesis donde se colocan los parametros a la funcion, se separan por comas
//A la derecha el nombre del parametro y a la izquierda el tipo de dato que es.
//String: cadena de caracteres
//variable es un lugar de almacentamiento temporal
//variables acaban en ;
//= es operador de asignacion, lo que hy a la derecha (valor) se mete en la izquierda (asignacion o varible)
// x a la izquierda es un lugar para almacenar, a la derecha es un valor
//a la izquierda del igual no tiene sentido poner un valor
//double es para numeros reales (decimales) 
//varibales sin comillas, string con comillas
package primera;

public class Ejercicio001 {
    public static void main(String arg[]){
     int x;
     int y;
     int resultado;
     x = 55;
     y = 50;
     resultado = x + y;
     System.out.print("El resultado es " + resultado);
     
    }
}
