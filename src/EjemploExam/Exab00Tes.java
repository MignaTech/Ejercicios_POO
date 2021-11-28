package EjemploExam;

/** @author: Miguel Ángel Sixtega Escribano */
public class Exab00Tes {
  public static void main(String[] args) {
    Exab00 x1 = new Exab00("Miguel", 11, 980);
    Exab00 x2 = new Exab00("Angel", 45, 98);
    for (int seg = 1; seg < 300; seg++) {
      try {
        Thread.sleep(1000);
        System.out.println(seg);
      } catch (InterruptedException e) {
      }
    }
  }
}
