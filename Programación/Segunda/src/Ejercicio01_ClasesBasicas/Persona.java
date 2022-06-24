package Ejercicio01_ClasesBasicas;


public class Persona {
    String nombre;
    public String apellido;
    public double altura;
    public double peso;
    
    public Persona(){
        nombre = "Pepe";
        apellido = "Lopez";
        altura = 1.76;
        peso = 89;
        
    }
    public Persona(String nom, String ape){
        nombre = nom;
        apellido = ape;
        altura = 1.70;
        peso = 70;
    }
    public Persona(String nom, String ape, double altura, double peso){
        nombre = nom;
        apellido = ape;
        this.altura = altura;
        this.peso = peso;
    }
    public void mostrar(){
        System.out.println(this.nombre + " " + apellido + " (" + altura + "), (" + peso + ") ");
    }   
}
