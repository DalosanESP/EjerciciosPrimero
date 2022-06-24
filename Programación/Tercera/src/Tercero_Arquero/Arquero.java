package Tercero_Arquero;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class Arquero{
    Image imagen;
    public static final int X = 5;
    private int y;
    public Arquero(Image img){
        imagen = img;
        y = 120;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y - 95; //Para que el cursor este en la punta de la flecha
    }
    
    public void paint(Graphics g, Applet a) {
        g.drawImage(imagen, X,y,200,200,a);
    }   
}