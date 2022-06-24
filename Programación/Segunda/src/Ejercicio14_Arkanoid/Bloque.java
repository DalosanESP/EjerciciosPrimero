package Ejercicio14_Arkanoid;

import java.awt.*;


public abstract class Bloque extends Rectangle{//si es abstracta ya no se pueden unstanciar sus atributos
    public static final Color COLORES[] = {Color.yellow, Color.red, Color.orange, Color.pink, Color.blue};
    Color color;
    
    public Bloque(int posx, int posy, int anchura, int altura, Color color){
        super(posx, posy, anchura, altura);
        this.color = color;
    }
    public abstract void dibujar (Graphics g);
        
    
}
