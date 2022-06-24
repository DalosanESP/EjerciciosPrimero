package Sexto_BlackJack;

import java.awt.Image;
import java.util.ArrayList;
//import java.util.Collections;

public class Baraja {
ArrayList<Carta> cartas;

    public Baraja(Image imagenes[]){
        cartas = new ArrayList<Carta>();
        for(int i=0; i < BlackJack.NUM_CARTAS; i ++)
            cartas.add(new Carta(imagenes[i], (i % BlackJack.CPP)+1));//si se divide entre 13 el maximo numero sera 12,99, por eso siempre hay que sumar uno mas
        //Collections.shuffle(cartas);
    }
    public Carta sacar(){
        int aleatorio = (int) (Math.random()*cartas.size());//Si no usaremos shuffle, si la usaramos se borraria esta linea
        Carta temporal = cartas.get(aleatorio);// para guardar la carta antes de borrarla de la lista
        cartas.remove(aleatorio);//eliminamos la carta de la lista, pero no de la memoria
        return cartas.get(aleatorio);//Devuelve la carta de la memoria
        }
}
