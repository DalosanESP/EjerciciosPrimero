package Ejercicio19_TREX;
import java.awt.*;

public class Trex extends Rectangle{
    int velY;
    public Trex(){
        super(30,210,15,40);
        velY = 1;
    }
    
    public void dibujar(Graphics g){
        g.setColor(Color.orange);
        g.fillRect(x, y, width, height);
        
    }
    
    public void actualizar(){
        y += velY;
        if(y == 211)
            y = 210;
    }
    
}
