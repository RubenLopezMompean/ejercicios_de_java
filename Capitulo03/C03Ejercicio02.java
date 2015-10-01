/**
* Ejercicio 2
  Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere 
  conertir debe ser introducida por teclado.
*
* @author Rubén López Mompeán
*/

public class C03Ejercicio02 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce cantidad en euros: ");
    linea = System.console().readLine();
    int primerNumero;
    primerNumero = Integer.parseInt( linea );

    double total;
    total = primerNumero * 166.386;

    System.out.println("Cantidad de euros introducidos: " + primerNumero + "€");
    System.out.print("El cambio de euros a pesetas: ");
    System.out.println(total + " pesetas ");   
  } 
}
