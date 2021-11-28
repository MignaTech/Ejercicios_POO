/** @author: Miguel Ángel Sixtega Escribano*/
package ImplementaInterfaz;

public class Miguel1 implements Password {
  java.util.Scanner sc = new java.util.Scanner(System.in);

  public void password(String pass) {
    int inicio = 0;
    while (!(pass.equals(PASSWORD)) && (inicio < INTENTOS)) {
      System.out.println(ERROR);
      System.out.println("Ingresa el password: ");
      pass = sc.nextLine();
      if (inicio == INTENTOS)
        System.exit(0);
      inicio++;
    }
    if (pass.equals(PASSWORD)) {
      System.out.println("Ingresa el precio: ");
      double precio = sc.nextDouble();
      descuento(precio);
    }
  }

  @Override
  public void descuento(double xprecio) {
    double precioFinal = (xprecio - DESCUENTO) * 1.16;
    System.out.println("El precio final es de: " + precioFinal);
  }
}
