
package Ejercicio15_FlappyBird;

import java.awt.*;

public class Pajaro extends Rectangle{
    int velY;
     
    public Pajaro(){
        super(20,20,15,15);
        velY = 2;
    }
    
    public void dibujar(Graphics g){// color y dimensiones del pajaro, que es un rectangulo
        g.setColor(Color.white);
        g.fillRect(x, y, width, height);
        
    }
    
    public void actualizar(){// caida del pajaro
        y += velY;
    }
    
}
