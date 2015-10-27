/**
 * Ejercicio 7
 * Realiza un programa que calcule la media de tres notas.
 *
 * @author Rubén López Mompeán
 */

public class C04Ejercicio07 {
  
	public static void main(String[] args) { 	
    
    System.out.println("Programa que calcula la media de tres notas");
    
    System.out.print("Primera nota:");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Segunda nota:");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Tercera nota:");
    double nota3 = Double.parseDouble(System.console().readLine());
    
    double notaFinal = ((nota1 + nota2 + nota3) /3);
    
    if ((nota1 >= 0) && (nota1 <= 10) &&
       (nota2 >= 0) && (nota2 <= 10) &&
       (nota3 >= 0) && (nota3 <= 10)) {
    
    
      System.out.printf("La nota media es: %.2f ", notaFinal );
    } else {
      System.out.println("Los datos introducidos no son correctos");
    }
  }
}
