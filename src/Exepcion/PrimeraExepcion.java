package Exepcion;

/** @author: Miguel Ángel Sixtega Escribano*/
import java.util.Scanner;
import java.util.InputMismatchException;

public class PrimeraExepcion {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = 10, div = 0, resul = 0;
    try {
      System.out.print("Ingresa el numerador: ");
      num = sc.nextInt();
      System.out.print("Ingresa el divisor: ");
      div = sc.nextInt();
      resul = num / div;
    } catch (InputMismatchException e) {
      System.out.println("Debe ingresar obligatoriamente un número entero.");
    } catch (ArithmeticException e) {
      System.out.println("Error. Divición entre cero");
      resul = 0;
    } catch (NullPointerException e) {
      resul = 1;
      System.out.println("Error " + e.getMessage());
      System.out.println("Error. Divición nula");
    } finally {
      System.out.println("El resultado es " + resul);
    }
  }
}
