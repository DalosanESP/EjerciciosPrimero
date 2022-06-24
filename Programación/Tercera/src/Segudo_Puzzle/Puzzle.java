package Segudo_Puzzle;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Puzzle extends Applet{
    public static final int TIEMPO = 100;
    public static final int PIEZAS = 25;
    public static final int FILAS = 5;
    Image imagen;
    Graphics noseve;
    Image imagenes[];
    Pieza piezas[];
    Pieza activa;
    Rectangle huecos[][];
    public void init(){
        this.resize(700, 500);
        imagen = this.createImage(700,500);
        noseve = imagen.getGraphics();
        imagenes = new Image[PIEZAS];
        piezas = new Pieza[PIEZAS];
        for(int i=0; i < PIEZAS; i ++){
            imagenes[i] =  this.getImage(this.getCodeBase(), "Segundo/directorioImagenes/" + (i + 1) + ".png");
            piezas[i] = new Pieza(imagenes[i],i);
        }
        huecos = new Rectangle[FILAS][FILAS];
        for(int i = 0; i < FILAS; i++)
            for (int j=0; j < FILAS; j++)
                huecos[i][j] = new Rectangle((Pieza.DIMENSION*j)+10, (Pieza.DIMENSION*i)+50, Pieza.DIMENSION, Pieza.DIMENSION);
    }
  
    public void update(Graphics g){
        paint(g);
    }
    
    public void paint(Graphics g){
        noseve.setColor(Color.orange);
        noseve.fillRect(0,0,700,500);
        noseve.setColor(Color.black);
        for(int i=0; i < FILAS; i ++)
            for(int j=0; j < FILAS; j ++)
                noseve.drawRect(huecos[i][j].x, huecos[i][j].y, huecos[i][j].width,huecos[i][j].height);
        for(int i=0; i < PIEZAS; i ++)
            piezas[i].paint(noseve, this);
        g.drawImage(imagen,0,0,this);
    }
    public boolean mouseDown(Event ev, int x, int y){
        for(int i=0; i < PIEZAS; i ++)
            if(piezas[i].contains(x,y))
                activa = piezas[i];
        return true;
    }
    public boolean mouseDrag(Event ev, int x, int y){
        if(activa != null){
        activa.mover(x, y);
        repaint();
        }
        return true;
    }
    public boolean mouseUp(Event ev, int x, int y){
        for(int i=0; i < PIEZAS; i ++)
            for(int j=0; j < FILAS; j ++)
                if(huecos[i][j].intersects(activa))
                    if(activa.posicion == (i*FILAS)+j){
                        activa.setColocada(true);
                        activa.ajustar(huecos[i][j].x, huecos[i][j].y);
                        repaint();
                    }
        
        activa = null;
        return true;
    }
}