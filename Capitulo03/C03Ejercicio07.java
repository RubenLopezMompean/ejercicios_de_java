/**
*Ejercicio 7
 Escribe un programa que calcule el total de una factura a partir de la base 
 imponible.
*
* @author Rubén López Mompeán
*/

public class C03Ejercicio07 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Base imponible: ");
    linea = System.console().readLine();
    double baseImponible = Double.parseDouble( linea );

    System.out.print("Introduce el IVA: ");
    linea = System.console().readLine();
    double iva = Double.parseDouble( linea );

    double total = baseImponible + (iva * baseImponible/100);
    
    System.out.println("Base imponible: " + baseImponible);
    System.out.println("IVA " + iva);
    System.out.print("TOTAl: ");
    System.out.println(total + " euros ");

  } 
}
