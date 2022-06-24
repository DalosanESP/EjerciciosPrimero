package Lluvia;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

public class Fondo extends Applet implements Runnable{
    public static final int TIEMPO = 40;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    List<Gota> gotas;
    int intervalo = 0;
    public void init(){
        this.resize(300, 300);
        imagen = this.createImage(300,300);
        noseve = imagen.getGraphics();
       gotas = new ArrayList<Gota>(); 
       for(int i= 0; i< 10; i++)
            gotas.add(new Gota());
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
        noseve.fillRect(0,0,300,500);
         for(int i = 0; i < gotas.size(); i++)
            gotas.get(i).paint(noseve);
        g.drawImage(imagen, 0, 0, this);
        
    }
    public void run(){
        do{
           for(int i = 0; i < gotas.size(); i++){
                gotas.get(i).update();
           if(gotas.size() > 0)
                if(gotas.get(i).y >= 300)
                    gotas.remove(i);
           }
           intervalo += TIEMPO;
                   if(intervalo >= 1){
                       intervalo = 0;
                   gotas.add(new Gota());
                   }
            repaint();
            try {
                Thread.sleep(TIEMPO);
            } catch (InterruptedException ex) {}; 
        }while(true);
    }
}