  /**
 * Ejercicio 13
 * Escribe un programa que lea una lista de diez números y determine cuántos
 * son positivos, y cuántos son negativos.
 *
 * @author Rubén López Mompeán
 */
public class C05Ejercicio13 {
  public static void main(String[] args) {
    
    int nIntroducido;
    int positivo = 0;
    int negativo = 0;
     
    System.out.println("Este programa cuenta los números positivos y los negativos");
    System.out.println("\nIntroduce un número: ");
     
    for (int x = 0; x < 10; x++) {
     
      nIntroducido = Integer.parseInt(System.console().readLine());
      
      if (nIntroducido < 0) {
        negativo++;
      }
      if (nIntroducido >= 0) {
        positivo++;
      }
    }
    System.out.print(" positivos " + positivo + " negativos " + negativo);
  }
}


