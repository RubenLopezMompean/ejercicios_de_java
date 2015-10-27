  /**
 * Ejercicio 19
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe 
 * pedir por teclado. El carácter con el que se pinta la pirámide también se 
 * debe pedir por teclado.
 *
 * @author Rubén López Mompeán
 */
public class C05Ejercicio19 {
  public static void main(String[] args) {
    
    System.out.print("Este programa incrementa en 7 el primer número hasta");
    System.out.println("llegar lo más próximo al segundo número.");
    
    System.out.print("\nDime un número del que partir: ");
    int primerNum = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el valor máximo: ");
    int segundoNum = Integer.parseInt(System.console().readLine());
    
    do {
      System.out.println(primerNum);
      primerNum = primerNum + 7;
    } while (primerNum <= segundoNum);
  }
}

