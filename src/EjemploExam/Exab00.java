package EjemploExam;

/** @author: Miguel Ángel Sixtega Escribano */
class Exab00 implements Runnable {
  public int arr[] = new int[10000];
  public int i, j;

  public Exab00(String xnom, int n1, int n2) {
    Thread hilo = new Thread(this, xnom);
    for (int ren = 0; ren < arr.length; ren++) {
      arr[ren] = (int) (Math.random() * 1000 + 1);
    }
    i = n1;
    j = n2;
    hilo.start();
  }

  public void run() {
    int aux = 0;
    for (int ren = 0; ren < arr.length - 1; ren++) {
      for (int col = 0; col < arr.length - 1 - ren; col++) {
        if (arr[col] > arr[col + 1]) {
          aux = arr[col];
          arr[col] = arr[col + 1];
          arr[col + 1] = aux;
        }
      }
    }
    intervalo(i, j);
    System.out.println("Ya termino: " + Thread.currentThread().getName());
  }

  public void intervalo(int i1, int i2) {
    int cont = 0;
    for (int x = 0; x < arr.length; x++) {
      if (arr[x] >= i1 && arr[x] <= i2) {
        cont++;
      }
    }
    System.out.println("Hay " + cont + " numeros dentro del intervalo");
  }
}
