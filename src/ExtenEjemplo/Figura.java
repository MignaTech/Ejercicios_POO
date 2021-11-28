package ExtenEjemplo;

/** @author: Miguel Ángel Sixtega Escribano */
/*
 * Ejercicio 1. Implementar la clase figura con los siguientes atributos 
 * Nombre  Color  Lado
 * 
 * Crear el método constructor para dar valor a sus 3 atributos Crear un método
 * abstracto para calcular el área Crear un método que imprima todos sus
 * atributos
 * 
 * Crear la clase rectángulo que herede de figura con el atributo lado Calcule
 * el área Imprima todos sus atributos
 */
public abstract class Figura {
  public String nombre, color;
  public double lado;

  public Figura(String xnom, String xcol, double xlado) {
    nombre = xnom;
    color = xcol;
    lado = xlado;
  }

  public abstract void area();

  public void imprime() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Color : " + color);
    System.out.println("Lado 1: " + lado);
  }
}
