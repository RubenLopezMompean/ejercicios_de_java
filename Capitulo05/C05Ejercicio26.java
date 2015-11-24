  /**
 * Ejercicio 26
 * Realiza un programa que pida primero un número y a continuación un dígito. El 
 * programa nos debe dar la posición (o posiciones) contando de izquierda a 
 * derecha que ocupa ese dígito en el número introducido.
 *
 * @author Rubén López Mompeán
 */
public class C05Ejercicio26 {
  public static void main(String[] args) {

    
    System.out.print("Introduzca un número entero: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca un dígito: ");
    int digito = Integer.parseInt(System.console().readLine());

    System.out.print("Contando de izquierda a derecha, el " + digito + " aparece ");
    System.out.print("dentro de " + numeroIntroducido + " en las siguientes posiciones: ");
    
    int numero = numeroIntroducido;
    int volteado = 0;
    int longitud = 0;
    int posicion = 1;
    
    if (numero == 0) {
      longitud = 1;
    }
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero = numero / 10;
      longitud++;
    }
    // comprueba la posición
    while (volteado > 0) {
      if ((volteado % 10) == digito) {
        System.out.print(posicion + " ");
      }
      volteado = volteado / 10;
      posicion++;
    }
    System.out.println();
  }
}
