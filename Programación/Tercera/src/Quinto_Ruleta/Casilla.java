package Quinto_Ruleta;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Casilla extends Rectangle{
    public static final int DIM = 60;
    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    Color color;
    public Casilla(int x, int y, int v, Color c){
        super(x,y,DIM,DIM);
        valor = v;
        color = c;
    }
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.drawRect(x, y, DIM, DIM);//o with y heigth pq da lo mismo ya que son las dimensiones del cuadrado de Casilla
        g.setFont(new Font("TimesNewRoman", Font.BOLD, 24));
        g.setColor(color);
        g.drawString(""+valor, x + 20, y +40);
        
    }
    
}
