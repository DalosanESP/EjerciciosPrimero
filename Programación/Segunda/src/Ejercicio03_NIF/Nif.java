
package Ejercicio03_NIF;

public class Nif {
    public int dni;
    public char letra;
    public static char tabla[] = {'T','R','W', 'A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    //static es para declarar constantes, lo contrario a una variable, es decir, no se puede cambiar el contenido
    
    public Nif(int dni, char letra) throws Exception{
        this.dni=dni;
        if(letra != tabla[dni % 23])
            throw new Exception("Me has pasado mal el NIF");
        this.letra = tabla[dni %23];
    }
    public Nif(int dni)throws Exception{
        //this.dni=dni;
        //letra= tabla[dni%23];
     this(dni, tabla[dni%23]);
    }
    public void escribir(){
       System.out.printf("%d - %c", this.dni,this.letra);
    }
}

