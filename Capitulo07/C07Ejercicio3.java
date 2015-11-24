/**
 * Ejercicio 3
 * Escribe un programa que lea 10 números por teclado y que luego los muestre en 
 * orden inverso, es decir, el primero que se introduce es el último en mostrarse 
 * y viceversa.
 * 
 * @author Rubén López Mompeán
 */

public class C07Ejercicio3 {
  public static void main(String[] args) {
        
    int [] num = new int[10];
    int i;
    for (i = 0; i < 10; i++) {
      System.out.print("Introduzca el " + (i + 1) + "º número: ");
      num[i] = Integer.parseInt(System.console().readLine());
    }
    for (i = 9; i >= 0; i--){
      System.out.print(num[i] + " ");
    }
  }
}
