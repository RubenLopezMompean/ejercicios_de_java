/**
 * Bucle do-while que termina cuando se introduce por teclado un
 * número impar.
 *
 * @author Rubén López Mompeán
 */

public class C05EjercicioApuntes {
    
  public static void main(String[] args) {
        
    int numero;
    String respuesta;
      
    do {
      System.out.print("Introduce un número entero: ");
      numero = Integer.parseInt(System.console().readLine());
      
      if (numero % 2 == 0) {// comprueba si el número introducido es par
        System.out.println("Este número es par.");
      } else {
        System.out.println("Este número es impar.");
      }
      System.out.println("¿Quieres seguir introduciendo números? Responde ? 's' o 'n'");
      respuesta = System.console().readLine();
    } while (respuesta.equalsIgnoreCase("s"));
  }
}
