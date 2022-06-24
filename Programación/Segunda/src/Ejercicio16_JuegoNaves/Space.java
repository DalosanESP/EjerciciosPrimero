package Ejercicio16_JuegoNaves;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

public class Space extends Applet implements Runnable{
    public static final int TIEMPO = 40;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Pistola pistola;
    List<Bala> balas;
    List<Nave> naves;
    int intervalo = 0;
    String mensaje = null;
    
    public void init(){
        this.resize(300, 500);
        imagen = this.createImage(300,500);
        noseve = imagen.getGraphics();
        pistola = new Pistola();
        balas = new ArrayList<Bala>(); 
        naves = new ArrayList<Nave>();//se diferencia de las balas pq no se generan(las naves) cuando ocurra un evento
        for(int i= 0; i< 5; i++)
            naves.add(new Nave());
    }
    public void start(){
        animacion = new Thread(this);
        animacion.start();
    }
    public void update(Graphics g){
        paint(g);
    }
    public void paint(Graphics g){
        noseve.setColor(Color.cyan);
        noseve.fillRect(0,0,300,500);
        pistola.paint(noseve);
        for(int i = 0; i < balas.size(); i++)
            balas.get(i).paint(noseve);
        for(int i = 0; i < naves.size(); i++)
            naves.get(i).paint(noseve);
        if(mensaje != null){
            noseve.setColor(Color.white);
            noseve.drawString(mensaje, 80, 50);
        }
        g.drawImage(imagen, 0, 0, this);
        
    }
    public void run(){
        do{
           for(int i = 0; i < balas.size(); i++)
                balas.get(i).actualizar();
           
           if(balas.size() > 0)
                if(balas.get(0).y<= -20)//para que desaparezca una vez salga de la ventana
                    balas.remove(0);
           for(int i = 0; i < naves.size(); i++)
                naves.get(i).update();
           
           intervalo += TIEMPO;
                   if(intervalo >= 2000){
                       intervalo = 0;
                   naves.add(new Nave());
                   }
            for(int i = 0; i < balas.size(); i++)
                for(int j = 0; j < naves.size(); j++)
                    if(balas.get(i).intersects(naves.get(j))){
                        balas.remove(i);
                        naves.remove(j);
                        break;
                    }
            for(int i = 0; i < naves.size(); i++)
                if(naves.get(i).y >= 500){
                    mensaje = "Has Perdido - Game Over";
                    repaint();
                    animacion.stop();
                }
            if(naves.size() == 0){
                mensaje = "Has ganado - Game Over";
                repaint();
                animacion.stop();
            }
            repaint();
            try {
                Thread.sleep(TIEMPO);
            } catch (InterruptedException ex) {}; 
        }while(true);
    }
    public boolean mouseMove(Event ev, int x, int y){//la x recibe la direccion de donde sale la bala
        pistola.actualizar(x);
        return true;
    }
    public boolean mouseDown(Event ev, int x, int y){//instancias la bala y la añades en la lista
        balas.add(new Bala(x+7));
        return true;
    }
}