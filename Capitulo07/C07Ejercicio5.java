/**
 * Ejercicio 5
 * Escribe un programa que pida 10 números por teclado y que luego muestre los 
 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del 
 * máximo y del mínimo respectivamente.
 * 
 * @author Rubén López Mompeán
 */

public class C07Ejercicio5 {
  public static void main(String[] args) {
        
    int [] numero = new int[10];
    
    int maximo = Integer.MIN_VALUE; // Inicia el valor al máximo número posible
    int minimo = Integer.MAX_VALUE; // Inicia el valor al mínimo número posible
    
    System.out.println("Introduce 10 números:");
    
    for (int i = 0; i < 10; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());
      
      if (numero[i] > maximo) {
        maximo = numero[i];
      }
      if (numero[i] < minimo) {
        minimo = numero[i];
      }
    }
    System.out.println("Los números introducidos son: ");
    for (int n: numero) {
      System.out.print(n + " ");
    }
    System.out.print("\nMáximo: " + maximo + "\nMínimo: " + minimo);
  }
}
