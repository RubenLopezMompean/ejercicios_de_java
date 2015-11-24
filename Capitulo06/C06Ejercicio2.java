  /**
 * Ejercicio 2
 * Realiza un programa que muestre al azar el nombre de una carta de la baraja 
 * francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes 
 * y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son 
 * numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el 1). 
 * Para convertir un número en una cadena de caracteres podemos usar String.valueOf(n) .
 * 
 * @author Rubén López Mompeán
 */
public class C06Ejercicio2 {
  public static void main(String[] args) {
    
    System.out.println("Este programa saca una carta de la baraja francesa al azar.");
    
    String figura = " ";
    String palo = " ";
    int figuraNumero = (int)(Math.random()*(13)) + 1;
    int clasePalo = (int)(Math.random()*(4)) + 1;
    
    switch (figuraNumero) {
      case 1:
        figura = "As";
        break;
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
        figura = String.valueOf(figuraNumero);
        break;
      case 11:
        figura = "J";
        break;
      case 12:
        figura = "Q"; 
        break;
      case 13:
        figura = "K";
      default:
    }
    switch (clasePalo) {
      case 1:
        palo = "corazones";
        break;
      case 2:
        palo = "picas";
        break;
      case 3:
        palo = "trébol";
        break;
      case 4:
        palo = "rombos";
      default:
    }
    System.out.println("La carta sacada es " + figura + " de " + palo +".");
  }
}
    

    
    
    

