  /**
 * Ejercicio 23 
 * Escribe un programa que permita ir introduciendo una serie indeterminada de 
 * números mientras su suma no supere el valor 10000. Cuando esto último ocurra, 
 * se debe mostrar el total acumulado, el contador de los números introducidos y 
 * la media.
 *
 * @author Rubén López Mompeán
 */
public class C05Ejercicio23{
  public static void main(String[] args) {
    System.out.print("Este programa calcula la media de las cantidades anotadas. ");
    System.out.print("Cuando la cantidad total supere el valor 10000, mostrará ");
    System.out.println(" el total acumulado y la media de las cantidades. ");
    System.out.println("Inserte cantidades: ");
    int n;
    int nT = 0;
    int contador = 0;
    int media;
    
    do {
      n = Integer.parseInt(System.console().readLine());
      contador++;
      nT = nT + n;
      
    } while (nT <= 10000);
    media = nT / contador;
    System.out.println("Total acumulado: " + nT);
    System.out.println("Contador: " + contador);
    System.out.println("Media: " + media);
  }
}
