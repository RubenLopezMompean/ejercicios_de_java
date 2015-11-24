  /**
 * Ejercicio 16
 * Escribe un programa que diga si un número introducido por teclado es o no 
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la 
 * unidad.
 *
 * @author Rubén López Mompeán
 */
public class C05Ejercicio16 {
  public static void main(String[] args) {
    
    System.out.println("Este programa dice si un número es primo o no.");
    System.out.print("\nDime un número y te diré si es primo o no: ");
    long n = Long.parseLong(System.console().readLine());
    boolean esPrimo = true;
    
    for (long i = 2; i < n; i++) {
      if ((n % i) == 0) {
        esPrimo = false;
      }
    }
        
    if (esPrimo) {
      System.out.println("Este número es primo.");
    } else {
      System.out.println("Este número no es primo.");
    }

  }
}
