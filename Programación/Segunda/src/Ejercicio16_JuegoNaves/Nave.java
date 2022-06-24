package Ejercicio16_JuegoNaves;

import java.awt.*;

public class Nave extends Rectangle{
    public static final Color COLORES[] = {Color.yellow, Color.green, Color.red, Color.orange, Color.pink, Color.magenta};
    public static final int ANCHURA = 25;
    public static final int ALTURA = 15;
    int velX = (int)(Math.random()*11)-5; // valores entre -5 y 5;
    int velY = (int)(Math.random()*5)+1;
    Color color;
    public Nave(){
        super((int)(Math.random()*250), (int)(Math.random()*100), ANCHURA, ALTURA);
        color = COLORES[(int)(Math.random()* COLORES.length)];
    }
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
    public void update(){
        this.y += velY;
        this.x += velX;
        if(x <= 0 || (x >= 300-ANCHURA)){
            velX = -velX;
        }
    }
}

    