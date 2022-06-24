package Ejercicio1;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.util.ArrayList;
import java.util.List;

public class Juego extends Applet implements Runnable{
    public static final int TIEMPO = 100;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Image fotogramas[];
    List <Sprite> sprites;
    String mensaje = null;
    Button boton;
    
    public void init(){
        this.resize(500, 500);
        imagen = this.createImage(500,500);
        noseve = imagen.getGraphics();
        fotogramas = new Image[8];
        for(int i = 0; i < 8; i++)
        fotogramas[i] = getImage(getCodeBase(),"Ejercicio1/Sprites/Sprite"+(i+1)+".jpg");
                sprites = new ArrayList<Sprite>();
           //Hago que empiece con uno para que no salga el Game Over nada mas empezar
                 sprites.add(new Sprite(fotogramas));
               
        Panel panel = new Panel();
        boton = new Button("Añadir");
        panel.add(boton);
        this.add("North",panel);
    }
    
    public void start(){
        animacion = new Thread(this);
        animacion.start();
        
    }
    
    public void update(Graphics g){
        paint(g);
    }
    
    public void paint(Graphics g){
        noseve.setColor(Color.orange);
        noseve.fillRect(0,0,500,500);
        for(int i = 0; i < sprites.size(); i ++)
        sprites.get(i).paint(noseve, this);
         if(mensaje != null){
            noseve.setColor(Color.white);
            noseve.drawString(mensaje, 80, 50);
         }
        g.drawImage(imagen,0,0,this);
    }
    
    public void run(){
        do{
            for(int i = 0; i < sprites.size(); i ++)
            sprites.get(i).actualizar();
            
                if(sprites.size() <= 0){
                mensaje = "Game Over";
                repaint();
                animacion.stop();
                }
            repaint();
            try {
                Thread.sleep(TIEMPO);
            } catch (InterruptedException ex) {};
        }while(true);
    }
    
    public boolean mouseDown(Event ev, int x, int y){
        for(int i = 0; i < sprites.size(); i++){
            if(sprites.get(i).contains(x, y))
                sprites.remove(i);
        }
        return true;
    }
    
    public boolean action(Event ev, Object obj){
        if(ev.target instanceof Button){
            if(ev.arg.equals("Añadir")){
             sprites.add(new Sprite(fotogramas));
            }
        }
        return true;
    }
}