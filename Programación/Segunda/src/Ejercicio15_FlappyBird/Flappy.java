package Ejercicio15_FlappyBird;
import Ejercicio14_Arkanoid.*;
import java.applet.Applet;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Flappy extends Applet implements Runnable{
    public static final int TIEMPO = 35;
    Thread animacion; //thread es el proceso
    Image imagen;
    Graphics noseve;
    Pajaro pajaro;
    List<Columna> columnas;
    int tiempoAcumulado = 0;
    boolean fin = false;
    
    
    
    public void init(){ //Constructor del Applet
        imagen = this.createImage(300,300); //Lo instanciamos, como con el new.
        noseve = imagen.getGraphics(); //nos devuelve la direccion de memoria del objeto graphics que ha creado la clase Image, y la metemos en noseve
        pajaro = new Pajaro();
        
        columnas = new ArrayList<Columna>();
        columnas.add(new Columna());
        
    }
    public void start(){ //se instancia el objeto de la clase Thread y se llama al metodo run
        animacion = new Thread(this);
        animacion.start(); //llama al metodo run
    }
    public void update(Graphics g){ //llama al metodo paint
        paint(g); //evitar el parpadeo porque no borra, pero deja rastro del movimiento
    }
    
    public void paint(Graphics g){
       noseve.setColor(Color.black);
       noseve.fillRect(0, 0, 300, 300);
       
       pajaro.dibujar(noseve);
       for(int i = 0; i < columnas.size();i++)
            columnas.get(i).dibujar(noseve);
       
       if(fin /*== true*/){
           noseve.setColor(Color.yellow);
           noseve.setFont(new Font("TimesRoman", Font.BOLD, 24));
           noseve.drawString("Game Over", 100, 150);
       }
       g.drawImage(imagen, 0, 0, this);
       
    }
    
    public void run() { //obligatorio implementar el metodo run, por la interface runnable
        do{ // pones el do para que se ejecute 1 vez seguro.
            tiempoAcumulado += TIEMPO;
            if(tiempoAcumulado == 3500){ //si llega a este tiempo, se reinicia el contador y creas un contador mas.
                tiempoAcumulado = 0;
                columnas.add(new Columna());
            }
            if(columnas.get(0).getR1().x < -30){ //si el primer rectangulo pasa de ese parametro, lo eliminamos
                columnas.remove(0);
            }
            if((pajaro.intersects(columnas.get(0).getR1())) || (pajaro.intersects(columnas.get(0).getR2()))){
                fin = true;
                repaint();
                animacion.stop(); //animacion objeto de la clase thread.
            }
            
            pajaro.actualizar();
            for(int i = 0; i < columnas.size();i++)
                columnas.get(i).actualizar();
            repaint(); //llama al metodo update
            try {
                Thread.sleep(TIEMPO);
            } catch (InterruptedException ex) {
                
            }; 
        }while(true);// infinito
    }
    public boolean keyDown(Event ev,int tecla){//para saltar con el espacio
        if(tecla == 32) // 32 codigo ASCI espacio
            pajaro.y -= 14;
        
        return true;
    }
    /*public boolean mouseDown(Event ev, int x, int y){//para saltar cuando tengas el raton
        pajaro.y -= 15;
        return true;
    }*/
}