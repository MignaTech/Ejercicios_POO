package practica;

public class Practica2 {
    int[] vector;
    public Practica2(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++)
            arreglo[i] = (int) (Math.random() * (10 - 0 + 1) + 0);
        vector = arreglo;
    }

    public void imprimir() {
        System.out.println("Impresion del arreglo...");
        for (int i = 0; i < vector.length; i++)
            System.out.print(vector[i]+"  -->  ");
    }

    public int calMayor() {
        int mayor = vector[0];
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > mayor)
                mayor = vector[i];
        }
        return mayor;
    }

    public int reprobados() {
        int rep = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < 6)
                rep++;
        }
        return rep;
    }
}
