package Noveno;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Casilla extends Rectangle{
    public static final int DIM = 100;
    private Image imagen;
    private Image reverso;
    public boolean descubierta;
    public Casilla(int posX, int posY, Image reverso, Image imagen){
        super(posX, posY, DIM, DIM);
        this.imagen = imagen;
        this.reverso = reverso;
        descubierta = false;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    public boolean isDescubierta() {
        return descubierta;
    }

    public void setDescubierta(boolean descubierta) {
        this.descubierta = descubierta;
    }
    
    public void paint(Graphics g, Applet a){
        if(isDescubierta())
            g.drawImage(imagen,x,y,width,height,a);
        else
            g.drawImage(reverso,x,y,width,height,a);
        
         g.drawRect(x, y, DIM, DIM);
    }
}
