package Comunidades;
import java.awt.*;
public class VentanaFinal extends Frame{
        TextArea textArea;
        
        public static void main(String arg[]){
        VentanaFinal app = new VentanaFinal();
    }
    
    public VentanaFinal(){
        super("Trabajando con Objetos de Java");
        setup();
        pack();
        resize(300,300);
        show();
    }
    public void setup(){
        Panel principal = new Panel();
        principal.setLayout(new GridLayout(2,3));
        Panel paneles[][]= new Panel [2][3];
        for(int i = 0; i < paneles.length; i++)
            for(int j = 0; j < paneles[i].length; j++)
                paneles[i][j] = new Panel();
        
        principal.add(paneles[0][0]);
        
        textArea = new TextArea(5,10);
        textArea.setBackground(Color.yellow);
        paneles[0][2].add(textArea);
        principal.add(paneles[0][2]);
      
        String comunidades[] = {"Aragon", "Andalucia", "Valencia"};
        MyChoice eleccion = new MyChoice(comunidades, textArea);
        paneles[0][1].add(eleccion);
        principal.add(paneles[0][1]);
        
        String provincias[] = {"Aragon", "Andalucia", "Valencia"};
        MyChoice eleccion2 = new MyChoice(provincias, textArea);
        paneles[1][2].add(eleccion);
        
       
        
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
class MyChoice extends Choice{
    TextArea texto;
    public MyChoice(String[]opcs, TextArea txt){
        super();
        for(int i=0;i<opcs.length;i++)
            this.add(opcs[i]);
        texto = txt;
    }
    public boolean action(Event ev, Object obj){
        texto.setText(this.getSelectedItem());
        return true;
    }

    public boolean handleEvent(Event ev){
        if(ev.id == Event.ACTION_EVENT){
            texto.setText("Doble Click");
            return true;
        
        }else if(ev.id == Event.LIST_SELECT){
            texto.setText("Deseleccion");
            return true;
        }
        return false;
    }

   
}
