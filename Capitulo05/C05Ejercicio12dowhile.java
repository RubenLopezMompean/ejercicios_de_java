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
public class C05Ejercicio12dowhile {
  public static void main(String[] args) {

    System.out.print("Este programa muestra los n primeros números de la serie");
    System.out.println(" de Fibonacci. ");
    
    System.out.print("\nIntroduzca n: ");
    int numeroElementos = Integer.parseInt(System.console().readLine());

    int f1 = 0;
    int f2 = 1;
    int suma;
    
   if (numeroElementos == 1) {
     System.out.println("0");
    } else {
      System.out.print(f1 + " ");
      int i = 1;
      do {
        System.out.print(f2 + " ");
        suma = f1 + f2;
        f1 = f2;
        f2 = suma;
        i++;
      } while (i < numeroElementos);
    }
  }
}

