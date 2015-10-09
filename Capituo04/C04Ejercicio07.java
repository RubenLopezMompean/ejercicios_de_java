/**
 * Ejercicio 7
 * Realiza un programa que calcule la media de tres notas.
 *
 * @author Rubén López Mompeán
 */

public class C04Ejercicio07 {
  
	public static void main(String[] args) { 	
    
    System.out.println("Programa que calcula la media de tres notas");
    
    System.out.print("Primer número:");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Segundo número:");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Tercer número:");
    double nota3 = Double.parseDouble(System.console().readLine());
    
    double notaFinal = ((nota1 + nota2 + nota3) /3);
    
    System.out.print("La nota media es " + notaFinal );
  }
}
