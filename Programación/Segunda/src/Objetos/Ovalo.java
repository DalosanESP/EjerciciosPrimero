package Objetos;

import java.awt.*;

public class Ovalo extends Rectangle{
    Color colores [] = {Color.yellow, Color.red, Color.orange, Color.magenta, Color.blue, Color.pink};
    Color color;
    int velx, vely;
    public Ovalo(){
       super((int) (Math.random() * 250), (int) (Math.random() * 250), 20, 40);
       color = colores[ (int) (Math.random() * colores.length)];
       velx = (int) (Math.random() * 5) + 1;
       vely = (int) (Math.random() * 5) + 1;
    }
    
    public void dibujar(Graphics g){
        
        g.setColor(color);
        g.fillOval(x, y, width, height);
    }
    public void actualizar(){
        x += velx;
        y += vely;
        if((x < 0) || (x > (500-width)))
            velx = -velx;
        if((y < 0) || (y > (500-height)))
            vely = -vely;
    }
}
