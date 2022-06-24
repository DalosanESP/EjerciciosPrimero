package Ejercicio04_Bombo;
import java.util.Random;
public class Bombo {
    private int bolas [];
    Random aleatorio;
    private int numBolas = 48;
    
    public Bombo(){
        bolas = new int[numBolas];
        for(int i = 0; i < numBolas; i ++)
            bolas[i]=1+i;
        aleatorio = new Random();
    }
    
    public int sacarBolas(){
        int numAleatorio;
        int devuelve;
        numAleatorio = aleatorio.nextInt(numBolas);
        devuelve = bolas[numAleatorio];
        bolas[numAleatorio] = bolas[numBolas-1];
        numBolas--;
        return devuelve;
    }
}
