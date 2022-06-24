package Quinto_Ruleta;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

public class Ruleta extends Applet {
    public static final int NUMFICHAS = 10;
    public static final int FILAS = 12;
    public static final int COLUMNAS = 3;
     public static final int NUM_JUGADAS = 10;
    Image imagen;
    Graphics noseve;
    Image imagenes[];
    ArrayList<Ficha> fichas[];//para hacer una lista de un vector
    int valores [] = {1,5,10,25,50,100,500,1000,5000,10000};
    int rojos[]={1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36};
    Ficha activa;
    Casilla casillas[][];
    ArrayList <Integer> lrojos;
    int numeroSuerte;
    int jugadas[];
    int monedero = 10000;
    int acumulas = 0; //lo que ganas o pierdes en la ultima jugada
    
    public void init(){
        this.resize(1000, 700);
        this.setLayout(new BorderLayout());
        this.add("North",new Button("Jugar!"));
        imagen = this.createImage(1000,700);
        noseve = imagen.getGraphics();
        imagenes = new Image[NUMFICHAS];
        fichas = new ArrayList[NUMFICHAS];
         for(int i=0; i < NUMFICHAS; i++){
                imagenes[i] = getImage(getCodeBase(), "Quinto/Fichas/ficha"+(i+1)+".png");
                fichas[i]= new ArrayList<Ficha>();
                fichas[i].add(new Ficha(imagenes[i],valores[i], (i*(Ficha.DIM+1))+100));
            }
         casillas = new Casilla[FILAS][COLUMNAS];
         lrojos = new ArrayList<Integer>();
            for(int i=0; i < rojos.length; i++)
                lrojos.add(rojos[i]);
            for(int i=0; i < FILAS; i++)
                for(int j=0; j < COLUMNAS; j++)
                    if(lrojos.contains((i*COLUMNAS)+j+1))//pregunta si el resultado de esa formula esta en la lista de rojos, si no pintara de negro
                    casillas[i][j] = new Casilla((j*Casilla.DIM)+30,(i*Casilla.DIM)+30,(i*COLUMNAS)+j+1, Color.RED);
                else
                    casillas[i][j] = new Casilla((j*Casilla.DIM)+30,(i*Casilla.DIM)+30,(i*COLUMNAS)+j+1, Color.BLACK);
                        //los dos primeros parametros son la x y la y, y le sumamos 30 para que tenga margenes
                        //el tercer es la formula para calcular el valor que tendra cada casilla
            jugadas = new int[NUM_JUGADAS];
    }
    
    public void update(Graphics g){
        paint(g);
    }
    
    public void paint(Graphics g){
        noseve.setColor(Color.green);
        noseve.fillRect(0, 0, 1000, 700);
        for(int i=0; i < FILAS; i++)
                for(int j=0; j < COLUMNAS; j++)
                    casillas[i][j].paint(noseve);
        for(int i=0; i<NUMFICHAS;i++)
            for(int j=0; j<fichas[i].size();j++)          
            fichas[i].get(j).paint(noseve,this);
        resultado();
        registro();
        noseve.drawString("Resultado jugada "+acumulas,300,550);
        noseve.drawString("Monedero = "+monedero, 300, 600);
        g.drawImage(imagen,0,0,this);    
    }

    public void registro() {
        for(int i=0; i < NUM_JUGADAS;i++){
            if(lrojos.contains(jugadas[i]))
                noseve.setColor(Color.red);
            else
                noseve.setColor(Color.black);
            noseve.drawString(""+jugadas[i], 900,(i*30)+150);
        }
    }

    public void resultado() {
        String frase = "";
        if(lrojos.contains(numeroSuerte)){
            noseve.setColor(Color.red);
            frase = "ROJO - ";}
        else{
            noseve.setColor(Color.black);
            frase = "NEGRO - ";
        }
        if(numeroSuerte % 2 == 0)
            frase += "PAR - ";
        else
            frase += "IMPAR - ";
        frase+=(numeroSuerte < 18)?"FALTA":"PASA";//ESTO ES COMO UN IF
            
        noseve.drawString(""+numeroSuerte, 400, 100);
        noseve.setColor(Color.black);
        noseve.drawString(frase, 300, 150);
    }
    
    public boolean mouseDown(Event en, int x, int y){
        for(int i=0; i<NUMFICHAS;i++)
            for(int j=0; j<fichas[i].size();j++) 
                if(fichas[i].get(j).contains(x,y)){
                    activa = fichas[i].get(j);//para que la ficha seleccionada pase a ser la ficha activa
                    fichas[i].add(new Ficha(imagenes[i],valores[i], (i*(Ficha.DIM+1))+100));
                    break;
                }
        return true;
    }
    
    public boolean mouseDrag(Event ev, int x, int y){
        if(activa != null){//porque al hacer clic, activa deja de estar vacia por la ficha seleccionada
            activa.update(x, y);
            repaint();
        }
        return true;
    }
    
    public boolean mouseUp(Event ev, int x, int y){
        activa.cargarApostados(casillas);
        activa = null;//para que al levantar el raton, activa pase a null otra vex para poder seleccionar otra ficha
        return true;
    }
    public boolean action(Event ev, Object obj){//esto es para mostrar un numero al azar
        if(ev.target instanceof Button){
            numeroSuerte = (int)(Math.random()*37);
            for(int i = NUM_JUGADAS-1; i > 0; i--)
                jugadas[i] = jugadas[i-1];
            jugadas[0] = numeroSuerte;
            
            jugadas();
            
            repaint();
            return true;
        }
        return false;
    }

    public void jugadas() {
        //Esto es para hacer  las operaciones si ganas o pierdes
        int apuestas = 0;//aqui dices lo que apuestas
        int ganas = 0;
        for(int i = 0; i < fichas.length;i++)
            for(int j=0; j < fichas[i].size();j++){
                if(fichas[i].get(j).numerosApostados.size() !=0)//esto quiere decir que con la ficha seleccionada hemos apostado a un numero
                    apuestas += fichas[i].get(j).valor;
                if(fichas[i].get(j).numerosApostados.contains(numeroSuerte))
                    ganas += 36 * (fichas[i].get(j).valor / fichas[i].get(j).numerosApostados.size());
            }
        acumulas = ganas - apuestas;
        monedero += acumulas;
    }
}