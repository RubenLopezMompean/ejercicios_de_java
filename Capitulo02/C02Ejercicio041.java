/**
 *Ejercicio 4
  Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere 
  convertir deberá estar almacenada en una variable.
 *
 * @author Rubén López Mompeán
 */

public class C02Ejercicio041 {
  public static void main(String[] args) {

    double euros;
    int pesetas;
    
    euros = 30;
    pesetas = (int)(euros * 166.386);
    
    //System.out.println( euros + " euros son " + pesetas + " pesetas ");
    System.out.printf( "%.2f euros son %d pesetas ", euros, pesetas);
  
  }
}
