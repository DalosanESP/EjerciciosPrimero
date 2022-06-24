package Objetos;

import java.applet.Applet;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Juego extends Applet implements Runnable {
    public static final int NUMCIRCULOS = 4;
    public static final int NUMRECTANGULOS = 4;
    public static final int NUMCUADRADOS = 2;
    public static final int NUMOVALOS = 2;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    List<Circulo> circulos;
    List<Rectangulo> rectangulos;
    List<Cuadrado> cuadrados;
    List<Ovalo> ovalos;
    int velX = 101;
    int velY = 100;
    
    
    public void init(){
        imagen = this.createImage(500,500);
        noseve = imagen.getGraphics();
        circulos = new ArrayList<Circulo>();
        for(int i = 0; i < NUMCIRCULOS; i++){
            circulos.add(new Circulo());
        }
        rectangulos = new ArrayList<Rectangulo>();
        for(int i = 0; i < NUMRECTANGULOS; i++){
            rectangulos.add(new Rectangulo());
        }
        cuadrados = new ArrayList<Cuadrado>();
        for(int i = 0; i < NUMCUADRADOS; i++){
            cuadrados.add(new Cuadrado());
        }
       ovalos = new ArrayList<Ovalo>();
        for(int i = 0; i < NUMOVALOS; i++){
            ovalos.add(new Ovalo());
        }
         
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
       for(int i = 0; i < circulos.size();i++){
            circulos.get(i).dibujar(noseve);
       }
        for(int i = 0; i < rectangulos.size();i++){
            rectangulos.get(i).dibujar(noseve);
        }
         for(int i = 0; i < cuadrados.size();i++){
            cuadrados.get(i).dibujar(noseve);
       }
         for(int i = 0; i < ovalos.size();i++){
            ovalos.get(i).dibujar(noseve);
       }
       g.drawImage(imagen, 0, 0, this);
       
    }
    
    public void run() {
        do{
            for(int i = 0; i < circulos.size(); i++){
                circulos.get(i).actualizar();
            }
            for(int i = 0; i < rectangulos.size(); i++){
                rectangulos.get(i).actualizar();
            }
            for(int i = 0; i < cuadrados.size(); i++){
                cuadrados.get(i).actualizar();
            }
            for(int i = 0; i < ovalos.size(); i++){
                ovalos.get(i).actualizar();
            }
            repaint();
            try {
                Thread.sleep(30);
            } catch (InterruptedException ex) {
                
            }; 
        }while(true);
    }
    public boolean mouseDown(Event ev, int x, int y){
        for(int i = 0; i < circulos.size(); i++){
            if(circulos.get(i).contains(x, y))
               x += velX;
        }
        for(int i = 0; i < rectangulos.size(); i++){
            if(rectangulos.get(i).contains(x, y))
                x += velX;
        }
        for(int i = 0; i < cuadrados.size(); i++){
            if(cuadrados.get(i).contains(x, y))
                x += velX;
        }
        for(int i = 0; i < ovalos.size(); i++){
            if(ovalos.get(i).contains(x, y))
                x += velX;
        }
        return true;
    }
}
