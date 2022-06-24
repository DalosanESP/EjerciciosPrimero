package Septimo_Solitario;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.ArrayList;

public class MazoSecundario implements Mazo{
    
    ArrayList<Carta> cartas = new ArrayList<Carta>();
    public static final int POSICIONX = 110;
    public static final int POSICIONY = 20;
        
    public boolean anadir(Carta carta){ //recibe una carta y la añade a la lista de cartas
        cartas.add(carta);
        recolocar();
        return true;
    }
    public void recolocar(){
        cartas.get(cartas.size()-1).x=POSICIONX;//literalmente es coge la ultima carta de la lista
        cartas.get(cartas.size()-1).y=POSICIONY;
    }
    public void recolocar(Carta activa){
        activa.x = POSICIONX;
        activa.y = POSICIONY;
    }
    public Carta ultimaCarta(){
        return cartas.get(cartas.size()-1);//cartassizemenos1 es la ultima carta de la lisa
    }
    public void eliminar(){
        cartas.remove(cartas.size()-1);
    }
    public void paint(Graphics g, Applet a){
        for(int i = 0; i < cartas.size();++i)
            cartas.get(i).paint(g, a);       
    }
}
