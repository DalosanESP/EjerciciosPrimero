package Ejercicio10_DibujarFiguras;
import java.awt.Canvas;
import java.awt.Event;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class MiCanvas extends Canvas{
    public List<DosPuntos> dps; //List es como un vector infinito. //List es abstract, no se puede crear un objeto de esta clase
    public DosPuntos actual;
    private int tipo = DosPuntos.LINEA;
    
    public MiCanvas(){
        super();
        dps = new ArrayList<DosPuntos>();
    }
    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    public void paint(Graphics g){ //no hace falta que lo llame nadie, se ejecuta solo por el ciclo de vida
        if(actual != null) //abria que crear esto para que no de exception, por lo explicado abajo.
            actual.dibujar(g); //al ejecutarse, dara excepcion porque el paint se inicia al crear micanvas y no hemos instanciado el objeto dp en el metodo constructor
        for(int i = 0; i < dps.size();i++){
            dps.get(i).dibujar(g); //lee la posicion del elemento i. //Objeto de la clase DosPuntos
        }
    }
    public boolean mouseDown(Event ev, int x, int y){ // Event, ejex, ejey del raton //mouseDown, hacer click
        actual = new DosPuntos(x,y,tipo); // instanciamos aqui el objeto, podria hacerlo en el constructor, pero hasta que no hagamos click no vamos a utilizar este objeto
        // por eso lo instanciamos aqui, ademas utilizaremos el metodo constructor de DosPuntos el cual recibe 3 parametros. Ahora el tipo esta cargado con la forma correcta
        //al darle click en DibujarApp
        return true;
    }
    public boolean mouseDrag(Event ev, int x, int y){ //arastrar el raton pulsando
        actual.setFinX(x);// al arrastrar la posicion de final cambia. Por eso la tendremos que modificar por la de ahora. (parametro de mouseDrag)
        actual.setFinY(y);
        repaint(); //borra graphics y lo vuele a llamar al metodo paint
        return true;
    }
    public boolean mouseUp(Event ev, int x, int y){// Al levantar el raton
        dps.add(actual);
        actual = null;
        return true;
    }
}