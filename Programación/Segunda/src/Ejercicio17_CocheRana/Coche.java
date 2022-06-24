package Ejercicio17_CocheRana;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Coche extends Rectangle{
    public static final Color colores[] = {Color.yellow,Color.red, Color.orange, Color.pink, Color.magenta};
    private int velX;
    private int velY;
    Color color;
    public Coche(){
        super(0,0,30,20);
        //if(Math.random() >= .5)
          // velX = (int)(Math.random()*4)+2;
        //else
          // velX = -((int)(Math.random()*4)+2);
        velX= (Math.random() >= .5)?(int)(Math.random()*4)+2: -((int)(Math.random()*4)+2);
        velY= (int)(Math.random()*5)-2;
        x = (velX>0)?-30:500;
        y = (velX>0)?(int)(Math.random()*78)+152:(int)(Math.random()*78)+50;
        //if(Math.random() >= 0)
        //   velX = (int)(Math.random()*78)+152;
        //else
          // velX = -((int)(Math.random()*78)+50);
        color = colores[(int)(Math.random()*colores.length)];   
    }
    public int getVelX() {
        return velX;
    }

    public void setVelX(int velX) {
        this.velX = velX;
    }
    
    public int getVelY() {
        return velY;
    }

    public void setVelY(int velY) {
        this.velY = velY;
    }
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
    public void update(Rectangle r1, Rectangle r2){
        x += velX;
        y += velY;
        if(velX > 0){
            if(r2.contains(this)){
                velY = -velY;
            }
        }else
            if(r1.contains(this)){
                velY = -velY;
            }
    }
}

