package Tercero_Arquero;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

public class Guillermo extends Applet implements Runnable{
    public static final int TIEMPO = 25;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Image connor;
    Image flechaImg;
    Image[] globosImg;
    Arquero arquero;
    ArrayList<Flecha> flechas;
    ArrayList<Globos> globos;
    int contador = 0;
    public void init(){
        this.resize(700, 500);
        imagen = this.createImage(700,500);
        noseve = imagen.getGraphics();
        connor = this.getImage(this.getCodeBase(), "Tercero/Imagenes/connor.png");
        flechaImg = this.getImage(this.getCodeBase(), "Tercero/Imagenes/flecha.png");
        arquero = new Arquero(connor);
        flechas = new ArrayList<Flecha>();//Lista de flechas
        globosImg = new Image[3];
        for(int i = 0; i < 3; i ++)
            globosImg[i] = this.getImage(this.getCodeBase(), "Tercero/Imagenes/globo"+(i+1)+".png");
        globos = new ArrayList<Globos>();
        globos.add(new Globos(globosImg[(int)(Math.random()*3)]));//Para añadir un globo mas a la lista
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
        noseve.fillRect(0,0,700,500);
        arquero.paint(noseve, this);
        for(int i=0; i < flechas.size();i++)
               flechas.get(i).paint(noseve,this);
        for(int i=0; i < globos.size();i++)
            globos.get(i).paint(noseve, this);//la i se usa para saber a cual elemento de la vista se le aplica e metodo paint
        g.drawImage(imagen,0,0,this);
    }
     public void run(){
        do{
            for(int i=0; i < flechas.size();i++){
               flechas.get(i).update();
               if(flechas.get(i).x > 600)
                   flechas.remove(i);
            }
            
            
             for(int i=0; i < globos.size();i++)
                globos.get(i).update();
             contador += TIEMPO;
             if(contador == 1000){
                 globos.add(new Globos(globosImg[(int)(Math.random()*3)]));
                 contador = 0;
             }
             
             
             for(int i=0; i < flechas.size();i++){
                 for(int j=0; j < globos.size();j++)
                     if(flechas.get(i).intersects(globos.get(j)))
                      globos.remove(j);
              
             }
             repaint();
            try {
                Thread.sleep(TIEMPO);
            } catch (InterruptedException ex) {};
        }while(true);
    }
    public boolean mouseDown(Event ev, int x, int y){
        flechas.add(new Flecha(flechaImg, arquero.getY()+82));//añadimos una nueva flecha cada vez que hacemos clic
        repaint();
        return true;
    }
    public boolean mouseMove(Event ev, int x, int y){
        arquero.setY(y);
        repaint();//para que sea un movimiento constanate
        return true;
    }
}
