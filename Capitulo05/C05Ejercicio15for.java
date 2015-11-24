  /**
 * Ejercicio 15
 * Escribe un programa que dados dos números, uno real (base) y un entero 
 * positivo (exponente), saque por pantalla todas las potencias con base el 
 * numero dado y exponentes entre uno y el exponente introducido. No se deben 
 * utilizar funciones de exponenciación. Por ejemplo, si introducimos 
 * el 2 y el 5, se deberán mostrar 2 1 , 2 2 , 2 3 , 2 4 y 2 5 .
 *
 * @author Rubén López Mompeán
 */
public class C05Ejercicio15 {
  public static void main(String[] args) {
    
    System.out.print("Este programa realiza el cálculo de una potencia tantas");
    System.out.println(" veces como sea el valor del exponente.");
    
    System.out.print("\nIntroduzca la base: ");
    double base = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca el exponente: ");
    double exponente = Double.parseDouble(System.console().readLine());

    double potencia;
    double exp;
        
    for (double i = 1; i <= exponente; i++) {
        exp = i;
        potencia = 1;
        for (double j = 0; j < exp; j++) {
          potencia *= base;
        }
      System.out.printf("\n%2.2f ^ %2.2f = %8.2f ", base , i , potencia);
    }
  }
}
