package Examen;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.net.MalformedURLException;
import java.net.URL;

public class Examen extends Applet{ 
    public static final int FILAS = 4;
    public static final int COLUMNAS = 4;
    Graphics noseve;
    Image imagen;
    Image imgReverso;
    Image imagenes[];
    Bandera banderas[][];
    Nombre nombre[][];
    String nombres[] = {"Portugal","Irlanda","Rumania","Finlandia","Belgica","Alemania","R.U.","Grecia","Ucrania","Polonia","Francia","Suiza","Croacia","Rep.Checa","Austria","España"};
    Bandera activa;
    Rectangle tablaBanderas[][];
    
    AudioClip error, correct, exito;
    /*
    Thread animacion;
    int temporal;
    int cuentaSegundos =0;
    Bandera cUno, cDos;
    */
    public void init(){
       
        this.resize(900,700);
        this.setLayout(new BorderLayout());
         /*
        imagen = this.createImage(900,700);
        noseve = imagen.getGraphics();
        */
         imagenes = new Image[16];
         for(int i = 0; i < 16; i++)
             imagenes[i] = getImage(getCodeBase(),"Examen/Banderas/pais"+(i+1)+".jpg");
         
        banderas = new Bandera[COLUMNAS][FILAS];
        for(int i=0; i < COLUMNAS; i++)
            for (int j = 0; j < FILAS; j++)
                banderas[i][j] = new Bandera(100+(j*Bandera.DIM),100+(i*Bandera.DIM), imagenes[((i*4)+j)],((i*4)+j+1));
         nombre = new Nombre[COLUMNAS][FILAS];
         for(int i=0; i < COLUMNAS; i++)
                for(int j=0; j < FILAS; j++)
                     nombre[i][j] = new Nombre((j*Nombre.DIM)+450,(i*Nombre.DIM)+100,nombres[((i*4)+j)], Color.black,((i*4)+j+1));
       /*  
        tablaBanderas = new Rectangle[FILAS][FILAS];
        for(int i = 0; i < FILAS; i++)
            for (int j=0; j < FILAS; j++)
                tablaBanderas[i][j] = new Rectangle((Bandera.DIM*j)+10, (Bandera.DIM*i)+50, Bandera.DIM, Bandera.DIM);
        */
       try{
         error = getAudioClip(new URL(getCodeBase(), "Examen/sonidos/error.wav"));
         correct = getAudioClip(new URL(getCodeBase(), "Examen/sonidos/correct.wav"));
         }catch(MalformedURLException e){}
        desordenarBanderas();
        desordenarNombres();
    }
  
    public void desordenarBanderas(){
        Image auxiliar;
        for(int i = 0; i < 25; i ++){
            int aleatorio1 = (int)(Math.random()*16); 
            int aleatorio2 = (int)(Math.random()*16); 
            auxiliar = banderas[aleatorio1/4][aleatorio1%4].getImagen();
            banderas[aleatorio1/4][aleatorio1%4].setImagen(banderas[aleatorio2/4][aleatorio2%4].getImagen());
            banderas[aleatorio2/4][aleatorio2%4].setImagen(auxiliar);
        }
    }
    public void desordenarNombres(){
        String auxiliar;
        for(int i = 0; i < 25; i ++){
            int aleatorio1 = (int)(Math.random()*16); 
            int aleatorio2 = (int)(Math.random()*16); 
            auxiliar = nombre[aleatorio1/4][aleatorio1%4].getNombre();
            nombre[aleatorio1/4][aleatorio1%4].setNombre(nombre[aleatorio2/4][aleatorio2%4].getNombre());
            nombre[aleatorio2/4][aleatorio2%4].setNombre(auxiliar);
        }
    }
    
    public void paint(Graphics g){
        /*noseve.setColor(Color.blue);
        noseve.fillRect(0,0,900,700);
        noseve.setColor(Color.black);
        */
           for(int i=0; i < COLUMNAS; i++)
                for(int j=0; j < FILAS; j++)
                    nombre[i][j].paint(g);
           
          for(int i=0; i < COLUMNAS; i++)
            for (int j = 0; j < FILAS; j++)
                banderas[i][j].paint(g, this);
          
           g.drawImage(imagen,0,0,this); 
    }
    
    public boolean mouseDown(Event ev, int x, int y){

        for(int i=0; i < COLUMNAS; i ++)
            for(int j =0; j < FILAS; j++)
            if(banderas[i][j].contains(x,y))
                activa = banderas[i][j];
        return true;
    }
    
    public boolean mouseDrag(Event ev, int x, int y){
        if(activa != null){
        activa.mover(x, y);
        repaint();
        }
        return true;
    }
    public boolean mouseUp(Event ev, int x, int y){
        Point click;
        click = new Point(y/Bandera.DIM, x/Bandera.DIM);
        if(comprobar()){
               correct.play();
        repaint();
        }else{
            error.play();
                } 
   //PARA QUE SE QUEDE EN LA CASILLA EL CURSOR DEBE INTERSECTAR CON EL NOMBRE o EL BORDE DE LA CASILLA CORREGIR PARA QUE SEA CON CUALQUIER PARTE DE ESTA
       for(int i=0; i < COLUMNAS; i ++)
            for(int j=0; j < FILAS; j ++)
                if(nombre[i][j].intersects(activa))
                    if(activa.getValor() == nombre[i][j].getValor()){
                        activa.setColocada(true);
                        activa.ajustar(nombre[i][j].x, nombre[i][j].y);
                        repaint();
                        activa = null;
                    }else{
                        activa.ajustar(banderas[i][j].x, banderas[i][j].y);
                        activa = null;
                    }
        for(int i=0; i < COLUMNAS; i ++)
            for(int j=0; j < FILAS; j ++)
                if(nombre[i][j].intersects(activa))
                    if(nombre[i][j].contains(activa.x, activa.y))
                        activa.ajustar(x, y);
        return true;
    }
   
     public boolean comprobar(){
        boolean correcto = true;
         for(int i=0; i < COLUMNAS; i++)
            for (int j = 0; j < FILAS; j++)
                if(nombre[i][j].valor != banderas[i][j].valor)
                    correcto = false;
        return correcto;
     }
}