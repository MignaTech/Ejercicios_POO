/** @author: Miguel Ángel Sixtega Escribano*/
/*Implementar una interfaz que tenga el
Nombre de la empresa.
Mensaje de bienvenida.
IVA general de los productos
Descuento general de precio.

Metodo para calcular el precio final del articulo
precio final = precio - descuento * iva
*/
package Interfaz;

public interface PrimeraInterfaz {
  public String CIA = "Universidad Veracruzana, A.C.";
  public String MSG = "Bienvenidos a su Universidad";
  public double IVA = 0.16, DESC = 0.10;

  public void precioFinal(double xprecio);
}
