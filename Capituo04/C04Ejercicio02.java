/**
 * Ejercicio 2
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos 
 * días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos 
 * de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta 
 * las horas, los minutos no se deben introducir por teclado.
 *
 * @author Rubén López Mompeán
 */

public class C04Ejercicio02 {
	public static void main(String[] args) { 	
    
    System.out.print("¿Qué hora es?");
    String line = System.console().readLine();
    int hora = Integer.parseInt(line);

    if ((hora >= 6) && (hora <=12)) {
      System.out.println("Buenos días");
     }   
    if ((hora >=13) && (hora <=20)) {
      System.out.println("Buenas tardes");
     }
    if ((hora >=21) && (hora <=5)) {
      System.out.println("Buenas noches");
     }
	}
}
