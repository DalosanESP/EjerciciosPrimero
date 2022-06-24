package Prueba;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class Juego extends Applet implements Runnable{
    public static final int TIEMPO = 5;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Coche coche;
    List <Obstaculos> obstaculos;
    String mensaje = null;
    int intervalo = 0;
     public void init(){
        this.resize(500, 500);
        imagen = this.createImage(500,500);
        noseve = imagen.getGraphics();
        coche = new Coche();
        obstaculos = new ArrayList<Obstaculos>();
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
        noseve.fillRect(0,0,500,500);
        noseve.fillRect(0,0,500,500);
        noseve.setColor(Color.black);
        noseve.fillRect(100,0,300,500);
        coche.paint(noseve);
         for(int i = 0; i < obstaculos.size(); i++)
            obstaculos.get(i).paint(noseve);
        for(int i = 0; i < obstaculos.size(); i++)
                    if(coche.intersects(obstaculos.get(i))){
            noseve.setColor(Color.yellow);
            noseve.setFont(new Font("TimeRoman",Font.BOLD,20));
            noseve.drawString("GAME OVER", 150, 100);
            animacion.stop();
                    }
        if(mensaje != null){
            noseve.setColor(Color.red);
            noseve.drawString(mensaje, 80, 50);
        }
        
        g.drawImage(imagen, 0, 0, this);
        
    }
    public void run(){
        do{
           for(int i = 0; i < obstaculos.size(); i++)
                obstaculos.get(i).update();
           
           
           intervalo += TIEMPO;
                   if(intervalo >= 2000){
                       intervalo = 0;
                   obstaculos.add(new Obstaculos());
                   }
                  
           
            repaint();
            try {
                Thread.sleep(TIEMPO);
            } catch (InterruptedException ex) {}; 
        }while(true);
    }
    public boolean mouseMove(Event ev, int x, int y){//la x recibe la direccion de donde sale la bala
        coche.actualizar(x);
        return true;
    }
} 