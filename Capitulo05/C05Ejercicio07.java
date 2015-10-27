/**
 * Ejercicio 7
 * Realiza el control de acceso a una caja fuerte. La combinación será un número 
 * de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no 
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación” y
 * si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”. 
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 *
 * @author Rubén López Mompeán
 */
public class C05Ejercicio07 {
  public static void main(String[] args) {
    
    int clave;
    int intento = 4;
      
    do {
      System.out.print("Introduzca la clave de 4 dígitos, tienes " + intento + " intento/s: ");
      clave = Integer.parseInt(System.console().readLine());
      intento--;
      
      if ((clave < 1000) || (clave > 9999)) {
        System.out.println("La clave es de 4 cifras. Inténtelo de nuevo");
        intento ++;
      }
      
      if (clave == 5555) {
        System.out.println("Enhorabuena, has abierto la caja fuerte.");
        break;
      } else {
        System.out.println("Lo siento, contraseña incorrecta.");
      }
    } while (intento > 0); 
  }
 }


