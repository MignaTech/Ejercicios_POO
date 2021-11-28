package MultiHilos;

/** @author: Miguel Ángel Sixtega Escribano */

// 1.- Implementar la clase Runnable
class PrimerThread implements Runnable {

  PrimerThread() {
    // 2.- Crear un objeto Thread
    Thread thDemo = new Thread(this, "ThDemo");
    // 3.- Iniciar la ejecuciòn del objeto
    thDemo.start();
  }

  // 4.-Crear el metodo run, es obligatorio
  public void run() {
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
    }
    System.out.println("Saliendo del hilo hijo");
  }

  public static void main(String args[]) {
    /*
     * PrimerThread Hilo1 = new PrimerThread(); Hilo1.run();
     */ // No es necesario al mo tener que llamar ningun metodo
    new PrimerThread();
    try {
      for (int i = 5; i > 0; i--) {
        System.out.println(" Seg: " + i);
        Thread.sleep(1000);
      }
    } catch (InterruptedException e) {
    }
    System.out.println("Saliendo del main");
  }
}
