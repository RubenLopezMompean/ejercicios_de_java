  /**
 * Ejercicio 4
 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados 
 * por espacios.
 * 
 * @author Rubén López Mompeán
 */
public class C06Ejercicio4 {
  public static void main(String[] args) {
    
    System.out.println("Este programa muestra 20 números aleatorios entre 0 y 10.");
    
    System.out.println("Se saca una carta.");

    int numero;
    
    for (int i = 0; i < 20; i++) {
      numero = (int)(Math.random()*(11));
      System.out.print(numero + ", ");
    }
  }
}
