package practica;
public class Practica3 {
    int[] vector;
    public Practica3(int[] arreglo) {
        vector = arreglo;
    }
    public void promedio(){
        double suma=0;
        for (int i = 0; i < vector.length; i++)
            suma+=vector[i];
        suma/=vector.length;
        System.out.println("Promedio es "+suma);
    }
}
