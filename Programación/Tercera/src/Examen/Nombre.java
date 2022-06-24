package Examen;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;

public class Nombre extends Rectangle{
    public static final int DIM = 75;
    private String nombre;
    int valor;
    Bandera banderas;

   Color color;
    public Nombre(int x, int y, String n, Color c, int v){
        super(x,y,DIM,DIM);
        nombre = n;
        color = c;
        this.valor = valor;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void paint(Graphics g){
        g.setColor(Color.black);
        g.drawRect(x, y, DIM, DIM);
        g.setFont(new Font("TimesNewRoman", Font.BOLD, 10));
        g.setColor(color);
        g.drawString(""+nombre, x + 20, y +40);
        
    }
    public void recolocar(){
        banderas.x = x;
        banderas.y = y;
    }
    
}
