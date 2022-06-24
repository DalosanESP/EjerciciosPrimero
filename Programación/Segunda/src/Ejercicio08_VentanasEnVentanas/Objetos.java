package Ejercicio08_VentanasEnVentanas;
import java.awt.*;
public class Objetos extends Frame{
        TextArea textArea;
        
        public static void main(String arg[]){
        Objetos app = new Objetos();
    }
    
    public Objetos(){
        super("Trabajando con Objetos de Java");
        setup();
        pack();
        resize(400,400);
        show();
    }
    public void setup(){
        Panel principal = new Panel();
        principal.setLayout(new GridLayout(2,3));
        Panel paneles[][]= new Panel [2][3];
        for(int i = 0; i < paneles.length; i++)
            for(int j = 0; j < paneles[i].length; j++)
                paneles[i][j] = new Panel();
        
        paneles[0][0].add(new Label("Campo de texto: "));
        paneles[0][0].add(new MiTextField("",15));
        
        principal.add(paneles[0][0]);
        
        textArea = new TextArea(5,10);
        textArea.setBackground(Color.yellow);
        paneles[0][1].add(textArea);
        principal.add(paneles[0][1]);
        
        /*Choice eleccion = new Choice();
        eleccion.add("Uno");
        eleccion.add("Dos");
        */
        String opciones[] = {"Si", "No", "Quizas"};
        MiChoice eleccion = new MiChoice(opciones, textArea);
        paneles[0][2].add(eleccion);
        principal.add(paneles[0][2]);
        
        String deportes[] = {"Atletismo", "Balonmano","Tenis","Esgrima","Patinaje","Baloncesto"};
        paneles[1][0].add(new MiLista(deportes,textArea));
        principal.add(paneles[1][0]);
        
        paneles[1][1].add(new MiCanvas());
        principal.add(paneles[1][1]);
        
        this.add(principal);
        
        
    }
    public boolean handleEvent(Event ev){
       if(ev.id == Event.WINDOW_DESTROY){
           System.exit(0);
           return true;
       }else if(ev.id == Event.ACTION_EVENT){
           
       }
            return false;
    }
}

class MiTextField extends TextField{
    public MiTextField(String texto,int tamano ){
        super(texto, tamano);
    }
    public boolean action(Event ev, Object ob){
        String enMayusculas = this.getText().toUpperCase();
        this.setText(enMayusculas);
        return true;
    }
}

class MiChoice extends Choice{
    TextArea texto;
    public MiChoice(String[]opcs, TextArea txt){
        super();
        for(int i=0;i<opcs.length;i++)
            this.add(opcs[i]);
        texto = txt;
    }
    public boolean action(Event ev, Object obj){
        texto.setText(this.getSelectedItem());
        return true;
    }
}
class MiLista extends List{
    TextArea texto;
    public MiLista(String[] deps, TextArea txt){
        super(5, true);
        texto = txt;
        for(int i=0;i<deps.length;i++)
            this.add(deps[i]);
    }
    public boolean handleEvent(Event ev){
        if(ev.id == Event.ACTION_EVENT){
            texto.setText("Doble Click");
            return true;
        }else if(ev.id == Event.LIST_SELECT){
            texto.setText("Seleccion");
           String seleccionados[]=this.getSelectedItems();
           String textoAMostrar = "";
           for(int i=0;i<seleccionados.length;i++)
               textoAMostrar += seleccionados[i] + "\n";
            texto.setText(textoAMostrar);
            return true;
        }else if(ev.id == Event.LIST_SELECT){
            texto.setText("Deseleccion");
            return true;
        }
        return false;
    }
}
class MiCanvas extends Canvas{
    int posx = 20;
    int posy = 20;
    public MiCanvas(){//canvas es una ventana que se puede meter en otra ventana
        super();
        this.resize(75,75);
        this.setBackground(Color.yellow);
        this.setForeground(Color.BLUE);
        this.show();
        
    }
    public void paint(Graphics g){
        g.fillRect(posx, posy, 5, 5);
    }
    public boolean mouseDown(Event ev, int x, int y){
        posx = x;
        posy = y;
        repaint();
        return true;
    }
}
