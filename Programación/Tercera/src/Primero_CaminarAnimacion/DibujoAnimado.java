package Primero_CaminarAnimacion;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class DibujoAnimado extends Rectangle{
    private Image imagenes[];
    int actual = 0;
    int velx;

    public DibujoAnimado(Image imgs[]){
        super((int)(Math.random()*400), (int)(Math.random()*200),60,80);
        imagenes = imgs;
        velx = (int) (Math.random() * 5) + 2;
    }
    
    public void setImagenes(Image[] imagenes) {
    this.imagenes = imagenes;
    }
       
    public void paint(Graphics g, Applet a){
        g.drawImage(imagenes[actual], x,y,width,height,a);
    }
    
    public void actualizar(){
        actual = (actual+1) % imagenes.length; //para que las imagenes hagan el efeccto de correr
         x += velx;
         if (x > 1000-x) x = -100; //en realidad esto es 500, pero por algun motivo hace como si fuera menos
            
    }
}
