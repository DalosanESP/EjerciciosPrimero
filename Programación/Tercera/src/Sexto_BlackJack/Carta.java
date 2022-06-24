package Sexto_BlackJack;


import java.awt.Image;

public class Carta {
    Image imagen;
    int valor;
    int posx, posy;

    public Carta(Image img, int v){
        imagen = img;
        valor = (v > 10)?10:v;//si v es mayor que 10 le asignas 10 si no el valor de v
    }
    
    public void setPosx(int posx) {
        this.posx = posx;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }
}
