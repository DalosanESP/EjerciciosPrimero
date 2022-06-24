package Ejercicio12_MondrianAnimacion;

import java.awt.*;

public class Rectangulo {
    public static final int ARRIBA = 0;
    public static final int ABAJO = 1;
    public static final int IZQUIERDA = 2;
    public static final int DERECHA = 3;
    Color color;
    int posX;
    int posY;
    int anchura;
    int altura;
    int posInicialX, posInicialY, posFinalX, posFinalY;
    int direccion;
    
    public Rectangulo(int px, int py, int an, int al, Color color){//metodo constructor
        posX = px;
        posY = py;
        posInicialX = px;
        posInicialY = py;
        posFinalX = px + 20;
        posFinalY = py + 20;
        anchura = al;
        altura = al;
        this.color = color;
        direccion = DERECHA;
    }
    public void dibujar(Graphics gg){//este metodo suele llamarse paint en vez de dibujar
        gg.setColor(color);
        gg.drawRect(posX, posY, anchura, altura);
    }
    public void actualizar() {
        switch(direccion){
            case ARRIBA:
                posY--;
                if(posY <=posInicialY)
                    direccion = DERECHA;
                break;
            case ABAJO:
                posY++;
                if(posY >= posFinalY)
                    direccion = IZQUIERDA;
                break;
            case IZQUIERDA:
                posX--;
                if(posX <= posInicialX)
                    direccion = ARRIBA;
                break;
            case DERECHA:
                posX++;
                if(posX >= posFinalX)
                    direccion = ABAJO;
        }
    }
}
