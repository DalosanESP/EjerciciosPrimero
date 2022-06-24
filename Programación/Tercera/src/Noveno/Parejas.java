package Noveno;

import java.applet.Applet;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;

public class Parejas extends Applet implements Runnable{ 
    Image imgReverso;
    Image imagenes[];
    Casilla casillas[][];
    Thread animacion;
    int temporal;
    int cuentaSegundos =0;
    Casilla cUno, cDos;
    public void init(){
        this.resize(900,700);
         imgReverso = getImage(getCodeBase(), "Noveno/donutsMatch/reverso.png");
         imagenes = new Image[8];
         for(int i = 0; i < 8; i++)
             imagenes[i] = getImage(getCodeBase(),"Noveno/donutsMatch/img"+(i+1)+".png");
         
         casillas = new Casilla[4][4];
        for(int i=0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                casillas[i][j] = new Casilla(100+(j*Casilla.DIM),100+(i*Casilla.DIM), imgReverso, imagenes[((i*4)+j)%8]);
        
        desordenar();
    }
    public void start(){
        animacion = new Thread(this);
        animacion.start();//llama al metodo run
    }
    public void desordenar(){
        Image auxiliar;
        for(int i = 0; i < 25; i ++){
            int aleatorio1 = (int)(Math.random()*16); 
            int aleatorio2 = (int)(Math.random()*16); 
            auxiliar = casillas[aleatorio1/4][aleatorio1%4].getImagen();
            casillas[aleatorio1/4][aleatorio1%4].setImagen(casillas[aleatorio2/4][aleatorio2%4].getImagen());
            casillas[aleatorio2/4][aleatorio2%4].setImagen(auxiliar);
        }
    }
    
    public int[] obtenerAleatorios(){//PARA OBTENER UN VECTOR DE ENTEROS ALEATORIOS Y QUE NO SE REPITAN
        int resultados[] = new int[4];
        int vector[] = new int[4*4];
        for(int i = 0; i < vector.length;i++)
            vector[i] = i;
        for(int i=0; i < 4; i++){
            int aleatorio = (int)(Math.random()*((4*4) -i));
            resultados[i] = vector[aleatorio];
            vector[aleatorio] = vector[(4*4)-i-1];
        }
        return resultados;
    }
    
    
    public void paint(Graphics g){
          for(int i=0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                casillas[i][j].paint(g,this);
        //g.drawImage(imagenes[2],10,10,100,100,this);
    }
    
    public boolean mouseDown(Event ev, int x, int y){
       for(int i=0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                if(casillas[i][j].contains(x,y))
                    if(!casillas[i][j].isDescubierta()){// el ! niega, (si no esta descuberta)
                        casillas[i][j].setDescubierta(true);
                        switch(cuantasDescubiertas()){
                            case 0:     
                                cUno = casillas[i][j];
                                break;
                        
                            case 1:
                                 cDos = casillas[i][j];
                                 if(cUno.getImagen() == cDos.getImagen()){
                                     cUno = cDos = null;
                                 }else{
                                      temporal = cuantasDescubiertas();
                                 }
                        }       
                    }
        repaint();
        return true;
    }
    
    public int cuantasDescubiertas(){
        int num = 0;
        if(cUno != null) num++;
        if(cDos != null) num++;
        return num;
    }
    
    public void run(){
        Image imagen1;
        Image imagen2;
        do{
            cuentaSegundos ++;
            if((cuentaSegundos - temporal) == 3){
                cUno.setDescubierta(false);
                cDos.setDescubierta(false);
                cUno = cDos = null;
                repaint();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {}; 
        }while(true);
    }
}