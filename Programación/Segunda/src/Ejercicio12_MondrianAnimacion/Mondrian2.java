package Ejercicio12_MondrianAnimacion;
import java.applet.Applet;
import java.awt.*;
public class Mondrian2 extends Applet implements Runnable{
    Image imagen;
    Thread animacion;
    Graphics noseve;
    Rectangulo rectangulos[];
    int posicionesX[]={0,250,80,80,100,80,200,0,200};
    int posicionesY[]={0,0,160,220,10,100,0,0,55};
    int anchura[]={90,40,100,220,90,110,45,70,60};
    int altura[]={90,190,120,90,80,90,45,200,135};
    Color colores[] = {Color.yellow, Color.yellow,Color.yellow, Color.blue, Color.blue ,Color.lightGray, Color.red, Color.red, Color.magenta};
    
    
    public void init(){
        imagen = this.createImage(300,300);
        noseve = imagen.getGraphics();
        rectangulos = new Rectangulo[9];
        for(int i=0; i < rectangulos.length;i++)
            rectangulos[i]=new Rectangulo(posicionesX[i], posicionesY[i], anchura[i], altura[i],colores[i]);
            
    }
    public void start(){
        animacion = new Thread(this);
        animacion.start();//El metodo start es el que llama al metodo run
    }
    
    public void update(Graphics g){
        paint(g);
    }
    
     public void paint(Graphics g){
         noseve.setColor(Color.black);
         noseve.fillRect(0,0,300,300);
        for(int i=0; i < rectangulos.length;i++)
            rectangulos[i].dibujar(noseve);//evitar el parpadeo
        g.drawImage(imagen, 0, 0, this);
    }
    
    public void run(){
        do{
            //for(int i=0; i < rectangulos.length;i++)esto sirve para
               // rectangulos[i].actualizar();moverlos todos a la vez
            rectangulos[5].actualizar();//si cambiamos el numero cambia el rectangulo que se mueve
            repaint();
            try{
            Thread.sleep(10);
            }catch(InterruptedException e){};
        }while(true);
    }
    public boolean handleEvent(Event ev){
        if(ev.id == Event.WINDOW_DESTROY){
            System.exit(0);
            return true;
        }
        return false;
    }
}

