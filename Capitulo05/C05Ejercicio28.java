  /**
 * Ejercicio 28
 * Escribe un programa que calcule el factorial de un número entero leído por 
 * teclado.
 *
 * @author Rubén López Mompeán
 */
public class C05Ejercicio28 {
  public static void main(String[] args) {

    System.out.println("Calcula el factorial de un número.");
    System.out.print("Introduce un número: ");
    int numero = Integer.parseInt(System.console().readLine());
    int factorial = numero;
    
    for (int i = 1; i < numero; i++) {
      factorial = factorial * i;
    }
    
    System.out.println("El factorial es " + factorial);

  }
}
