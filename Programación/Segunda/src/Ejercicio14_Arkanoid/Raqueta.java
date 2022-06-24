package Ejercicio14_Arkanoid;

import java.awt.Color;
import java.awt.Graphics;

public class Raqueta extends Bloque{
    public static final int VELX = 5;
    
    public Raqueta(){
        super(120, 270,60,10,Color.white);
   }
    public void dibujar(Graphics g){
        g.setColor(color);
        g.fillRect(x, y, width, height);
   }
   public void actualizar(int direccion){
       if(direccion == Arkanoid.IZQUIERDA)
           x -= VELX;
       else
           x +=VELX;
       
       if(x <= 0) 
           x = 0;
       if(x >= 240)
           x=240;
   } 
}


