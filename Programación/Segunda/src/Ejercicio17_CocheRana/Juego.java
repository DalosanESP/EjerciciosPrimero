package Ejercicio17_CocheRana;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Event;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class Juego extends Applet implements Runnable{
    public static final int TIEMPO = 50;
    public static final int VIDAS = 3;
    Thread animacion;
    Image imagen;
    Graphics noseve;
    List <Coche> coches;
    Rana rana;
    int intervalo = 50;
    String mensaje = null;
    int vidasRestan;
    Rectangle r1,r2;
     public void init(){
        this.resize(500, 300);
        imagen = this.createImage(500,300);
        noseve = imagen.getGraphics();
        rana = new Rana();
        coches = new ArrayList<Coche>();//nos cargamos el bucle porque en el do ya hacemos que salgan cada poco timpo entonces es un poco inutil
        //for(int i= 0; i< 10; i++)
          //  coches.add(new Coche());
          vidasRestan = VIDAS;
          r1 = new Rectangle(-30, 50, 560, 98);
          r2 = new Rectangle(-30, 152, 560, 98);
    }
    public void start(){
        animacion = new Thread(this);
        animacion.start();
    }
    public void update(Graphics g){
        paint(g);
    }
    public void paint(Graphics g){
        noseve.setColor(Color.white);
        noseve.fillRect(0,0,500,300);
        noseve.fillRect(0, 50, 500, 200);
        noseve.setColor(Color.black);
        noseve.fillRect(r1.x, r1.y, r1.width, r1.height);
        noseve.fillRect(r2.x, r2.y, r2.width, r2.height);
        rana.paint(noseve);
        for(int i = 0; i < coches.size(); i++)
            coches.get(i).paint(noseve);
        noseve.setColor(Color.BLACK);
        noseve.drawString("Vidas :" + vidasRestan, 10,10);
        if(vidasRestan==0){
            noseve.setColor(Color.yellow);
            noseve.setFont(new Font("TimeRoman",Font.BOLD,20));
            noseve.drawString("GAME OVER", 150, 100);
            animacion.stop();
        }
        
        if(mensaje != null){
            noseve.setColor(Color.red);
            noseve.drawString(mensaje, 80, 50);
        }
        
        g.drawImage(imagen, 0, 0, this);
        
    }
    public void run(){
        do{
           intervalo += TIEMPO;
                   if(intervalo >= 500){
                       intervalo = 0;
                   coches.add(new Coche());
                   }
                   
           for(int i = 0; i < coches.size(); i++){
                coches.get(i).update(r1,r2);
                if(coches.get(i).getVelX()>0){
                    if(coches.get(i).x >500){
                        coches.remove(i);
                    }
                }else
                    if(coches.get(i).x < -30)
                        coches.remove(i);
           }
           if(rana.choque(coches)){
               vidasRestan--;
           }
                    
            for(int i = 0; i < coches.size(); i++)
                if(rana.y <= 0){
                    mensaje = "Has Ganado - Game Over";
                    repaint();
                    animacion.stop();
                }
            repaint();
            try {
                Thread.sleep(TIEMPO);
            } catch (InterruptedException ex) {}; 
        }while(true);
    }
    public boolean keyDown(Event ev,int tecla){//para saltar con el espacio
        rana.update(tecla);
        //if(tecla == 1004) // 32 codigo ASCI espacio
           // rana.y -= 14;
         //if(tecla == 1006) // 32 codigo ASCI espacio
           // rana.x -= 14;
         // if(tecla == 1007) // 32 codigo ASCI espacio
           // rana.x += 14;
         // if(tecla == 1005) // 32 codigo ASCI espacio
          //  rana.y += 14;
        
        return true;
    }
} 