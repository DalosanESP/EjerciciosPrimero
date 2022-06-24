package Ejercicio19_TREX;
import java.applet.Applet;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Juego extends Applet implements Runnable{
    public static final int TIEMPO = 25;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Trex trex;
    List <Obstaculo> obstaculos;
    int tiempoAcumulado = 0;
    boolean fin = false;
  
    public void init(){
        imagen = this.createImage(500,300);
        noseve = imagen.getGraphics();
        trex = new Trex();
        obstaculos = new ArrayList<Obstaculo>();
        obstaculos.add(new Obstaculo());
        
    }
    public void start(){
        animacion = new Thread(this);
        animacion.start();
    }
    public void update(Graphics g){
        paint(g); 
    }
    
    public void paint(Graphics g){
       noseve.setColor(Color.yellow);
       noseve.fillRect(0, 0, 500, 300);
       noseve.setColor(Color.blue);
       noseve.fillRect(0, 0, 500, 250);
       trex.dibujar(noseve);
       for(int i = 0; i < obstaculos.size();i++)
            obstaculos.get(i).dibujar(noseve);
       
       if(fin){
           noseve.setColor(Color.black);
           noseve.setFont(new Font("TimesRoman", Font.BOLD, 24));
           noseve.drawString("Game Over", 100, 150);
       }
       g.drawImage(imagen, 0, 0, this);
       
    }
    
    public void run() {
        do{
            tiempoAcumulado += TIEMPO;
            if(tiempoAcumulado == 2500){
                tiempoAcumulado = 0;
                obstaculos.add(new Obstaculo());
                
            }
            if(obstaculos.get(0).getobstaculo().x < -30){ //si el primer rectangulo pasa de ese parametro, lo eliminamos
                obstaculos.remove(0);
            }
            if(trex.intersects(obstaculos.get(0).getobstaculo())){
                fin = true;
                repaint();
                animacion.stop(); 
            }
            
            trex.actualizar();
            for(int i = 0; i < obstaculos.size();i++)
                obstaculos.get(i).actualizar();
            repaint(); 
            try {
                Thread.sleep(TIEMPO);
            } catch (InterruptedException ex) {
                
            }; 
        }while(true);
    }
    public boolean keyDown(Event ev,int tecla){
        if(tecla == 32){
            trex.y -= 50;
            if(trex.y <= 70){
                trex.y = 50;
            }
        }
        
        return true;
    }
}