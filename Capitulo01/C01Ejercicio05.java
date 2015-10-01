/**
 * Muestra por pantalla la frase "¡Hola mundo!"
 *
 * @author Luis J. Sánchez
 */

public class C01Ejercicio05 { // Clase principal
  public static void main(String[] args) {
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";
    
    System.out.println(blanco + "8:15 - 9:15" + verde + "\tFOL" + rojo + "\tPROG" + morado + "\tSIN" + rojo + "\tPROG" + naranja + "\tBBDD");
    System.out.println(blanco + "9:15 - 10:15" + verde + "\tFOL" + rojo + "\tPROG" + morado + "\tSIN" + rojo + "\tPROG" + naranja + "\tBBDD");
    System.out.println(blanco + "10:15 - 11:15" + verde + "\tFOL" + rojo + "\tPROG" + morado + "\tSIN" + rojo + "\tPROG" + naranja + "\tBBDD");
    System.out.println(blanco + "11:15 - 11-45\tR\tE\tCR\tE\tO");
    System.out.println(blanco + "11:45 - 12:40" + rojo + "\tPROG" + rojo + "\tPROG" + morado + "\tSIN" + azul + "\tED" + rojo + "\tPROG");
    System.out.println(blanco + "12:40 - 13:35" + azul + "\tED" + naranja + "\tBBDD" + blanco + "\tLM" + blanco + "\tLM" + morado + "\tSIN");
    System.out.println(blanco + "13:35 - 14:30" + azul + "\tED" + naranja + "\tBBDD" + blanco + "\tLM" + blanco + "\tLM" + morado + "\tSIN");
  }
}
