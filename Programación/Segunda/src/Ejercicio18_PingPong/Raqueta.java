package Ejercicio18_PingPong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Raqueta extends Rectangle{
    public static final int VELY = 5;
    Color color;
    private int golesEncajados = 0;

    public Raqueta(int posX, Color color){
        super(posX, 150,5,60);
        this.color = color;
   }
    public int getGolesEncajados() {
        return golesEncajados;
    }

    public void setGolesEncajados() {
        this.golesEncajados ++;
    }
    public void paint(Graphics g){
        g.setColor(Color.white);
        g.fillRect(x, y, width, height);
   }
   public void update(int direccion){
       if(direccion == Juego.ARRIBA)
           y -= VELY;
       else
           y +=VELY;
       
       if(y <= 0) 
           y = 0;
       if(y >= 260)
           y=260;
   } 
}


