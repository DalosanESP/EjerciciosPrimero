package Septimo_Solitario;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

public class MazoPalo extends Rectangle implements Mazo{
   ArrayList<Carta> cartas; 
    int palo;
    
    public MazoPalo(int posX){
        super(posX,MazoSecundario.POSICIONY, Carta.ANCHURA, Carta.ALTURA);
        cartas = new ArrayList<Carta>(); 
    }
    public void paint(Graphics g, Applet a){
        g.setColor(Color.black);
        g.drawRect(x, y, width, height);
        for(int i = 0;i < cartas.size(); i++)
            cartas.get(i).paint(g, a);
    }
    public boolean anadir(Carta carta){
        if(cartas.size()==0){//Si la lista esta vacia y es un as, se añade la carta
            if(carta.getValor()==1){
            cartas.add(carta);
            palo = carta.getPalo();//ahora hacemos que todas las cartas que se añadan a continuacion deban ser del mismo palo
            return true;
            }
        }else{
            if((carta.getPalo()== palo)&&(carta.getValor() == cartas.get(cartas.size()-1).getValor()+1)){
                                            //el valor de la ultima carta tiene que ser uno menos que la siguiente
                cartas.add(carta);
                return true;           
            }
        }
        return false;
    }
    public void recolocar(){
        cartas.get(cartas.size()-1).x = x;//(o this.x)//añade la carta seleccionada(la ultima) y cambia el valor x
            //la primera x pertenece a la ultima carta del mazo, la segunda es la x de esta clase
        cartas.get(cartas.size()-1).y = y;
    }
    public Carta ultimaCarta(){
        return cartas.get(cartas.size()-1);//cartassizemenos1 es la ultima carta de la lisa
    }
    public void eliminar(){
        cartas.remove(cartas.size()-1);
    }
}
