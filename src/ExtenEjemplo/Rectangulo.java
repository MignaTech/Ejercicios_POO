package ExtenEjemplo;

/** @author: Miguel Ángel Sixtega Escribano */
/*
 * Crear la clase rectángulo que herede de figura con el atributo lado Calcule
 * el área Imprima todos sus atributos
 */
public class Rectangulo extends Figura {
  public double lado;

  public Rectangulo(String xnom, String xcol, double xlado1, double xlado2) {
    super(xnom, xcol, xlado1);
    lado = xlado2;
  }

  public void area() {
    System.out.println("El area del " + nombre + " es " + lado * super.lado);
  }

  public void imprime() {
    super.imprime();
    System.out.println("Lado 2: " + lado);
  }
}
