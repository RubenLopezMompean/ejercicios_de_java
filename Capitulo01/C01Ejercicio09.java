/**
 * Muestra por pantalla la frase "¡Hola mundo!"
 *
 * @author Luis J. Sánchez
 */

public class C01Ejercicio09 { // Clase principal
  public static void main(String[] args) {
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";
    
    System.out.println(blanco + "           * *");
    System.out.println(blanco + "         *    *");
    System.out.println(blanco + "       *        *");
    System.out.println(blanco + "     *            *");
    System.out.println(blanco + "     **************");
    System.out.println(blanco + "     *            *");
    System.out.println(blanco + "     *  #      #  *");
    System.out.println(blanco + "     *            *          _");
    System.out.println(blanco + "     * #  ____  # *       <´/|\\´>");
    System.out.println(blanco + "     *    |  |    *          |");
    System.out.println(blanco + "     *    |  |    *          |");
    System.out.println(blanco + "********************************");
    
  }
}
