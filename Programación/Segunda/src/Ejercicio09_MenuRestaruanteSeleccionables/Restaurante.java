package Ejercicio09_MenuRestaruanteSeleccionables;
import java.awt.*;
public class Restaurante extends Frame{
    String[] comidas = {"Desayuno","Almuerzo","Cena"};
    String[][] platos = {{"Leche", "Cafe", "Huevos", "Tostadas", "Mermelada","Bacon"},
                        {"Macarrones", "Ensalada", "Filete", "Pescado", "Albondigas","Hamburgusa"},
                        {"Tortilla", "Sopa", "Hamburguesa", "Ensalada", "Pollo","Bocadillo"}};
    Choice chComidas;
    List[]listaPlatos;
    List presentar;
    TextField texto;


     public static void main(String arg[]){
        Restaurante app = new Restaurante();
     }
     
    public Restaurante(){
        super("Restaurante Aplicación");
        setup();
        pack();
        resize(275,175);
        show();
    }
    public void setup(){
        this.add("North", new Label("Elige la comanda", Label.CENTER));
        chComidas = new Choice();
        for(int i=0; i < comidas.length;i++)
            chComidas.add(comidas[i]);
        
        listaPlatos = new List[comidas.length];
        for(int i=0;i<platos.length;i++){
           listaPlatos[i] = new List(5, true);
           for(int j=0;j<platos[i].length;j++)
               listaPlatos[i].add(platos[i][j]);
        }
        presentar = listaPlatos[0];
        
        texto = new TextField("", 40);
        
        this.add("West", chComidas);
        this.add("East", presentar);
        this.add("South", texto);
    }
    public boolean handleEvent(Event ev){
       if(ev.id == Event.WINDOW_DESTROY){
           System.exit(0);
           return true;
        }else if(ev.id==Event.ACTION_EVENT){
            if(ev.target instanceof Choice){
                this.remove(presentar);
                presentar = listaPlatos[chComidas.getSelectedIndex()];
                this.add("East",presentar);
                this.show();
                texto.setText(chComidas.getSelectedItem()+ ": ");
                return true;
            }
        }else if((ev.id==Event.LIST_SELECT)||(ev.id==Event.LIST_DESELECT)){
            String peticion = chComidas.getSelectedItem() + ": ";
            String seleccionados[] = presentar.getSelectedItems();
            for(int i= 0; i< seleccionados.length;i++)
                peticion += seleccionados[i]+" ";
            texto.setText(peticion);
            return true;
    }
       return false;
    }
}
