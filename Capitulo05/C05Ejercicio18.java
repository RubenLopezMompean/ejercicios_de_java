  /**
 * Ejercicio 18
 * Escribe un programa que obtenga los números enteros comprendidos entre dos 
 * números introducidos por teclado y validados como distintos, el programa debe
 * empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.
 *
 * @author Rubén López Mompeán
 */
public class C05Ejercicio18 {
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

