package Ejercicio13_JuegoPelotas;
import java.applet.Applet;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Jugando extends Applet implements Runnable {
    public static final int NUMPELOTAS = 10;
    Thread animacion; //thread es el proceso
    Image imagen;
    Graphics noseve;
    //Pelota pelotas[];
    List<Pelota> pelotas;
    
    
    public void init(){ //Constructor del Applet
        imagen = this.createImage(300,300); //Lo instanciamos, como con el new.
        noseve = imagen.getGraphics(); //nos devuelve la direccion de memoria del objeto graphics que ha creado la clase Image, y la metemos en noseve
        
        /*pelotas = new Pelota[NUMPELOTAS];
        for(int i = 0; i < NUMPELOTAS; i++)
        pelotas[i] = new Pelota();*/
        
        pelotas = new ArrayList<Pelota>();
        for(int i = 0; i < NUMPELOTAS; i++){
            pelotas.add(new Pelota());
        }
         
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
       //for(int i = 0; i < NUMPELOTAS; i++)
           //pelotas[i].dibujar(noseve);
       for(int i = 0; i < pelotas.size();i++)
            pelotas.get(i).dibujar(noseve);
       g.drawImage(imagen, 0, 0, this);
       
    }
    
    public void run() { //obligatorio implementar el metodo run, por la interface runnable
        do{ // pones el do para que se ejecute 1 vez seguro.
            for(int i = 0; i < pelotas.size(); i++)
                pelotas.get(i).actualizar();
                //pelotas[i].actualizar();
            repaint(); //llama al metodo update
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                
            }; 
        }while(true);// infinito
    }
    public boolean mouseDown(Event ev, int x, int y){
        for(int i = 0; i < pelotas.size(); i++){
            if(pelotas.get(i).contains(x, y)) //devuelve una pelota, la que indique el indice // contains, dice que si el click le has dado a la pelota(x,y estan dentro pelota)
                pelotas.remove(i);
        }
        return true;
    }
}
