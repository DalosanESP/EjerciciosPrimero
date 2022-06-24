package Septimo_Solitario;

import java.awt.Image;
import java.util.ArrayList;

public class Baraja {
    ArrayList<Carta> cartas;
    
    public Baraja(Image imagenes[]){
        cartas = new ArrayList();
        for(int i = 0; i < Solitario.NUM_CARTAS; i++) // imagenes.length;?
            //si me quedo con el resto de la division, me queda entre 0 y 12.
            // si me quedo con el cociende de la division me quedara valores entre, 0 y 3, que son los numeros de los palos.
            // 0 y 3 son negros porque asi lo hemos definido en la Clase Solitario en el vector de String palos, que el primero es negro y el ultimo.
            cartas.add(new Carta(imagenes[i],(i % Solitario.CPP) + 1, ((i/Solitario.CPP) == 0 || (i/Solitario.CPP)==3)?Carta.NEGRO:Carta.ROJO, (i/Solitario.CPP)));
        //Collections.shuffle(cartas);
            ;
    }
    public Carta sacar(){ //devuelve una Carta.
        int aleatorio = (int)(Math.random() * cartas.size());
        Carta temporal = cartas.get(aleatorio);// temporal es un objeto, no una variable
        cartas.remove(aleatorio); // para que no sea la misma carta que la anterior cuando se ejecute.
        return temporal;
    }
}
