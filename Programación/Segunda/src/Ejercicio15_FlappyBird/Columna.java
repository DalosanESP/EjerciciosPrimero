package Ejercicio15_FlappyBird;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Columna {
    private Rectangle r1, r2;

    public Rectangle getR2() {
        return r2;
    }

    public void setR2(Rectangle r2) {
        this.r2 = r2;
    }

    public Rectangle getR1() {
        return r1;
    }

    public void setR1(Rectangle r1) {
        this.r1 = r1;
    }
    
    public Columna(){
        int altura = (int)(Math.random()*150)+50;
        r1 = new Rectangle(300,0,30, altura);
        r2 = new Rectangle(300, altura +50, 30, 300-(altura + 50));
    }
    public void dibujar(Graphics g){//color y dimensiones de la columna
        g.setColor(Color.green);
        g.fillRect(r1.x, r1.y, r1.width, r1.height);
        g.fillRect(r2.x, r2.y, r2.width, r2.height);
    }
    public void actualizar(){//para que la culumna desaparezca
        r1.x -= 1;
        r2.x -= 1;
    }
}
