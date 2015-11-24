  /**
 * Ejercicio 8
 * Modifica el programa anterior para que la probabilidad de que salga un 1 sea 
 * de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que 
 * salga 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
 * 
 * @author Rubén López Mompeán
 */
public class C06Ejercicio8 {
  public static void main(String[] args) {
    
    System.out.println("Este programa muestra tres apuesta de la quiniela.\n");

    int numero;
    int columna;
    
    for (int i = 1; i <= 15; i++) {
      System.out.printf("%4d.  ",i);
      

      for (columna = 1; columna <= 3; columna++) {
        numero = (int)(Math.random()*6) + 1;
        switch (numero) {
          case 1:
          case 2:
          case 3:
            System.out.print("1    |");
            break;
          case 4:
            System.out.print("    2|");
            break;
          case 5:
          case 6:
            System.out.print("  X  |");
          default:
        }
              
      }
      
        System.out.println();
    }
  }
}
