package Octavo_Buscaminas;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Casilla extends Rectangle{
    public static final int TAM = 17; //lo que ocupa el rectangulo
    private Image mina;
    Image reverso;
    private boolean tapada;
    private int alrededor;
    
    public Casilla(int posX, int posY, Image rev){
        super(posX, posY, TAM, TAM);
        //no es necesario ponerlo pero mina = null
        reverso = rev;
        tapada = true;
        alrededor = 0;//pq inicialmente no tiene casillas al lado
    }

    public Image getMina() {
        return mina;
    }

    public void setMina(Image mina) {
        this.mina = mina;
    }

    public boolean isTapada() {
        return tapada;
    }

    public void setTapada(boolean tapada) {
        this.tapada = tapada;
    }

    public int getAlrededor() {
        return alrededor;
    }

    public void setAlrededor(int alrededor) {
        this.alrededor = alrededor;
    }
    
    public void paint(Graphics g, Applet a){
        g.drawImage(mina, x, y,TAM,TAM,a);
        if((mina == null)&&(alrededor !=0))g.drawString(""+alrededor, x+5, y+TAM-5);
        if(isTapada())g.drawImage(reverso, x, y, a);
        g.drawRect(x, y, TAM, TAM);
    }
}
