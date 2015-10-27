  /**
 * Ejercicio 11
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de 
 * los 5 primeros números enteros a partir de uno que se introduce por teclado.
 *
 * @author Rubén López Mompeán
 */
public class C05Ejercicio11 {
  public static void main(String[] args) {

    System.out.print("Este programa calcula el cuadrado y el cubo de los 5 ");
    System.out.println("primeros números enteros a partir del introducido.");
    
    System.out.print("\nIntroduce un número: ");
    int nIntroducido = Integer.parseInt(System.console().readLine());
    
    System.out.println("    n          n²          n³"); 
    System.out.println("----------------------------------");
    for (int x = nIntroducido; x < nIntroducido + 5; x++) {
      //System.out.printf("\n%5d |%10d |%10d", x, x *x, x * x * x);
      System.out.printf("\n%5d |%10d |%10d", x , (int)Math.pow(x, 2), (int)Math.pow(x, 3));
    } 
  }
}


