package Lluvia;

import java.awt.*;

public class Gota extends Rectangle{
    int velY = 5;
    Color color;
    public Gota(){
        super((int)(Math.random()*300),-10, 5, 15);
    }
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(x, y, width, height);
    }
    public void update(){
        this.y += velY;
        }
}
