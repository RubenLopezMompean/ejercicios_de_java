/**
 * Ejercicio 10
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de 
 * nacimiento.
 *
 * @author Rubén López Mompeán
 */

public class C04Ejercicio10 {
  
 public static void main (String[] args){
    System.out.println("Vamos a conocer que horóscopo eres ");
    
    System.out.print("Introduzca el mes en el que naciste ");
    int mes = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el día en el que naciste ");
    int dia = Integer.parseInt(System.console().readLine());
    
    //hacer con el switch y en cada case meter un if
    if ((mes >= 9) && (mes <= 21)) {
    System.out.print("Libra");
  }
  }
}
