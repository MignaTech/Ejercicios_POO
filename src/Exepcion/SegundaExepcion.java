package Exepcion;

/** @author: Miguel Ángel Sixtega Escribano*/
import java.util.InputMismatchException;
import java.util.Scanner;

public class SegundaExepcion {
  public static void main(String[] args) {
    Scanner lee = new Scanner(System.in);
    double arr[] = { 0, 8, 9, 10, 6 }, resul = 0;
    int num = 10, div = 0;
    while (true) {
      try {
        System.out.print("\nTeclea la posicion del numerador: ");
        num = lee.nextInt();
        System.out.print("Teclea la posicion del divisor: ");
        div = lee.nextInt();
        if (arr[div] == 0.0f)
          throw new ArithmeticException();
        else
          resul = arr[num] / arr[div];
      } catch (ArithmeticException e) {
        System.out.println("Error.Division entre cero. Checa el divisor");
        resul = 0;
      } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
        System.out.println("Error. El indice esta fuera del rango ");
        lee.nextLine();
        continue;
      }
      break;
    }
    System.out.println("El resultado es: " + resul);
  }
}
