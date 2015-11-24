  /**
 * Ejercicio 3
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la 
 * baraja de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 * 
 * @author Rubén López Mompeán
 */
public class C06Ejercicio3 {
  public static void main(String[] args) {
    
    System.out.println("Este programa saca una carta de la baraja española al azar.");
    
    System.out.println("Se saca una carta.");
    String figura = " ";
    String palo = " ";
    int figuraNumero = (int)(Math.random()*(10)) + 1;
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
        figura = String.valueOf(figuraNumero);
        break;
      case 8:
        figura = "Sota";
        break;
      case 9:
        figura = "Caballo";
        break;
      case 10:
        figura = "Rey";
      default:
    }
    switch (clasePalo) {
      case 1:
        palo = "oros";
        break;
      case 2:
        palo = "bastos";
        break;
      case 3:
        palo = "copas";
        break;
      case 4:
        palo = "espadas";
      default:
    }
    System.out.println("La carta sacada es el " + figura + " de " + palo +".");
  }
}
    

    
    
    

