  /**
 * Ejercicio 1
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar 
 * también la suma total (los puntos que suman entre los tres dados).
 * 
 * @author Rubén López Mompeán
 */
public class C06Ejercicio1 {
  public static void main(String[] args) {
    
    System.out.println("Este programa muestra la tirada de 3 dados y su suma");
    
    System.out.println("Se lanza los tres dados.");
    int dado;
    int suma = 0;
    for (int i = 0; i < 3; i++) {
     dado = (int)(Math.random()*(6-1+1))+1;
     System.out.print(dado + " ");
      suma = suma + dado;
    }
    System.out.println("\nLa suma de los dados es " + suma + ".");
  }
}
    

    
    
    

