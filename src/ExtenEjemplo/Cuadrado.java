package ExtenEjemplo;

/** @author: Miguel Ángel Sixtega Escribano */
/*
 * Crear la clase cuadrado que herede de figura sin atributos Calcule el área
 * Imprima todos sus atributos
 */
public class Cuadrado extends Figura {
  public Cuadrado(String xnom, String xcol, double xlado) {
    super(xnom, xcol, xlado);
  }

  public void area() {
    System.out.println("El area del " + nombre + " es " + lado * lado);
  }
}
