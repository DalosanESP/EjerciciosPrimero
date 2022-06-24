package Tercero_Arquero;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Flecha extends Rectangle{
    public static final int VELX = 3;
    Image imagen;
    public Flecha(Image img, int posY){
        super(75,posY,100,20);//posy es variable, indica donde se encuentra el raton para que salga de alii
        imagen = img;
    }
    public void paint(Graphics nsv, Applet a){
        nsv.drawImage(imagen, x, y, width, height, a);
    }
    public void update(){
        x += VELX; 
    }
}