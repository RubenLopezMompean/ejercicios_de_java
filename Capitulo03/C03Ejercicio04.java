/**
*Ejercicio 4
 Escribe un programa que sume, reste, multiplique y divida dos números
 introducidos por teclado.
*
* @author Rubén López Mompeán
*/

public class C03Ejercicio04 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce un número: ");
    linea = System.console().readLine();
    int primerNumero;
    primerNumero = Integer.parseInt( linea );

    System.out.print("introduce otro, por favor: ");
    linea = System.console().readLine();
    int segundoNumero;
    segundoNumero = Integer.parseInt( linea );

    int suma;
    suma = primerNumero + segundoNumero;
    
    int resta;
    resta = primerNumero - segundoNumero;
    
    int multiplicacion;
    multiplicacion = primerNumero * segundoNumero;
    
    int division;
    division = primerNumero / segundoNumero;
    
    System.out.print("El primer número introducido es " + primerNumero);
    System.out.println(" y el segundo es " + segundoNumero);
    System.out.print("El resultado de la suma es ");
    System.out.println(suma);
    System.out.print("El resultado de la resta es ");
    System.out.println(resta);
    System.out.print("El resultado de la multiplicación es ");
    System.out.println(multiplicacion);
    System.out.print("El resultado de la división es ");
    System.out.println(division);   
  } 
}
