  /**
 * Ejercicio 12
 * Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) 
 * con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para 
 * convertir un entero en un carácter.
 * 
 * @author Rubén López Mompeán
 */
public class C06Ejercicio12 {
  public static void main(String[] args) 
  throws InterruptedException {
    
    System.out.println("Este programa pinta en pantalla caracteres aleatorios ( a lo matrix)");

    // Poner varias palabras para crear una frase aleatoria
    for (int i = 0; i == 0;) {
    
      char caracter = (char)((int)(Math.random() * 95) + 32);
      Thread.sleep(5);
      System.out.print("\033[32m" + caracter + "\t");
    }
  }
}
