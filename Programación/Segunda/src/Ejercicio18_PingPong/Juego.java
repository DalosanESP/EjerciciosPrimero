package Ejercicio18_PingPong;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

public class Juego extends Applet implements Runnable{
    public static final int ARRIBA = 5;
    public static final int ABAJO= -5;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Pelota pelota;
    Raqueta r1, r2;
    
     public void init(){
        this.resize(500, 300);
        imagen = this.createImage(500,300);
        noseve = imagen.getGraphics();
        r1 = new Raqueta(10, Color.red);
        r2 = new Raqueta (485, Color.black);
        pelota = new Pelota();
        
    }
    public void start(){
        animacion = new Thread(this);
        animacion.start();
    }
    public void update(Graphics g){
        paint(g);
    }
    public void paint(Graphics g){
        noseve.setColor(Color.green);
        noseve.fillRect(0,0,500,300);
        noseve.setColor(Color.black);
        noseve.setColor(Color.white);
        noseve.setFont(new Font("TimesRoman", Font.BOLD, 40));
        noseve.drawString(r2.getGolesEncajados() + " - " + r1.getGolesEncajados(), 220, 20);
        r1.paint(noseve);
        r2.paint(noseve);
        pelota.paint(noseve);
       
        
        g.drawImage(imagen, 0, 0, this);
        
    }
    public void run(){
        do{
            pelota.update(r1,r2);
            if((pelota.intersects(r1))||(pelota.intersects(r2)))
                pelota.setVelX(-pelota.getVelX());
            repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {}; 
        }while(true);
    }
    public boolean keyDown(Event ev,int tecla){
        if(tecla == 113) //tecla q
           r1.update(ARRIBA);
        if(tecla == 97)//tecla a
           r1.update(ABAJO);
          if(tecla == 112) //tecla p
           r2.update(ARRIBA);
        if(tecla == 241)//tecla ñ
           r2.update(ABAJO);
        
        return true;
    }
} 