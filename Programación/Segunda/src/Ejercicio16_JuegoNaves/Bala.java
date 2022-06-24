package Ejercicio16_JuegoNaves;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Bala extends Rectangle{
    public static final int VELY = 5;
    public Bala(int x){//dejamos la x para que el valor se lo de el raton y sea alli de donde salga la bala
       super(x, 450,5,20); 
    }
    
    public void paint(Graphics g){
        g.setColor(Color.blue);
        g.fillOval(x, y, width, height);
        
    }
    public void actualizar(){
    y -= VELY;
            }
        
    }

