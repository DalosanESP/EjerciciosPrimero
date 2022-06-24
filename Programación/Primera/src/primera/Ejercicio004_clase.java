package primera;

public class Ejercicio004_clase {
    public static void main(String arg[]){
         int x = 44;
         int y = 444;
         int z = 4444;
  
     if (x > y)
        if(x > z)
            System.out.println("El mayor es:" +x);
        else
            System.out.println("El mayor es:" +z);
        else
           if (y > z)
            System.out.println("El mayor es:" +y);
        else
            System.out.println("El mayor es:" +z);
    
    }
}

