  /**
 * Ejercicio 22
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 *
 * @author Rubén López Mompeán
 */
public class C05Ejercicio22 {
  public static void main(String[] args) {
    System.out.print("A continuación se va a mostrar los números primos ");
    System.out.println("comprendidos entre 2 y 100, ambos incluidos. ");
    int n;
    int i;
    boolean esPrimo = true;
    
   for (n = 2; n <= 100; n++) {
     esPrimo = true;
     
     for (i = 2; i < n; i++){
       if (n % i == 0) {
        esPrimo = false;
      }
     }
     if (esPrimo) {
       System.out.print(n + ", ");
     }
   }
 }
}
