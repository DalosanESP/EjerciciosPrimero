package Prueba;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Coche extends Rectangle{   
    public static final int VEL =15;
    public Coche(){
        super(250, 400,30,50);
   }
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillRect(x, y, width, height);
   }
   public void actualizar(int posx){
       x = posx;
       if(x > 400-width) x = 400-width;
       if(x < 100-width) x = 140-width;
   } 
}