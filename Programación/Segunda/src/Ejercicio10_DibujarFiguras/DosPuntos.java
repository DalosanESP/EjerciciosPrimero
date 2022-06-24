package Ejercicio10_DibujarFiguras;
import java.awt.*;

public class DosPuntos {
    public static final int LINEA = 0; //final = constante(valor no cambia) //static: que se puede acceder desde la clase, no hace falta un objeto de la clase.
    public static final int OVALO = 1; //las constantes sirven para aclarar y entender mejor el codigo
    public static final int RECTANGULO = 2;
    private int inicioX;
    private int inicioY;
    private int finX;
    private int finY;
    private int tipo;
    
    public DosPuntos(int ix, int iy, int fx, int fy, int tipo){
        inicioX = ix;
        inicioY = iy;
        finX = fx;
        finY = fy;
        this.tipo = tipo;
    }
    public DosPuntos(int ix, int iy, int tipo){
        this(ix, iy, ix, iy, tipo); // llama al metodo que tenga 5 parametros, el primer parametro sera igual que el primer parametro del de arrriba y asi.
    }
    public DosPuntos(){
        this(0,0,LINEA);// Cargara estos valores al metodo que tenga 3 parametros, (ix = 0, iy = 0, tipo = LINEA)
    }

    public int getInicioX() {
        return inicioX;
    }

    public void setInicioX(int inicioX) {
        this.inicioX = inicioX;
    }

    public int getInicioY() {
        return inicioY;
    }

    public void setInicioY(int inicioY) {
        this.inicioY = inicioY;
    }

    public int getFinX() {
        return finX;
    }

    public void setFinX(int finX) {
        this.finX = finX;
    }

    public int getFinY() {
        return finY;
    }

    public void setFinY(int finY) {
        this.finY = finY;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public void dibujar(Graphics g){
        int anchura, altura;
        anchura = Math.abs(finX - inicioX); // para que no haya negativos. te convierte un engativo en positivo.
        altura = Math.abs(finY - inicioY);
        switch(tipo){ // utilizaremso switch si la respuesta de la pregunta no es binaria, osea dos respuestas.
            case LINEA:
                g.drawLine(inicioX, inicioY, finX, finY);
                break;
            case OVALO:
                g.drawOval(inicioX, inicioY, anchura, altura);
                break;
            case RECTANGULO:
                g.drawRect(inicioX, inicioY, anchura, altura);
        }
    }
}
