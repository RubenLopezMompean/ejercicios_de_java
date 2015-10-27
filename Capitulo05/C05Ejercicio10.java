  /**
 * Ejercicio 10
 * Escribe un programa que calcule la media de un conjunto de números positivos 
 * introducidos por teclado. A priori, el programa no sabe cuántos números se 
 * introducirán. El usuario indicará que ha terminado de introducir los datos 
 * cuando meta un número negativo.
 *
 * @author Rubén López Mompeán
 */
public class C05Ejercicio10 {
  public static void main(String[] args) {
    
    double n = 0;
    double nIntroducido = 0;
    double suma = 0;
    
    System.out.print("Este programa hace la media de números positivos ");
    System.out.println("introducidos, introduce un número negativo para terminar.");
    
    do {
      System.out.print("\nIntroduzca números positivos: ");
      nIntroducido = Double.parseDouble(System.console().readLine());
      n++;
      suma = suma + nIntroducido;
      
    } while ( nIntroducido >= 0);
    
    System.out.print("La media de los números introducidos es: ");
    System.out.println( + (suma - nIntroducido) / ( n -1));
  }
}


