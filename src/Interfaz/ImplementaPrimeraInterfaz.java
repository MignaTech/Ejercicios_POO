/** @author: Miguel Ángel Sixtega Escribano*/
/*Un metodo para indicar el nombre de la universidad y el mensaje de bienvenida
Metodo para calcular el precio final del articulo (pasar como parametro el prcio)
precio final = precio - descuento * iva
*/
package Interfaz;

public class ImplementaPrimeraInterfaz implements PrimeraInterfaz {
  public void bienvenido() {
    System.out.println(CIA);
    System.out.println(MSG);
    // MSG = "Hola a todos"; al ser constante no se puede modificar su valor
  }

  @Override
  public void precioFinal(double xprecio) {
    double descuento = xprecio * DESC;
    double precioFinal = (xprecio - descuento) * (1 + IVA);
    System.out.println("El precio final es de: " + precioFinal);
  }
}
