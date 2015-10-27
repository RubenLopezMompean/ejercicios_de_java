  /**
 * Ejercicio 14
 * Escribe un programa que pida una base y un exponente (entero positivo) y que 
 * calcule la potencia.
 *
 * @author Rubén López Mompeán
 */
public class C05Ejercicio14 {
  public static void main(String[] args) {
    
    System.out.println("Este programa realiza el cálculo de una potencia.");
    
    System.out.print("\nIntroduzca la base: ");
    double base = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca el exponente: ");
    double exponente = Double.parseDouble(System.console().readLine());

    double potencia = 1;
        
    if (exponente == 0) {
      potencia = 1;
    }
    
    if (exponente > 0) {
      for (int i = 0; i < exponente; i++) {
        potencia = potencia * base;
      }
    }
    
    if (exponente < 0) {
      for (int i = 0; i < -exponente; i++) {
        potencia = potencia * base;
      }
      
      potencia = 1/potencia;
    }
    
    System.out.printf("%.2f ^ %.2f = %.2f ", base , exponente , potencia);
  }
}
