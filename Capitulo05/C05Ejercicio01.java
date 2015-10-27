/**
 * Ejercicio 1
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for .
 *
 * @author Rubén López Mompeán
 */
public class C05Ejercicio01 {
  public static void main(String[] args) {
        
    for (int i = 0; i <= 100; i = i + 5) {
      if ((i % 5) == 0){
        System.out.println(i);
      }
    }
  }
}
