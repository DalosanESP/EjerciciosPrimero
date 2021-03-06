package Ejercicio07_VentanasTablasCambiarCaracteristicas;
import java.awt.*;
public class FrameApp extends Frame{
    MenuBar porDefecto;
    MenuBar alternativo;
    String tituloInicial;
    int cursores[] = {CROSSHAIR_CURSOR, DEFAULT_CURSOR, E_RESIZE_CURSOR,
        HAND_CURSOR, MOVE_CURSOR, NE_RESIZE_CURSOR, NW_RESIZE_CURSOR, 
        TEXT_CURSOR,WAIT_CURSOR};
    int posCursor = 0;
    Color colores[] = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY,
                        Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE};
    int posColor1 = 0;
    int posColor2 = 0;
    String fuentes[]={"Helvetica","TimesRoman","Courier","Dialog","DialogInput","Arial"};
    int posLetra = 0;
    public static void main(String arg[]){
        FrameApp app = new FrameApp();
    }
    
    public FrameApp(){
        super("Trabajando con Frames");
        tituloInicial = getTitle();
        setup();
        pack();
        resize(400,400);
        show();
    }
    public void setup(){
        setupMenu();
        setupPaneles();
    }

    public void setupPaneles() throws HeadlessException {
        Panel principal = new Panel();
        principal.setLayout(new GridLayout(4,1));
        principal.add(new Label("Cambian las características de la ventana", Label.CENTER));
        Panel panel1 = new Panel();
        panel1.add(new Button("Titulo"));
        panel1.add(new Button("MenuBar"));
        panel1.add(new Button("Resizable"));
        principal.add(panel1);
        
        principal.add(new Label("Salidas en la ventana", Label.CENTER));
        
        Panel panel2 = new Panel();
        panel2.add(new Button("Cursor"));
        panel2.add(new Button("Background"));
        panel2.add(new Button("Foreground"));
        panel2.add(new Button("Font"));
        principal.add(panel2);
        
        this.add("South", principal);
    }

    public void setupMenu() throws HeadlessException {
        porDefecto = new MenuBar();
        Menu fileMenu = new Menu("File");
        fileMenu.add(new MenuItem("Exit"));
        porDefecto.add(fileMenu);
        alternativo = new MenuBar();
        Menu fileMenu2 = new Menu("Archivo");
        fileMenu.add(new MenuItem("Salir"));
        porDefecto.add(fileMenu);
        porDefecto.add(fileMenu2);
        
        this.setMenuBar(porDefecto);
    }
            
    public void paint(Graphics g){
        g.drawString("Cambia el color al pulsar Foreground", 100, 150);
    }
    
    public boolean handleEvent(Event ev){
       if(ev.id == Event.WINDOW_DESTROY){
           System.exit(0);
           return true;
       }else if(ev.id == Event.ACTION_EVENT){
           if(ev.target instanceof Button){
               if(ev.arg.equals("Titulo")){
                   if(this.getTitle().equals(tituloInicial))
                       this.setTitle("Titulo Alternativo");
                   else
                       this.setTitle(tituloInicial);
                   return true;
                }else if(ev.arg.equals("MenuBar")){
                   if(this.getMenuBar().equals(porDefecto))
                       this.setMenuBar(alternativo);
                   else
                        this.setMenuBar(porDefecto);
                   return true;
                }else if(ev.arg.equals("Resizable")){
                   this.setResizable(!this.isResizable());
                    return true;
                }else if(ev.arg.equals("Cursor")){
                    posCursor = (posCursor + 1) % cursores.length;
                    this.setCursor(cursores[posCursor]);
                    return true;
                }else if(ev.arg.equals("Background")){
                    posColor1 = (posColor1 + 1) % colores.length;
                    this.setBackground(colores[posColor1]);
                    return true;
                }else if(ev.arg.equals("Foreground")){
                    posColor2 = (posColor2 + 1) % colores.length;
                    this.setForeground(colores[posColor2]);
                    return true;
                }else if(ev.arg.equals("Font")){
                    posLetra = (posLetra + 1) % fuentes.length;
                    this.setFont(new Font(fuentes[posLetra], Font.PLAIN, 12));
                    return true;
                }
            }
        }
        return false;
    }
}

   
