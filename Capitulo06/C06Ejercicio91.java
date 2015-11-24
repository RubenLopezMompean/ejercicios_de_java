  /**
 * Ejercicio 9
 * Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 
 * y que no termine de generar números hasta que no saque el 24. El programa deberá 
 * decir al final cuántos números se han generado.
 * 
 * @author Rubén López Mompeán
 */
public class C06Ejercicio91 {
  public static void main(String[] args) {
    
    System.out.print("Este programa genera números entre 0 y 100 hasta que ");
    System.out.println(" aparezca el 24, y cuenta cuantos números han salido.");

    int numero;
    int contador = 0;
    
    do {
      numero = (int)(Math.random() * 51) * 2;
      System.out.print(numero + " ");
      contador++;
    } while (numero != 24);
    System.out.println("\nHa salido " + contador + " número/s");
    
  }
}
