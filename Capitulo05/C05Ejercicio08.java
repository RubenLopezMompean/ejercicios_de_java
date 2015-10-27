/**
 * Ejercicio 8
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 *
 * @author Rubén López Mompeán
 */
public class C05Ejercicio08 {
  public static void main(String[] args) {
    
    System.out.print("¿Qué tabla de multiplicar quieres saber? ");
    int numTabla = Integer.parseInt(System.console().readLine());
      
    for ( int i = 0; i <= 10; i++) {
    //System.out.println( numTabla + "x" + i +  " = " +  numTabla * i);
      System.out.printf("%6d x %2d = %8d\n", numTabla, i, (numTabla * i));
    }
  }
}


