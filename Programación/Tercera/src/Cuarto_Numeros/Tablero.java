package Cuarto_Numeros;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.net.MalformedURLException;
import java.net.URL;

public class Tablero extends Applet {
    public static final int TAM = 5;
    Image imagen;
    Graphics noseve;
    Image imagenes[][];
    Lugar lugares[][];
    AudioClip error, correct, exito;
    Point blanco;
    Button boton;
    public void init(){
        this.resize(250, 300);
        imagen = this.createImage(250,300);
        noseve = imagen.getGraphics();
        imagenes = new Image[TAM][TAM];
        for(int i=0; i < TAM; i++)
            for (int j = 0; j < TAM; j++)
                imagenes[i][j] = getImage(getCodeBase(), "Cuarto/botones/"+((i*TAM)+j+1)+".gif");
         lugares = new Lugar[TAM][TAM];
         for(int i=0; i < TAM; i++)
            for (int j = 0; j < TAM; j++)
                lugares[i][j] = new Lugar(imagenes[i][j],((i*TAM)+j+1));
         try{
         error = getAudioClip(new URL(getCodeBase(), "Cuarto/sonidos/error.wav"));
         correct = getAudioClip(new URL(getCodeBase(), "Cuarto/sonidos/correct.wav"));
         exito = getAudioClip(new URL(getCodeBase(), "Cuarto/sonidos/exito.wav"));
         }catch(MalformedURLException e){}
        blanco = new Point(TAM-1, TAM-1);//es como poner 4,4 pero al tener la variable con valor 5 pues da igual
        boton = new Button("Iniciar");
        this.setLayout(new BorderLayout());
        this.add("South",boton);
     }
    public void update(Graphics g){
        paint(g);
    }
    
    public void paint(Graphics g){
        noseve.setColor(Color.orange);
        noseve.fillRect(0,0,700,500);
        for(int i=0; i < TAM; i++)
            for (int j = 0; j < TAM; j++)
                lugares[i][j].paint(noseve, this, i, j);
        g.drawImage(imagen,0,0,this);
    }
    public boolean mover(Point click){
        Point desplazamiento, hasta;
        desplazamiento = new Point(delta(click.x, blanco.x),(delta(click.y, blanco.y)));
        if((desplazamiento.x == 0)&&(desplazamiento.y == 0))
            return false;
        if((desplazamiento.x != 0)&&(desplazamiento.y != 0))
            return false;
        hasta = new Point(click.x + desplazamiento.x, click.y + desplazamiento.y);
        if(!((hasta.x == blanco.x) && (hasta.y == blanco.y)))
            mover(hasta);
        lugares[blanco.x][blanco.y].setImagen(lugares[click.x][click.y].getImagen());
        lugares[blanco.x][blanco.y].valor = lugares[click.x][click.y].valor;
        lugares[click.x][click.y].setImagen(null);
        lugares[click.x][click.y].valor = 25;
        blanco = click;
        return true;
    }
    public int delta(int a, int b){
        if(a==b) return 0;
        else return ((b-a)/Math.abs(b-a));
    }
    public boolean mouseDown(Event ev, int x, int y){//te da las coordenadas x e y del raton
        Point click;
        click = new Point(y/Lugar.DIM, x/Lugar.DIM);
        if (mover(click)){
           correct.play();
           
           if(comprobar())
               exito.play();
           else
               correct.play();
        repaint();
        }else 
            error.play();
        return true;
    }
    public boolean comprobar(){
        boolean correcto = true;
         for(int i=0; i < TAM; i++)
            for (int j = 0; j < TAM; j++)
                if(lugares[i][j].valor != (i*TAM) + j + 1)
                    correcto = false;
        return correcto;
    }
    public boolean action(Event ev, Object obj){
        if(ev.target instanceof Button){
            for(int i=0; i < 100; i++)
                mover(new Point((int)(Math.random()*5),(int)(Math.random()*5)));
            repaint();
            return true;
        }
        return false;
    }
}