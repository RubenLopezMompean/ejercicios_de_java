  /**
 * Ejercicio 27
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay 
 * entre 1 y un número leído por teclado
 *
 * @author Rubén López Mompeán
 */
public class C05Ejercicio27 {
  public static void main(String[] args) {

    System.out.print("Este programa muestra los múltiplos de 3 y su sumatorio");
    System.out.println(" que hay desde el 1 hasta el número tecleado.");
    System.out.print("Introduzca un número entero: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
        
    int numero = numeroIntroducido;
    int suma = 0;
    int count = 0;

    for (int i = 1; i <= numeroIntroducido; i++) {
      if ((i % 3) == 0 ) {
      count++;
      suma = suma + i;
      System.out.print(i + " ");
    }
    }
    System.out.print("\nHay " + count + " múltiplos");
    System.out.println(" y la suma total es de " + suma + ".");
  }
}
