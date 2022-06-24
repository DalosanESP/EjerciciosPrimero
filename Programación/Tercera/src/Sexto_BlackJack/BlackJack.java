package Sexto_BlackJack;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class BlackJack extends Applet {
    public static final int NUM_CARTAS = 52;
    public static final int CPP = 13;//Cartas Por Palo
    Image imagen;
    Graphics noseve;
    Image imagenes[];
    String palos[] = {"_of_clubs.png","_of_diamonds.png","_of_hearts.png","_of_spades.png"};
    Baraja baraja;
    Mano jugador;
    Mano crouppier;
    TextField apuesta;
    Button boton1;
    Button boton2;
  
    public void init(){
        this.resize(1000,700);
        this.setLayout(new BorderLayout());
        imagen = this.createImage(1000,700);
        noseve = imagen.getGraphics();
        imagenes = new Image[NUM_CARTAS];
        for(int i = 0; i < palos.length; i++)
            for(int j = 0; j < CPP; j++)
                imagenes[(i*CPP) + j] = this.getImage(this.getCodeBase(), "Sexto/Cartas/" + (j+1) + palos[i]);
        baraja = new Baraja(imagenes);
        jugador = new Mano(400);
        crouppier = new Mano(100);
        Label etiqueta = new Label("Introduce tu apuesta : ", Label.RIGHT);
        apuesta = new TextField("",10);//10 es el numero de caracteres
        
        Panel panel1 = new Panel();
        panel1.add(etiqueta);
        panel1.add(apuesta);
        this.add("North",panel1);
        
        Panel panel2 = new Panel();
        boton1 = new Button("Carta");
        boton2 = new Button("Me planto");
        panel2.add(boton1);
        panel2.add(boton2);
        this.add("South",panel2);
        
        imagen = this.createImage(1000,700);
        noseve = imagen.getGraphics();
        
    }
    
    public void update(Graphics g){
        paint(g);
    }
    
    public void paint(Graphics g){
        noseve.setColor(Color.green);
        noseve.fillRect(0, 0, 1000, 700);
        jugador.mostrar(noseve, this);
        crouppier.mostrar(noseve, this);
        g.drawImage(imagen,0,0,this);    
    }

    
    public boolean action(Event ev, Object obj){
        if(ev.target instanceof TextField){
           apuesta.setEditable(false);//Para no poder modificar el textfield (la apuesta) despues del enter
            jugador.agregar(baraja.sacar());//primero sacamos la carta y despues la agreamos
            jugador.agregar(baraja.sacar());
            crouppier.agregar(baraja.sacar());
            repaint();
            return true;
        }else if(ev.target instanceof Button){
            if(ev.arg.equals("Carta")){
                 jugador.agregar(baraja.sacar());
                 repaint();
                 if(jugador.seHaPasado())
                     juegaElCrouppier();
                 return true;
            }else if(ev.arg.equals("Me Planto")){
                    juegaElCrouppier();
                    return true;
            }
        }
        return false;
    }
    public void juegaElCrouppier(){
        while(crouppier.menor17())
            crouppier.agregar(baraja.sacar());
        repaint();
}
}