package Ejercicio2;

import java.awt.*;

public class Pelota extends Rectangle{
    public static final int VEL = 10;
    Color colores [] = {Color.yellow, Color.red, Color.orange, Color.magenta, Color.blue, Color.pink};
    Color color;
    int velx, vely;
    public Pelota(){
       super((int) (Math.random() * 250), (int) (Math.random() * 250), 0, (int) (Math.random() * 250 + 15));
       width = height = 10;
       color = colores[ (int) (Math.random() * colores.length)];
       velx = VEL;
       vely = VEL;
    }
    
    public void paint(Graphics g){
        g.setColor(color);
        g.fillOval(x, y, width, height);
    }
    
    public void update(){
        x += velx;
        y += vely;
        if((x < 0) || (x > (300-width)))
            velx = -velx;
        if((y < 0) || (y > (300-height)))
            vely = -vely;
    }
}