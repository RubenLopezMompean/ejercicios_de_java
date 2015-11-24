  /**
 * Ejercicio 6
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario 
 * debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento 
 * fallido, el programa dirá cuántas oportunidades quedan y si el número introducido 
 * es menor o mayor que el número secreto.
 * 
 * @author Rubén López Mompeán
 */
public class C06Ejercicio6 {
  public static void main(String[] args) {
    
    System.out.print("Este programa muestra un número aleatorio entre 0 y 100.");
    System.out.println(" Tienes 5 intentos para adivinar el número.");

    int numero = (int)(Math.random()* (101));
    int numeroIntroducido;
    int i = 5;
    do {

      System.out.print("Introduce un número: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      if (numeroIntroducido > 100) {
        System.out.println("El número introducido no es válido. Prueba otra vez.");
        i++;
      }
      if (numeroIntroducido < 0) {
        System.out.println("El número introducido no es válido. Prueba otra vez.");
        i++;
      } 
      if (numeroIntroducido == numero) {
        System.out.println("Enhorabuena, has acertado.");
        break;
      }
      if ((numeroIntroducido < numero) && (numeroIntroducido >= 0)) {
        System.out.println("Fallaste, el número es mayor. Prueba otra vez.");
      }
      if ((numeroIntroducido > numero) && (numeroIntroducido <= 199)) {
        System.out.println("Fallaste, el número es menor. Prueba otra vez.");
      }
      i--;
      System.out.println("Quedan " + i + " intentos");
    } while (i > 0);
    System.out.print("Lo siento, te quedastes sin intentos. ");
    System.out.println(" El número correcto era el " + numero + ".");
  }
}

