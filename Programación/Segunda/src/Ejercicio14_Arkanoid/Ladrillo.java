
package Ejercicio14_Arkanoid;

import java.awt.Color;
import java.awt.Graphics;

public class Ladrillo extends Bloque{
    
    public Ladrillo(int posx, int posy, int anchura, int altura, Color color){
        super(posx, posy, anchura, altura, color);
    }
    public void dibujar(Graphics g){
        g.setColor(color);
        g.fillRect(x, y, width, height);
        
    }
}
