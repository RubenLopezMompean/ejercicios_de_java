  /**
 * Ejercicio 14
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. 
 * El programa intentará adivinar el número que estás pensando - un número entre 
 * 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el 
 * programa debe preguntar si el número que estás pensando es mayor o menor que 
 * el que te acaba de decir.
 * 
 * @author Rubén López Mompeán
 */
public class C06Ejercicio14 {
  public static void main(String[] args) {
    
    System.out.print("Este programa debe adivinar un número entre 0 y 100.");
    System.out.println(" Piensa en un número.\n");

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

