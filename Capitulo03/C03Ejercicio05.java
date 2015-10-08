/**
*Ejercicio 5
 Escribe un programa que calcule el área de un rectángulo.
*
* @author Rubén López Mompeán
*/

public class C03Ejercicio05 {
  public static void main(String[] args) {

    String linea;
    
    System.out.println("AREA DEL RECTANGULO");
    System.out.print("Introduce base del rectángulo: ");
    linea = System.console().readLine();
    int base;
    base = Integer.parseInt( linea );

    System.out.print("Introduce altura del rectángulo: ");
    linea = System.console().readLine();
    int altura;
    altura = Integer.parseInt( linea );

    int area;
    area = base * altura;
    
    System.out.println("Base del rectángulo: " + base);
    System.out.println("Altura del rectángulo: " + altura);
    System.out.print("Área del rectángulo: ");
    System.out.println(area);

  } 
}
