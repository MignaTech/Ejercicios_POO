package Orden;
/** @author: Miguel Ángel Sixtega Escribano */
public class Burbuja {

    public int arr[] = {3, 7, 99, 7, 11, 44, 2, 77, 10, 23};

    public void ordenBurbuja() {
        int aux = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
    }

    public void imprime() {
        for (int i = 0; i < arr.length; i++) System.out.println("["+i+"] = "+arr[i]);
    }

    public static void main(String[] args) {
        Burbuja xx = new Burbuja();
//        long ini = System.currentTimeMillis();
        xx.ordenBurbuja();
        xx.imprime();
//        long fin = System.currentTimeMillis();
//        System.out.println("Tardo " + (fin - ini) + " milisegundos");
    }
}
