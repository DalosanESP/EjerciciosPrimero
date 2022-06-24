package Tercero_Arquero;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Globos extends Rectangle{
    public static final int VELY = 4;
    Image imagen;
    
    public Globos(Image img){
        super((int)(Math.random()*150)+500, 500,50,80);
        imagen = img;
    }
    
    public void paint(Graphics ddd, Applet a){
        ddd.drawImage(imagen,x,y,width, height, a);
    }
    
    public void update(){
        y -= VELY; 
    }
}