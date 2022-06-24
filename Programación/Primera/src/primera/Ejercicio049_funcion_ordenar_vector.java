/*
Usar una funcion para ordenar un vector
 */
package primera;

public class Ejercicio049_funcion_ordenar_vector {
    public static void main(String arg[]){
        int vector[]= {10,2452,3224,244,55};
        ordenar(vector);
        for(int i=0;i<vector.length;i++)
        System.out.print(vector[i] + " - ");
    }
    
    public static void ordenar(int v[]){
        int inter;
    for(int x=0; x<v.length-1;x++)
    for(int i = v.length-1; i > 0;i--)
     if(v[i] < v[i-1]){
        inter = v[i];
        v[i]=v[i-1];
        v[i-1] = inter;
     }
    }
}
