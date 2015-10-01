/**
*Ejercicio 6
 Escribe un programa que calcule el área de un triángulo.
*
* @author Rubén López Mompeán
*/

public class C03Ejercicio06 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Introduce base del triángulo: ");
    linea = System.console().readLine();
    int base;
    base = Integer.parseInt( linea );

    System.out.print("introduce altura del triángulo: ");
    linea = System.console().readLine();
    int altura;
    altura = Integer.parseInt( linea );

    int area;
    area = (base * altura) / 2;
    
    System.out.println("Base del triángulo: " + base);
    System.out.println("Altura del triángulo: " + altura);
    System.out.print("Área del triángulo: ");
    System.out.println(area);

  } 
}
