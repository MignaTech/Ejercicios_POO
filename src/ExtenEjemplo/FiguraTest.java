package ExtenEjemplo;

/** @author: Miguel Ángel Sixtega Escribano */
public class FiguraTest {
  public static void main(String[] args) {
    // Figura gral = new Figura("General","Azul",10); No se puede al ser abstracta
    // gral.imprime();
    Cuadrado cuad = new Cuadrado("Cuadrado", "Azul", 10);
    cuad.imprime();
    cuad.area();
    System.out.println("---------------------------");
    Rectangulo recta = new Rectangulo("Rectangulo", "Blanco", 10, 5);
    recta.imprime();
    recta.area();
  }
}
