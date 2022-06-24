package Ejercicio19_TREX;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Obstaculo {
    private Rectangle obstaculo;

    public Rectangle getobstaculo() {
        return obstaculo;
    }

    public void setobstaculo(Rectangle cactus) {
        this.obstaculo = cactus;
    }
    
    public Obstaculo(){
        int altura = (int)(Math.random()*150)+200;
        obstaculo = new Rectangle(500, altura -40, 20, 300-(altura + 10));
         //r2 = new Rectangle(300, altura +50, 30, 300-(altura + 50));
    }
    public void dibujar(Graphics g){
        g.setColor(Color.green);
        g.fillRect(obstaculo.x, obstaculo.y, obstaculo.width, obstaculo.height);
    }
    public void actualizar(){
        obstaculo.x -= 1;
    }
}
