/**
 * Ejercicio 5
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo
 * ax + b = 0 ).
 * 
 * @author Rubén López Mompeán
 */

public class C04Ejercicio05 {
	public static void main(String[] args) { 	
   
    System.out.print("Este programa resuelve ecuaciones de primer grado del");
    System.out.println("tipo ax + b = 0");
    System.out.print("Introduzca el valor de a: ");
    Double a = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca el valor de b: ");
    Double b = Double.parseDouble(System.console().readLine());

    if (a == 0) {
      System.out.println("No tiene solución.");
    } else {
      System.out.println("x = " + (-b/a));
    }
  }
}
