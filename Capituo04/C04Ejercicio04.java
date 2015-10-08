/**
 * Ejercicio 4
 *Vamos a ampliar uno de los ejercicios de la relación anterior para considerar las horas
 *extras. Escribe un programa que calcule el salario semanal de un trabajador teniendo en
 *cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora.
 *A partir de la hora 41, se pagan a 16 euros la hora.
 *
 * @author Rubén López Mompeán
 */

public class C04Ejercicio04 {
	public static void main(String[] args) { 	
   
    String linea;
  
    int sueldoTotal;
    
    System.out.print("Horas trabajadas: ");
    linea = System.console().readLine();
    int horasTrabajadas = Integer.parseInt( linea );
    
    if (horasTrabajadas < 40) {
     sueldoTotal = horasTrabajadas * 12;
    } else {
      sueldoTotal = (40 * 12) + ((horasTrabajadas - 40) * 16); 
    }
    System.out.print("TOTAl: ");
    System.out.println(sueldoTotal + " euros  ");
  } 
}
