/**
 * Ejercicio 20
 * Realiza un programa que diga si un número entero positivo introducido por 
 * teclado es capicúa. Se permiten números de hasta 5 cifras.
 *
 * @author Rubén López Mompeán
 */

public class C04Ejercicio20 {
  
  public static void main (String[] args){
   
    System.out.println("Este programa dice si un número es o no capicúa.");
    System.out.print("Introduzca un número de hasta 5 cifras como máximo: ");
    int num = Integer.parseInt(System.console().readLine());
    
    if (num < 10) {                           //Número de 1 cifra
      System.out.print("Número capicúa ");
    }
    if ((num > 10) && (num < 100)) {          //Número con 2 cifras
      if ((num / 10) == (num % 10)) {
        System.out.print("Número capicúa ");
      } else {
        System.out.print("Este número no es capicúa ");
      }
    }
    if ((num > 100) && (num < 1000)) {        //Número con 3 cifras
      if ((num /100) == (num % 10)) {
        System.out.print("Número capicúa ");
      } else {
        System.out.print("Este número no es capicúa ");
      }
    }
    if ((num > 1000) && (num < 10000)) {      //Número con 4 cifras
      if (((num / 1000) == (num % 10)) && ((( num / 100 ) % 10)== (( num / 10) % 10)))  {
        System.out.print("Número capicúa ");
      } else {
        System.out.print("Este número no es capicúa ");
      }
    }
    if ((num > 10000) && (num < 100000)) {    //Número con 5 cifras
      if ((num / 10000) == (num % 10) && (((num / 1000) % 10)== ((num / 10) % 10))) {
        System.out.print("Número capicúa ");
      } else {
        System.out.print("Este número no es capicúa ");
      }
    }
    if (num >= 100000) {
      System.out.print("Este número es demasiado largo");
    }
  }
}
