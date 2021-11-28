package MultiHilos;
/*
Vas a tener un arreglo de 10 elementos
Lo llenas con valores cualesquiera entre 1 y 1000
lo imprimes
lo ordenas mediante el metodo la de burbuja
lo imprimes
 */

/** @author: Miguel Ángel Sixtega Escribano */
public class OrdenaH implements Runnable {
  public int arr[] = new int[100000];

  public OrdenaH(String xnom) {
    Thread hilo = new Thread(this, xnom);
    hilo.setPriority(5);
    for (int ren = 0; ren < arr.length; ren++)
      arr[ren] = (int) (Math.random() * 1000 + 1);
    hilo.start();
  }

  public void imprime() {
    for (int ren = 1000; ren < 1010; ren++)
      System.out.println(ren + " : " + arr[ren]);
    System.out.println("");
  }

  public void run() {
    int aux = 0;
    for (int ren = 0; ren < arr.length - 1; ren++)
      for (int col = 0; col < arr.length - 1 - ren; col++) {
        if (arr[col] > arr[col + 1]) {
          aux = arr[col];
          arr[col] = arr[col + 1];
          arr[col + 1] = aux;
        }
      }
    System.out.println("s ya termino: " + Thread.currentThread().getName());
    imprime();
  }

}
