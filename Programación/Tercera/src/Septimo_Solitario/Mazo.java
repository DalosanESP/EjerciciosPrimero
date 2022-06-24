package Septimo_Solitario;

import java.applet.Applet;
import java.awt.Graphics;

public interface Mazo {
    public boolean anadir(Carta c);
    public void paint(Graphics g, Applet a);
    public void recolocar();
    public Carta ultimaCarta();
    public void eliminar();
}
