package Septimo_Solitario;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Solitario extends Applet {
    public static final int NUM_PALOS = 4;
    public static final int NUM_CARTAS = 52; 
    public static final int CPP = 13;//Cartas Por Palo
    Image imagen;
    Graphics noseve;
    Image imagenes[];
    Image imgReverso;
    Rectangle reverso;
    Baraja baraja;
    String palos[] = {"_of_clubs.png","_of_diamonds.png","_of_hearts.png","_of_spades.png"};
    MazoSecundario mSecundario;
    Carta activa;//no se instancia poque no es necesario crear una nueva carta
    MazoPalo mPalos[];
    MazoJuego mJuegos[];
    public void init(){
        this.resize(900,700);
        this.setLayout(new BorderLayout());
        imagen = this.createImage(900,700);
        noseve = imagen.getGraphics();
        imagenes = new Image[NUM_CARTAS];
        for(int i = 0; i < palos.length; i++)
            for(int j = 0; j < CPP; j++)
                imagenes[(i*CPP) + j] = this.getImage(this.getCodeBase(), "Sexto/Cartas/" + (j+1) + palos[i]);
        baraja = new Baraja(imagenes);
        imgReverso = getImage(getCodeBase(),"Septimo/Cartas/reverso.png");
        reverso = new Rectangle(20,20,Carta.ANCHURA, Carta.ALTURA);
        mSecundario = new MazoSecundario();
        mPalos = new MazoPalo[NUM_PALOS];
        for(int i=0; i < NUM_PALOS;i++)
            mPalos[i] = new MazoPalo(400 + (i*100));
        mJuegos = new MazoJuego[7];
        for(int i = 0; i < 7;i++)
            mJuegos[i] = new MazoJuego(100+(i*100));//esta formula es el valor x, el cual deja un espacio entre elementos
        imagen = this.createImage(900,700);
        noseve = imagen.getGraphics();
        
    }
    
    public void update(Graphics g){
        paint(g);
    }
    
    public void paint(Graphics g){
        noseve.setColor(Color.green);
        noseve.fillRect(0, 0, 900, 700);
        noseve.drawImage(imgReverso,20,20,Carta.ANCHURA,Carta.ALTURA,this);
        
        for(int i =0; i < NUM_PALOS;i++)
            mPalos[i].paint(noseve, this);
        for(int i =0; i < 7;i++)
            mJuegos[i].paint(noseve, this);
            
        mSecundario.paint(noseve, this);
        g.drawImage(imagen,0,0,this);    
    }
    
    public boolean mouseDown(Event ev, int x, int y){
        if(reverso.contains(x, y)){
            mSecundario.anadir(baraja.sacar());//el metodo añadir espera una carta, la cual se saca del metedo sacar ya que este devuelve una carta
            repaint();
        }
        if(mSecundario.ultimaCarta().contains(x,y))
            activa = mSecundario.ultimaCarta();
        for(int i=0; i < 7;i++)
            if(mJuegos[i].ultimaCarta().contains(x,y))
                activa = mJuegos[i].ultimaCarta();
        return true;
    }
    public boolean mouseDrag(Event ev, int x, int y){
        if(activa != null){//por si no hacemos clic en ninguna carta
        activa.x = x - (Carta.ANCHURA/2); //pasa de ser la x de activa para ser la x que recibe, la que arastra (el - es para centrar el cursor)
        activa.y = y - (Carta.ALTURA/2);
        repaint();
        }
        return true;
    }
    public boolean mouseUp(Event ev, int x, int y){
        boolean encontrado;
        if(activa != null){
            encontrado = false;
            for(int i=0; i < NUM_PALOS;i++)
                if(activa.intersects(mPalos[i])){//mPlos son los rectangulos donde van las cartas
                    if(mPalos[i].anadir(activa)){//al tener la funcion añadir un if, podra agregar o no la carta
                        encontrado = true;
                        mSecundario.eliminar();
                        mPalos[i].recolocar();
                        break;
                    }
                }
            for(int i =0; i < 7; i++)
                if(activa.intersects(mJuegos[i])){
                    if(mJuegos[i].anadir(activa)){
                    mJuegos[i].anadir(activa);
                    mSecundario.eliminar();
                    encontrado = true;
                    break;
                    }
        }
            if(!encontrado) mSecundario.recolocar(activa);//o recolocar(activa) que es el metodo que espera recibir un carta, en este caso, la activa
            activa = null;//para despues del metodo recolocar
            repaint(); 
        }
        return true;
    }
}