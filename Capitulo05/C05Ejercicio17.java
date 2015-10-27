  /**
 * Ejercicio 17
 * Realiza un programa que sume los 100 números siguientes a un número entero y 
 * positivo introducido por teclado. Se debe comprobar que el dato introducido 
 * es correcto (que es un número positivo).
 *
 * @author Rubén López Mompeán
 */
public class C05Ejercicio17 {
  public static void main(String[] args) {
    
    System.out.println("Este programa dice si un número es primo o no.");
    System.out.print("\nDime un número y te diré si es primo o no: ");
    int n = Integer.parseInt(System.console().readLine());
    int i = 0;
    
    if (n >= 0) {
      for (i = n +1 ; i <= n + 100; i++) {
        System.out.println(i);
      } 
    } else {
        System.out.println("Este número no es positivo.");
      }
  }
}

