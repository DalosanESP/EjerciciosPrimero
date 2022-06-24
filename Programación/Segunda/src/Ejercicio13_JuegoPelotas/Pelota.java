package Ejercicio13_JuegoPelotas;

import java.awt.*;

public class Pelota extends Rectangle{
    Color colores [] = {Color.yellow, Color.red, Color.orange, Color.magenta, Color.blue, Color.pink};
    Color color;
    int velx, vely;
    public Pelota(){
       super((int) (Math.random() * 250), (int) (Math.random() * 250), 0, (int) (Math.random() * 250 + 15)); 
       int diametro = (int)(Math.random()*25)+10;
       width = height = diametro;
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
        if((x < 0) || (x > (300-width)))
            velx = -velx;
        if((y < 0) || (y > (300-height)))
            vely = -vely;
    }
}
