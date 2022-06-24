package Quinto_Ruleta;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;

public class Ficha extends Rectangle{
    public static final int DIM = 50;
    Image imagen;
    int valor;
    ArrayList<Integer> numerosApostados;
    
public Ficha(Image img, int v, int posy){
    super(600,posy,DIM, DIM);
    imagen = img;
    valor = v;
    numerosApostados = new ArrayList<Integer>();
}   
    public void paint(Graphics g, Applet a) {
        g.drawImage(imagen, x, y, width, height, a);
        //for(int i=0; i < numerosApostados.size();i++)//Para sacar el valor de cada ficha
       // g.drawString(""+numerosApostados.get(i),x+(i*10),y);
    }   
    public void update(int posx, int posy){ 
        x = posx - (DIM/2);//para coger la ficha por el centro
        y = posy - (DIM/2);
    }
    public void cargarApostados(Casilla[][] casillas){
        this.numerosApostados.clear();//para limpiar la lista y poder hacer una nueva apuesta
        for(int i=0; i < Ruleta.FILAS; i++)
                for(int j=0; j < Ruleta.COLUMNAS; j++)//podemos acceder a columnas y filas pq los atributos son estaticos
                    if(casillas[i][j].intersects(this))
                        this.numerosApostados.add(casillas[i][j].getValor());
        //esto sirve para recorrer todo el bucle y si intersecta con activa guarda su valor para la apuesta
    }
}
