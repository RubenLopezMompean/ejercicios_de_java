/**
 *Ejercicio 5
  Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
  convertir deberá estar almacenada en una variable.
 *
 * @author Rubén López Mompeán
 */

public class C02Ejercicio05 {
  public static void main(String[] args) {

    double euros;
    double pesetas;
    
    pesetas = 500;
    euros = pesetas * 0.006;
    
    System.out.println( pesetas + " pesetas son " + euros + " euros ");
  
  }
}
