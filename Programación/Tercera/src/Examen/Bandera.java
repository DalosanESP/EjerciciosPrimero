package Examen;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;

public class Bandera extends Rectangle{
    public static final int DIM = 75;
    private Image imagen;
    private boolean colocada = false;
    int posicion;
    int valor;
    
    public Bandera(int posX, int posY, Image imagen, int v){
        super(posX, posY, DIM, DIM);
        this.imagen = imagen;
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }
    
    public boolean isColocada() {
        return colocada;
    }

    public void setColocada(boolean colocada) {
        this.colocada = colocada;
    }
    
     public void mover(int posx, int posy){
        if(!isColocada()){
        x = posx - (DIM /2);
        y = posy - (DIM /2);
        }
    }
     
     public void ajustar(int posx, int posy){
        this.x = posx;
        this.y = posy;
    }
    
    public void paint(Graphics g, Applet a){
         g.drawImage(imagen,x,y,width,height,a);
         g.drawRect(x, y, DIM, DIM);
    }
}

