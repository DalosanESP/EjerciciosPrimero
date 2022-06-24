package Ejercicio02_Animales;

    public class Canguro extends Animal{
    int salto;
    int velocidad;
    
    public Canguro(int id, String fn, String nombre, boolean v, int salto, int vel){
        super(id, fn, nombre, v);
        this.salto = salto;
        velocidad = vel;
    }
    public void mostrar(){
       System.out.printf("Hola soy un canguro, me llamo %s, salto %d metros : OING OING \n", getNombre(), salto);
    }
}

