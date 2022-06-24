
package Ejercicio16_JuegoNaves;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Pistola extends Rectangle{
    
    public Pistola(){
        super(150, 470,15,25);
   }
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.fillRect(x, y, width, height);
   }
   public void actualizar(int posx){
       x = posx;
       if(x > 300-width) x = 300-width;
   } 
}