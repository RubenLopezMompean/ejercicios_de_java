/**
*Ejercicio 8
 Escribe un programa que calcule el salario semanal de un empleado en base a las
 horas trabajadas, a razón de 12 euros la hora.
*
* @author Rubén López Mompeán
*/

public class C03Ejercicio08 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Horas trabajadas: ");
    linea = System.console().readLine();
    int horas = Integer.parseInt( linea );

    int total = horas * 12;
    
    System.out.print("TOTAl: ");
    System.out.println(total + " euros  ");

  } 
}
