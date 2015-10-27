  /**
 * Ejercicio 12
 * Escribe un programa que muestre los n primeros términos de la serie de 
 * Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y 
 * el resto se calcula sumando los dos anteriores, por lo que tendríamos que los 
 * términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se 
 * debe introducir por teclado.
 *
 * @author Rubén López Mompeán
 */
public class C05Ejercicio12 {
  public static void main(String[] args) {

    System.out.print("Este programa muestra los n primeros números de la serie");
    System.out.println(" de Fibonacci. ");
    
    System.out.print("\nIntroduzca n: ");
    int n = Integer.parseInt(System.console().readLine());

    switch (n) {
      case 1:
        System.out.print("0");
        break;
      case 2:
        System.out.print("0 1");
        break;
      default:
        System.out.print("0 1");
        int x = 0;
        int y = 1;
        int aux;
        while(n > 2) {
            aux = x;
            x = y;
            y = aux + y;
            System.out.print(" " + y);
            n--;
        }
    }    
    System.out.println("\nValores de la serie de Fibonacci.");
  }
}
