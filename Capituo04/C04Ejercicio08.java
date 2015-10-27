/**
 * Ejercicio 8
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 * suficiente, bien, notable o sobresaliente).
 *
 * @author Rubén López Mompeán
 */

public class C04Ejercicio08 {
  
	public static void main(String[] args) { 	
    
    System.out.println("Programa que calcula la media de tres notas");
    
    System.out.print("Primer número:");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Segundo número:");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Tercer número:");
    double nota3 = Double.parseDouble(System.console().readLine());
    
    double notaFinal = ((nota1 + nota2 + nota3) /3);
     if ((nota1 >= 0) && (nota1 <= 10) &&
       (nota2 >= 0) && (nota2 <= 10) &&
       (nota3 >= 0) && (nota3 <= 10)) {
    System.out.printf("La nota media es %.2f" , notaFinal );
      } else {
      System.out.println("Los datos introducidos no son correctos");
    }
    
    if (notaFinal < 5 ) {
      System.out.print(" Suspenso");
    }
    if (notaFinal == 5 ) {
      System.out.print(" Insuficiente");
    }
    if ((notaFinal >= 6)  && (notaFinal < 7)){
      System.out.print(" Bien");
    }
    if ((notaFinal >= 7) && (notaFinal <= 8)) {
      System.out.print(" Notable");
    }
    if ((notaFinal >= 9) && (notaFinal <= 10)) {
      System.out.print(" Sobresaliente");
    }
  }
}
