/**
 *Ejercicio 6
  Escribe un programa que calcule el total de una factura a partir de la base
  imponible (precio sin IVA). La base imponible estará almacenada en una
  variable.
 *
 * @author Rubén López Mompeán
 */

public class C02Ejercicio06 {
  public static void main(String[] args) {

    double factura = 14.95;
    double iva = factura * 0.21;
    double total = factura * iva;
    
    System.out.println( factura + " euros sin iva ");
    System.out.println( total + " euros con iva ");
  
  }
}
