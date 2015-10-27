/**
 * Ejercicio 17
 * Escribe un programa que diga cuál es la última cifra de un número entero 
 * introducido por teclado.
 *
 * @author Rubén López Mompeán
 */

public class C04Ejercicio17 {
  
  public static void main (String[] args){
   
    System.out.println("Este programa dice el último dígito de un número");
    System.out.print("Introduzca un número: ");
    int x = Integer.parseInt(System.console().readLine());
    
    if (x < 0) {
      x = -x;
    }
    System.out.print("El último dígito es " + x % 10);
  }
}
