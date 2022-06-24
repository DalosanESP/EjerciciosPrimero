package Septimo_Solitario;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

public class MazoJuego extends Rectangle implements Mazo{
    ArrayList<Carta> cartas;
    public static final int POSICIONY = 200;
    
    public MazoJuego(int posX){
        super(posX, POSICIONY,Carta.ANCHURA, Carta.ALTURA);
        cartas = new ArrayList<Carta>();
    }
    public void paint(Graphics g, Applet a){
        g.setColor(Color.BLACK);
        g.drawRect(x, y, width, height);
        for(int i=0; i < cartas.size();i++)
            cartas.get(i).paint(g, a);
    }
    public boolean anadir(Carta c){
        if(cartas.size() == 0){
            cartas.add(c);
            recolocar();
            return true;
        }else{
            if(c.getColor() != cartas.get(cartas.size()-1).getColor())
                if((c.getValor()+1)==cartas.get(cartas.size()-1).getValor()){
                cartas.add(c);
                recolocar();
                return true;
                }
        }
        return false;
    }
    public void recolocar(){
        ultimaCarta().x = this.x;
        if(cartas.size() == 1)
        cartas.get(cartas.size()-1).y= this.y;
        else
            cartas.get(cartas.size()-1).y = cartas.get(cartas.size()-1).y + 30;
    }
     public void eliminar(){
        cartas.remove(cartas.size()-1);
    }
        public Carta ultimaCarta(){
        return cartas.get(cartas.size()-1);//cartassizemenos1 es la ultima carta de la lisa
    }
}
