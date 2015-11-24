  /**
 * Ejercicio 21
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un numero
 * negativo y nos diga cuantos números se han introducido, la media de los impares 
 * y el mayor de los pares. El número negativo sólo se utiliza para indicar el 
 * final de la introducción de datos pero no se incluye en el cómputo.
 *
 * @author Rubén López Mompeán
 */
public class C05Ejercicio21 {
  public static void main(String[] args) {
    
    int n;
    int cantidad = 0 - 1;
    int mPar = 0;
    int impar = 0;
    int tImpar = 0;
    
    System.out.println("Introduce números, termina introduciendo un número negativo. ");
          
    do {
      n = Integer.parseInt(System.console().readLine());
      cantidad++;
      if ((n % 2) == 1) {
        tImpar = tImpar + n;
        impar++;
      } else {
        if (n > mPar) 
          mPar = n;
        }
      
    } while ( n >= 0);
        System.out.println("Has introducido " + cantidad + " número/s.");
        System.out.print("Hay " + impar + " número/s impar/es ");
        System.out.println(" y su media es " + tImpar / impar + " .");
        System.out.println("Número par mayor es " + mPar + " .");
  }
}
