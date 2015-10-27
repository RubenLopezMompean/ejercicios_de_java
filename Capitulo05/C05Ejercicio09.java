/**
 * Ejercicio 9
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido 
 * por teclado.
 *
 * @author Rubén López Mompeán
 */
public class C05Ejercicio09 {
  public static void main(String[] args) {
    
    int numDigitos = 1; // int numDigitos = 1, n, numIntroducido;se puede poner así también.
    int n;

    System.out.print("Introduzca un número entero: ");
    n = Math.abs(Integer.parseInt(System.console().readLine()));
    
    while (n > 9) {
      n /= 10;
      numDigitos++;
    }
    
    System.out.println("El número introducido " + n + " tiene " + numDigitos + " dígito/s.");

  }
}


