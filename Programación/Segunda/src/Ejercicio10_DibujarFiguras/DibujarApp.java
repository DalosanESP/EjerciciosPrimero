package Ejercicio10_DibujarFiguras;
import java.awt.*;
import java.io.*;

public class DibujarApp extends Frame{
    MiCanvas canvas;
    
    public static void main(String args[]){
        DibujarApp app = new DibujarApp();
    }
    public DibujarApp(){
        super("Dibujando en el Frame");
        setup(); // llamada al metodo setup
        pack();
        resize(400,400);
        show();
    }

    private void setup(){
        SetupMenuBar();
        canvas = new MiCanvas();
        this.add("Center", canvas);
    }

    public void SetupMenuBar() throws HeadlessException {
        MenuBar menubar = new MenuBar();
        Menu menu1 = new Menu("Fichero");
        menu1.add(new MenuItem("Nuevo"));
        menu1.addSeparator();
        menu1.add(new MenuItem("Salir"));
        
        menubar.add(menu1);
        
        Menu menu2 = new Menu("Dibujar");
        menu2.add(new MenuItem("Linea"));
        menu2.add(new MenuItem("Ovalo"));
        menu2.add(new MenuItem("Rectangulo"));
        
        menubar.add(menu2);
        this.setMenuBar(menubar); // para meter menubar en el Frame. no es con es add.
    }
    
    
    public boolean handleEvent(Event ev){ //Espera recibir un objeto de la clase Event // metodo de tratamientos de eventos, handleEvent abarca todo los eventos
        if(ev.id == Event.WINDOW_DESTROY){ //para acceder a un atributo static, puedes acceder mediante la clase y no el objeto //WINDOW_DESTROY la cruz del Frame
            System.exit(0); //para cerrar la ventana
            return true;
        }else if(ev.id == Event.ACTION_EVENT){
            if(ev.target instanceof MenuItem){
                if(ev.arg.equals("Salir")){
                    System.exit(0);
                    return true;
                }else if(ev.arg.equals("Linea")){
                    canvas.setTipo(DosPuntos.LINEA);
                    return true;
                }else if(ev.arg.equals("Ovalo")){
                    canvas.setTipo(DosPuntos.OVALO);
                    return true;
                }else if(ev.arg.equals("Rectangulo")){
                    canvas.setTipo(DosPuntos.RECTANGULO);
                    return true;
                }
            }
        }
        return false;
    }
}