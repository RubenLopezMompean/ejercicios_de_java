/**
 * Ejercicio 4
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás 
 * utilizando un bucle for .
 *
 * @author Rubén López Mompeán
 */
public class C05Ejercicio071 {
  public static void main(String[] args) {
    
    System.out.print("Introduzca la clave de 4 dígitos ");
    int i = Integer.parseInt(System.console().readLine());
    
    if (i == 5478) {
      System.out.println("Clave correcta");
    } 
    if (i != 5478) {
      System.out.println("Clave incorrecta");
    }
  }
}

