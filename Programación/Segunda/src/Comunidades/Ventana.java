package Comunidades;
//poner seguno choice : Pendiente
import java.awt.*;
public class Ventana extends Frame{
 String[] Comunidades = {"Aragon","Andalucia","Pais Vasco"};
    String[][] provincias = {{"Zaragoza", "Teruel",},{"Malaga", "Cadiz"},{"Bilbao", "Vitoria"}};
    Choice chComunidades;
    Choice chProvincias;
    List[]listaComunidades;
    List presentar;


     public static void main(String arg[]){
            Ventana app = new Ventana();
     }
     
    public Ventana(){
        super("Comunidades Autonomas");
        setup();
        pack();
        resize(300,300);
        show();
    }
    public void setup(){
        this.add("North", new Label("Elige la Comunidad", Label.CENTER));
        chComunidades = new Choice();
        for(int i=0; i < Comunidades.length;i++)
            chComunidades.add(Comunidades[i]);
        
        listaComunidades = new List[Comunidades.length];
        for(int i=0;i<provincias.length;i++){
           listaComunidades[i] = new List(2, true);
           for(int j=0;j<provincias[i].length;j++)
               listaComunidades[i].add(provincias[i][j]);
        }
        presentar = listaComunidades[0];
        
        this.add("West", chComunidades);
        this.add("East", presentar);
    }
    public boolean handleEvent(Event ev){
       if(ev.id == Event.WINDOW_DESTROY){
           System.exit(0);
           return true;
        }else if(ev.id==Event.ACTION_EVENT){
            if(ev.target instanceof Choice){
                this.remove(presentar);
                presentar = listaComunidades[chComunidades.getSelectedIndex()];
                this.add("East",presentar);
                this.show();
                return true;
            }
        }
       return false;
    }
}
