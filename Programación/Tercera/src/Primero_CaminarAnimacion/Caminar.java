package Primero_CaminarAnimacion;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

public class Caminar extends Applet implements Runnable{//runnable es para que los objetos se muevan solos
    public static final int TIEMPO = 100;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    Image fotogramas[][];
    List <DibujoAnimado> dibujos;
    String mensaje = null;
    
    public void init(){
        this.resize(500, 300);
        imagen = this.createImage(500,300);
        noseve = imagen.getGraphics();
        fotogramas = new Image[3][4];
        String elementos[] = {"Primero/Sprites/Guerrillero/g","Primero/Sprites/Hampon/h","Primero/Sprites/Vaquero/v"};
        for(int i = 0; i < 3; i ++)
            for(int j=0; j < 4; j++)
                fotogramas[i][j] = this.getImage(this.getCodeBase(), elementos[i] + (j+1) + ".gif");//coge el directorio donde esta el codigo
        dibujos = new ArrayList<DibujoAnimado>();
        for(int i = 0; i < 10; i ++)//para que salgan 10
            dibujos.add(new DibujoAnimado(fotogramas[(int)(Math.random()*3)]));//para dibujar los tres, si solo queremos uno
                                                    //[0]))
    }
    
    public void start(){
        animacion = new Thread(this);
        animacion.start();
        
    }
    
    public void update(Graphics g){
        paint(g);
    }
    
    public void paint(Graphics g){
        noseve.setColor(Color.orange);
        noseve.fillRect(0,0,500,300);
        for(int i = 0; i < dibujos.size(); i ++)
        dibujos.get(i).paint(noseve, this);
         if(mensaje != null){
            noseve.setColor(Color.white);
            noseve.drawString(mensaje, 80, 50);
         }
        g.drawImage(imagen,0,0,this);
    }
    
    public void run(){
        do{
            for(int i = 0; i < dibujos.size(); i ++)
            dibujos.get(i).actualizar();
            
                if(dibujos.size() <= 0){
                mensaje = "Game Over";
                repaint();
                animacion.stop();
                }
            repaint();
            try {
                Thread.sleep(TIEMPO);
            } catch (InterruptedException ex) {};
        }while(true);
    }
    public boolean mouseDown(Event ev, int x, int y){//recibe x e y del cursor, si estan dentro del objeto, en este caso lo elimina
        for(int i = 0; i < dibujos.size(); i++){
            if(dibujos.get(i).contains(x, y))
                dibujos.remove(i);
        }
        return true;
    }//Este metodo es para que al pulsar una tecla, todas las imagenes sean las mismas
   /*  public boolean keyDown(Event ev,int tecla){
       switch(tecla){
            case 103:// G y g
            case 71:
                for(int i = 0; i< dibujos.size (); i++)
                dibujos.get(i).setImagenes(fotogramas[0]);
                break;
            case 104: //H y h
            case 72:
                for(int i = 0; i< dibujos.size (); i++)
                dibujos.get(i).setImagenes(fotogramas[1]);
                break;
            case 118: //V y v
            case 86:
                for(int i = 0; i< dibujos.size (); i++)
                dibujos.get(i).setImagenes(fotogramas[2]);
        }
        
        return true;
     } */
}

