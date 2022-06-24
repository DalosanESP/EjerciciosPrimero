package Ejercicio14_Arkanoid;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
public class Arkanoid extends Applet implements Runnable{
    public static final int FILAS = 5;
    public static final int COLUMNAS = 10;
    public static final int IZQUIERDA = 0;
    public static final int DERECHA = 1;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    List <Ladrillo> ladrillos;
    Raqueta raqueta;
    Pelota pelota;
    public void init(){
        imagen = this.createImage(300,300);
        noseve = imagen.getGraphics();
        ladrillos = new ArrayList<Ladrillo>();
        for(int i=0;i < FILAS;i++)
            for(int j=0; j < COLUMNAS; j++)
                ladrillos.add(new Ladrillo((30*j)+1, (12*i)+10, 28, 10, Bloque.COLORES[i]));
        raqueta = new Raqueta();
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
        noseve.setColor(Color.black);
        noseve.fillRect(0,0,300,300);
        for(int i=0;i < ladrillos.size();i++)
            ladrillos.get(i).dibujar(noseve);
        raqueta.dibujar(noseve);
        pelota.dibujar(noseve);
        g.drawImage(imagen, 0, 0, this);
        
    }
    public void run(){
        do{
            pelota.actualizar(raqueta, ladrillos);
            repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                
            }; 
        }while(true);
    }
    public boolean keyDown(Event ev, int tecla){
        if (tecla == 1006) raqueta.actualizar(IZQUIERDA);
        if (tecla == 1007) raqueta.actualizar(DERECHA);
            
        return true;
    }
}
            
        
    
    

