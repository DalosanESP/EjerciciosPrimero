package Ejercicio14_Arkanoid;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;



public class Pelota extends Bloque{
    int velx, vely;
    public Pelota(){
       super(150, 200, 9, 9, Color.white); 
       int diametro = (int)(Math.random()*25)+10;
       velx = -3;
       vely = -2;
    }
    
    public void dibujar(Graphics g){
        
        g.setColor(color);
        g.fillOval(x, y, width, height);
        
    }
    public void actualizar(Raqueta raqueta, List<Ladrillo>ladrillos){
        x += velx;
        y += vely;
          if((x < 0) || (x > (300-width)))
            velx = -velx;
        if((y < 0) || (y > (300-height)))
            vely = -vely;
        
        for(int i=0; i < ladrillos.size(); i++)
            if(ladrillos.get(i).intersects(this)){
                vely = -vely;
                ladrillos.remove(i);
                break;
            }
        if(this.intersects(raqueta))
            velx += -velx;
    }
}
