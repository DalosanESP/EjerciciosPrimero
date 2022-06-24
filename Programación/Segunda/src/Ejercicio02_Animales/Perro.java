package Ejercicio02_Animales;

public class Perro extends Animal{
    private String raza;
    boolean peligrosidad;
    
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public Perro(int id, String fn, String nombre, boolean v, String raza, boolean pel){
        super(id, fn, nombre, v);
        this.raza = raza;
        peligrosidad = pel;
    }
    public void mostrar(){
        if(peligrosidad)
        System.out.printf("Hola soy un perro, me llamo %s, soy de raza %s ¡Cuidado conmigo, soy peligroso! : GUAU GUAU\n", getNombre(), raza);
        else
        System.out.printf("Hola soy un perro, me llamo %s, soy de raza %s : GUAU GUAU\n", getNombre(), raza);
    }
}

