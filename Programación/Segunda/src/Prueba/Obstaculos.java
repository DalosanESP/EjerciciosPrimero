package Prueba;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Obstaculos extends Rectangle{
    public static final Color COLORES[] = {Color.yellow, Color.green, Color.red, Color.orange, Color.pink, Color.magenta};
    int velY = 5;
    Color color;
    public Obstaculos(){
        super((int)(Math.random()*350),0,50,15);
        color = COLORES[(int)(Math.random()* COLORES.length)];
    }
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
    public void update(){
        this.y += velY;
    }
}

    