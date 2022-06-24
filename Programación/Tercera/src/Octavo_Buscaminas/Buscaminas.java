package Octavo_Buscaminas;

import java.applet.Applet;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;

public class Buscaminas extends Applet{
    public static final int DIM = 10;// dimension de la tabla
    Image mina;
    Image imgReverso;
    Casilla casillas[][];
    
    public void init(){
        this.resize(900,700);
        imgReverso = getImage(getCodeBase(), "Octavo/Imagenes/casilla.png");
        mina = getImage(getCodeBase(), "Octavo/Imagenes/mina.png");
        casillas = new Casilla[DIM][DIM];
        for(int i=0; i < DIM; i++)
            for (int j = 0; j < DIM; j++)
                casillas[i][j] = new Casilla(100+(j*Casilla.TAM),100+(i*Casilla.TAM), imgReverso);
        int aleatorios[] = obtenerAleatorios(); 
        for(int i = 0; i < aleatorios.length;i++)
            //todo esto es una casilla, se usa / para el cociente y % para el resto
            casillas[aleatorios[i] / DIM][aleatorios[i] % DIM].setMina(mina);
        
        for(int i=0; i < DIM; i++)
            for (int j = 0; j < DIM; j++)
                casillas[i][j].setAlrededor(cuentaMinas(i,j));
    }
    
    public int cuentaMinas(int fila, int col){
        int contador = 0;
        int inicioFila = (fila ==0)?0:fila-1;//Por si la mina esta en un lateral para que no salga error 
        int finFila = (fila == 9)?fila:fila+1;
        int inicioCol = (col==0)?0:col-1;
        int finCol = (col==9)?col:col+1;
        for(int i=inicioFila; i <= finFila; i++)
            for(int j=inicioCol; j <= finCol; j++)
                if(casillas[i][j].getMina() != null)
                    contador++;
        return contador;
    }
    
    public int[] obtenerAleatorios(){//PARA OBTENER UN VECTOR DE ENTEROS ALEATORIOS Y QUE NO SE REPITAN
        int resultados[] = new int[DIM];
        int vector[] = new int[DIM*DIM];
        for(int i = 0; i < vector.length;i++)
            vector[i] = i;
        for(int i=0; i < DIM; i++){
            int aleatorio = (int)(Math.random()*((DIM*DIM) -i));
            resultados[i] = vector[aleatorio];
            vector[aleatorio] = vector[(DIM*DIM)-i-1];
        }
        return resultados;
    }
    public void paint(Graphics g){
         for(int i=0; i < DIM; i++)
            for (int j = 0; j < DIM; j++)
                casillas[i][j].paint(g,this);
    }
    
    public boolean mouseDown(Event ev, int x, int y){
        for(int i=0; i < DIM; i++)
            for (int j = 0; j < DIM; j++)
                if(casillas[i][j].contains(x,y))
                    casillas[i][j].setTapada(false);
                    repaint();
        return true;
    }
    
}