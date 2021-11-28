package MultiHilos;

/*
Manejo basico de archivos
Leer y grabar en un archivo
Tener el metodo de seleccionar.*/
/** @author: Miguel Ángel Sixtega Escribano */
public class OrdenaHTest {
  public static void main(String[] args) {
    new OrdenaH("Batman");
    new OrdenaH("Superman");
    /*
     * xx.ordena(); Aqui tuvimos que esperar a que terminara
     * System.out.println("Datos ordenados");
     */
    for (int seg = 1; seg < 100; seg++) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
      }
      System.out.println(seg);
    }
  }
}
