package Ejercicio18_PingPong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Pelota extends Rectangle{
    public int velX = 3;
    public int velY = 2;
    public Pelota(){
       super(15, 150, 10, 10); 
       int diametro = 5;
    }
    
    public void paint(Graphics gg){
        
        gg.setColor(Color.white);
        gg.fillOval(x, y, width, height);
        
    }
    public void update(Raqueta r1, Raqueta r2){
        x += velX;
        y += velY;
        
        if((y <= 0)||(y >=296))
            velY = -velY;
        if(x< -100){
            x=15;
            velX = -velX;
            y = r1.y + 18;
            r1.setGolesEncajados();
        }
        if(x > 600){
            x = 485;
            velX = -velX;
            y = r2.y + 18;
            r2.setGolesEncajados();
        }
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
        
    }
