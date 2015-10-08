/**
*Ejercicio 9
 Escribe un programa que calcule el volumen de un cono según la fórmula 
 V = 1/3 πr2 h
*
* @author Rubén López Mompeán
*/

public class C03Ejercicio09 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Radio del cono: ");
    linea = System.console().readLine();
    double radio = Double.parseDouble( linea );

    System.out.print("Altura del cono: ");
    linea = System.console().readLine();
    double altura = Double.parseDouble( linea );

    double volumen = ((1.0 / 3.0) * 3.14 * radio * radio * altura) ;
    
    System.out.print("Volumen: ");
    System.out.println(volumen + " litros  ");

  } 
}
