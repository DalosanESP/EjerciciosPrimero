package Ejercicio1;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Sprite extends Rectangle{
    private Image imagenes[];
    int cambiar = 0;
    int velx;
    int vely;

    public Sprite(Image imgs[]){
        super((int)(Math.random()*400), (int)(Math.random()*200),60,80);
        imagenes = imgs;
        velx = (int) (Math.random() * 5) + 2;
        vely = (int) (Math.random() * 5) + 2;
    }
    
    public void setImagenes(Image[] imagenes) {
    this.imagenes = imagenes;
    }
       
    public void paint(Graphics g, Applet a){
        g.drawImage(imagenes[cambiar], x,y,width,height,a);
    }
    
    public void actualizar(){
        cambiar = (cambiar+1) % imagenes.length;
        x += velx;
        y += vely;
        if((x < 0) || (x > (500-width)))
            velx = -velx;
        if((y < 0) || (y > (500-height)))
            vely = -vely;
    }
    
}
