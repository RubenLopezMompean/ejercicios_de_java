  /**
 * Ejercicio 25
 * Realiza un programa que pida un número por teclado y que luego muestre ese 
 * número al revés.
 *
 * @author Rubén López Mompeán
 */
public class C05Ejercicio25 {
  public static void main(String[] args) {

    System.out.println("Escribe un número y se pondrá del reves. ");
    int reves = 0;
    int n = Integer.parseInt(System.console().readLine());
    int nIntroducido = n;
    do {
      reves = (reves * 10) + (nIntroducido % 10);
      nIntroducido = nIntroducido / 10;
      
    } while (nIntroducido > 0);
    
    System.out.println("El número al reves es " + reves);

  }
}
