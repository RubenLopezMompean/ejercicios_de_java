  /**
 * Ejercicio 7
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas 
 * para los 14 partidos y el pleno al quince (15 filas).
 * 
 * @author Rubén López Mompeán
 */
public class C06Ejercicio7 {
  public static void main(String[] args) {
    
    System.out.println("Este programa muestra tres apuesta de la quiniela.\n");

    int numero;
    int columna;
    
    for (int i = 1; i <= 14; i++) {
      System.out.printf("%4d.  ",i);
      

      for (columna = 1; columna <= 3; columna++) {
        numero = (int)(Math.random()*3) + 1;
        switch (numero) {
          case 1:
            System.out.print("1    |");
            break;
          case 2:
            System.out.print("    2|");
            break;
          case 3:
            System.out.print("  X  |");
          default:
        }

      }
      
        System.out.println();
    }
    //Pleno al 15
    for (columna = 1; columna <= 1; columna++) {
        numero = (int)(Math.random()*3) + 1;
        System.out.println("\nPLENO AL  15");
                  System.out.print("  15.  ");

        switch (numero) {
          case 1:
            System.out.print("1    |");
            break;
          case 2:
            System.out.print("    2|");
            break;
          case 3:
            System.out.print("  X  |");
          default:
        }
      
        System.out.println();
  }
}
}
