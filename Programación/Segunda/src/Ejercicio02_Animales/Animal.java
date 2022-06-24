package Ejercicio02_Animales;

abstract public class Animal {//abstract es para no crear objetos de esta clase
    int id;
    String fnac;
    private String nombre;
    boolean vacunado;
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nom){
        nombre = nom;
    }
    public Animal(int id, String fn, String nombre, boolean v){
       this.id = id;
       fnac = fn;
       this.nombre = nombre;
       vacunado = v;
        
    }
    abstract void mostrar();//obliga a las subclases a incluir este metodo al ser abstracto
        
    }



