package Objetos;

import java.awt.*;

public class Circulo extends Rectangle{
    Color colores [] = {Color.yellow, Color.red, Color.orange, Color.magenta, Color.blue, Color.pink};
    Color color;
    int velx, vely;
    public Circulo(){
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
        if((x < 0) || (x > (500-width)))
            velx = -velx;
        if((y < 0) || (y > (500-height)))
            vely = -vely;
    }
}
