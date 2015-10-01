/**
*Ejercicio 3
 Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 convertir debe ser introducida por teclado.
*
* @author Rubén López Mompeán
*/

public class C03Ejercicio03 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce cantidad en pesetas: ");
    linea = System.console().readLine();
    int primerNumero;
    primerNumero = Integer.parseInt( linea );

    double total;
    total = primerNumero / 166.386;

    System.out.print("Cantidad de pesetas introducidas: " + primerNumero);
    System.out.println(" pesetas ");
    System.out.print("El cambio de pesetas a euros: ");
    System.out.printf("%.2feuros",total);   
  } 
}
