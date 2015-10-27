/**
 * Ejercicio 14
 * Realiza un programa que diga si un número introducido por teclado es par y/o
 * divisible entre 5.
 *
 * @author Rubén López Mompeán
 */

public class C04Ejercicio14 {
  
 public static void main (String[] args){
   
   System.out.print("Este programa dice si el número introducido es par y ");
   System.out.println(" divisible entre 5.");
   
   System.out.print("\nPor favor, introduzca un número entero: ");
    int n = Integer.parseInt(System.console().readLine());

    if ((n % 2) == 0) {
      System.out.print("El número introducido es par");
    } else {
      System.out.print("El número introducido es impar");
    }

    if ((n % 5) == 0) {
      System.out.println(" y es divisible entre 5.");
    } else {
      System.out.println(" y no es divisible entre 5.");
    }
  }
}
