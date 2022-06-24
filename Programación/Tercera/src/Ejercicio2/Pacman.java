package Ejercicio2;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

public class Pacman extends Applet implements Runnable{
    public static final int TIEMPO = 50;
    public static final int VIDAS = 3;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    List <Pelota> pelotas;
    ComeCocos comecocos;
    String mensaje = null;
     public void init(){
        this.resize(300, 300);
        imagen = this.createImage(300,300);
        noseve = imagen.getGraphics();
        comecocos = new ComeCocos();
        pelotas = new ArrayList<Pelota>();
        for(int i= 0; i< 20; i++)
          pelotas.add(new Pelota());
    }
     
    public void start(){
        animacion = new Thread(this);
        animacion.start();
    }
    
    public void update(Graphics g){
        paint(g);
    }
    
    public void paint(Graphics g){
        noseve.setColor(Color.black);
        noseve.fillRect(0, 0, 500, 500);
        comecocos.paint(noseve);
        for(int i = 0; i < pelotas.size(); i++)
            pelotas.get(i).paint(noseve);
        
        if(pelotas.size()==0){
            noseve.setColor(Color.blue);
            noseve.setFont(new Font("TimeRoman",Font.BOLD,20));
            noseve.drawString("GAME OVER", 150, 150);
            animacion.stop();
        }
        
        g.drawImage(imagen, 0, 0, this);
        
    }
    public void run(){
        do{
                for(int i = 0; i < pelotas.size(); i++){
                pelotas.get(i).update();
                }
                
                for(int i = 0; i < pelotas.size(); i++){
                if(comecocos.choque(pelotas)){
                    repaint();
                    }
                }
            repaint();
            try {
                Thread.sleep(TIEMPO);
            } catch (InterruptedException ex) {}; 
        }while(true);
    }
    public boolean keyDown(Event ev,int tecla){
        comecocos.update(tecla);
        return true;
    }
} 