package Segudo_Puzzle;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Pieza extends Rectangle{
    public static final int DIMENSION = 60;
    Image imagen;
    int posicion;
    private boolean colocada = false;

    public Pieza(Image img, int posicion){
        super((int)(Math.random()*250)+400,(int)(Math.random()*440), 60, 60);
        imagen = img;
        this.posicion = posicion;
    }
    public boolean isColocada() {
        return colocada;
    }

    public void setColocada(boolean colocada) {
        this.colocada = colocada;
    }
    public void paint(Graphics g, Applet a){
        g.drawImage(imagen,x, y, width,height, a);
    }
    public void mover(int posx, int posy){
        if(!isColocada()){
        x = posx - (DIMENSION /2);
        y = posy - (DIMENSION /2);
        }
    }
    public void ajustar(int posx, int posy){
        x = posx;
        y = posy;
    }
}
