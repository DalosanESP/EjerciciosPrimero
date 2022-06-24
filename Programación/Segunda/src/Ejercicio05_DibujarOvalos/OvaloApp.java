package Ejercicio05_DibujarOvalos;
import java.awt.Frame;
import java.awt.Event;
import java.awt.Button;
import java.awt.Panel;
import java.awt.Graphics;
public class OvaloApp extends Frame{
    Ovalo ovalo;
   
    public static void main (String args []){
      OvaloApp app = new OvaloApp();  
    }
    public OvaloApp(){
       super("Dibujando Ovalos");
       
       ovalo = new Ovalo();
       
       
       Button boton1 = new Button("Siguiente");
       Button boton2 = new Button("Salir");
       this.add("South", boton1);
       this.add("South", boton2);
       Panel panel = new Panel();
       panel.add(boton1);
       panel.add(boton2);
       this.add("South", panel);
       this.pack();
       this.resize(300,300);
       this.show();
    }
    public void update(Graphics g){//esto se utiliza para no borrar los ovalos
        paint(g);
    }
    
    public void paint(Graphics g){
        ovalo.dibujar(g);
    }
            
    public boolean handleEvent(Event ev){
       if(ev.id == Event.WINDOW_DESTROY){
           System.exit(0);
           return true;
       }else if (ev.id == Event.ACTION_EVENT){
           if(ev.target instanceof Button){//target nos dice sobre que clase de objeto se produce el evento
               if(ev.arg.equals("Salir")){
                    System.exit(0);
                    return true;
               } else if(ev.arg.equals("Siguiente")){
                   ovalo.inicializar();
                   repaint();
                   return true;
               }
           }
        }
       return false; 
    }
}
