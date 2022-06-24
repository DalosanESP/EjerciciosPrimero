package Sexto_BlackJack;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.ArrayList;

public class Mano {
   ArrayList<Carta> cartas;
   int posy;
   public Mano(int py){//Hacemos una lista de cartas para formar la mano
       cartas = new ArrayList<Carta>();
       posy = py;
   }
   
   public void agregar(Carta carta){
       cartas.add(carta);
   }
   
   public void mostrar(Graphics g, Applet a){//para mostrar las cartas que te han tocado
       for(int i = 0; i < cartas.size();i++)
           g.drawImage(cartas.get(i).imagen, (i*30)+300, posy,100,200, a);       
   }
   
   public int puntuacion(){
    int acumulador =0;
    boolean as = false;
    for(int i =0; i < cartas.size();i++){
        acumulador += cartas.get(i).valor;
        if(cartas.get(i).valor==1) as = true;//si la carta es un as
    }
    if((as)&&(acumulador <=11))//y es menor de 11, se usa como 11
        acumulador +=10;
    return acumulador;
    }
   public boolean seHaPasado(){
       return(puntuacion() > 21)?true:false;
   }
   public boolean menor17(){
       return(puntuacion() < 17);
   }
}