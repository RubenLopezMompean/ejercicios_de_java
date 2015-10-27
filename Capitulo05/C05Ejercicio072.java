/**
 * Ejercicio 4
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás 
 * utilizando un bucle for .
 *
 * @author Rubén López Mompeán
 */
public class C05Ejercicio072 {
  public static void main(String[] args) {
    
    int clave;
    int intento = 4;
      
    do {
      System.out.print("Introduzca la clave de 4 dígitos, tienes " + intento + " intentos: ");
      clave = Integer.parseInt(System.console().readLine());
      intento--;
            
      if (clave == 5378) {
        System.out.println("Enhorabuena, has abierto la caja fuerte.");
        break;
      } else {
        System.out.println("Lo siento, contraseña incorrecta.");
      }
    } while (intento > 0); 
  }
 }


