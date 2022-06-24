package Ejercicio2;

import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.List;

public class ComeCocos extends Rectangle{   
    public static final int VEL =5;
    public static final int ARRIBA = 0;
    public static final int ABAJO = 1;
    public static final int IZQUIERDA = 2;
    public static final int DERECHA = 3;
    public ComeCocos(){
        super(250, 270,20,30);
   }
    
    public void paint(Graphics g){
        g.setColor(Color.yellow);
        g.fillRect(x, y, width, height);
   }
    
   public boolean choque(List<Pelota> lista){
       for(int i =0; i < lista.size();i++)
           if(this.intersects(lista.get(i))){
               lista.remove(i);
               return true;
           }
       return false;
   }
   
   public void update(int tecla){
       switch (tecla){
           case Event.UP:
               y -=VEL;
               break;
           case Event.DOWN:
               y +=VEL;
               break;
           case Event.LEFT:
               x -=VEL;
               break;
           case Event.RIGHT:
               x +=VEL;
            } 
        }
}